/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cancernucleusclassification;

import java.awt.Cursor;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Level;
import java.util.logging.Logger;
import plugins.TMARKERPluginManager;
import tmarker.TMAspot.TMAspot;
import tmarker.tmarker;
import weka.classifiers.Classifier;

/**
 *
 * @author Peter J. Schueffler
 */
public class CancerNucleusClassificationThread extends Thread {    
    
    TMARKERPluginManager tpm;
    CancerNucleusClassification cnc;
    List<TMAspot> aTMAspots;
    Classifier detector;
    Classifier classifier;
    boolean twoStepClassification;
    boolean respectROI;
    public boolean continu = true;
    
    /**
     * Performs the staining estimation of all given TMAspots in a separate thread.
     * @param tpm The TMARKERPluginManager with access to the main program.
     * @param cnc The CancerNucleusClassification instance.
     * @param aTMAspots The TMAspots to be processed.
     * @param detector The detector used (1. classifier in 2-step classification). Can be null (then, 1-step classification is done).
     * @param classifier The classifier used.
     * @param twoStepClassification If true and detector not null, a 2-step classification is tried (1: nucleus/background classification, 2: malignant/benign nucleus classification).
     * @param respectROI If true, only nuclei in including or outside excluding ROI are classified (or all nuclei if there is no ROI). If false, all nuclei are classified.
     */
    public CancerNucleusClassificationThread(TMARKERPluginManager tpm, CancerNucleusClassification cnc, List<TMAspot> aTMAspots, Classifier detector, Classifier classifier, boolean twoStepClassification, boolean respectROI) {
        this.tpm = tpm;
        this.cnc = cnc;
        this.aTMAspots = aTMAspots;
        this.detector = detector;
        this.classifier = classifier;
        this.twoStepClassification = twoStepClassification;
        this.respectROI = respectROI;
    }
    
    @Override
    public void run() {
        try{ 
            cnc.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            
            int[] progress_container = new int[]{1};
            CancerNucleusClassificationFork fb = new CancerNucleusClassificationFork(tpm, cnc, aTMAspots, detector, classifier, twoStepClassification, respectROI, 0, aTMAspots.size(), tpm.useParallelProgramming(), progress_container);

            ForkJoinPool pool = new ForkJoinPool();

            long startTime = System.currentTimeMillis();
            pool.invoke(fb);
            long endTime = System.currentTimeMillis();
            pool.shutdown();

            cnc.setProgressNumber(0, 0, 0);

            System.out.println("CancerNucleusClassification_Fork took " + (endTime - startTime) + 
                    " milliseconds.");
            
            
            
            tpm.setStatusMessageLabel("Performing Cancer Nucleus Classification ... Done.");
            tpm.setProgressbar(0);
            cnc.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            continu = false;
            tpm.setStatusMessageLabel("Cancer Nucleus Classification Stopped."); tpm.setProgressbar(0);
            cnc.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            if (tmarker.DEBUG>0) {
                Logger.getLogger(CancerNucleusClassificationThread.class.getName()).log(Level.WARNING, e.getMessage(), e);
            }
        }
    }
}
