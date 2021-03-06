/*
 * ClassifierResultDialog.java
 *
 * Created on November 27, 2008, 1:08 PM
 */

package cytoplasmstaining;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import tmarker.FileChooser;

/**
 * This is the result dialog of a sample classifier. Here, pictures are shown that illustrate the classification (e.g. the hierarchical 
 * clustering tree).
 * @author Peter Schueffler
 */
public class ClassifierResultDialog extends javax.swing.JDialog {
    
    private HierarchicalClassifier hc = null;
    private double scale = 1;
    private boolean colored = true;
    private int mode = HierarchicalClassifier.AVERAGE_LINKAGE;
    
    /** Creates new form ClassifierResultDialog */
    public ClassifierResultDialog(HierarchicalClassifier hc, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.hc = hc;
        initComponents();
        displayResults();
        jButton2.requestFocus();
        setVisible(true);
    }
    
    /**
     * Returns the corresponding hierarchical classifier.
     * @return The hierarchical classifier from this resultFrame.
     */
    public HierarchicalClassifier getClassifier() {
        return hc;
    }
    
    /**
     * Returns the recently used scale for the image.
     * @return The recently used scale for the image.
     */
    private double getScale() {
        return scale;
    }
    
    /**
     * Sets the recently used scale for the image.
     * @param scale The recently used scale for the image.
     */
    private void setScale(double scale) {
        this.scale = scale;
    }
    
    /**
     * Returns whether the image should be colored.
     * @return True, if the image should be colored.
     */
    private boolean getColored() {
        return colored;
    }
    
    /**
     * Sets whether the image should be colored.
     * @param colored True, if the image should be colored.
     */
    private void setColored(boolean colored) {
        this.colored = colored;
    }
    
    /**
     * Returns the recently used mode for the image.
     * @return The recently used mode for the image.
     * One of HierarchicalClassifier.AVERAGE_LINKAGE, SINGLE_LINKAGE or COMPLETE_LINKAGE.
     */
    private int getMode() {
        return mode;
    }
    
    /**
     * Sets the recently used mode for the image.
     * @param mode The recently used mode for the image. 
     * One of HierarchicalClassifier.AVERAGE_LINKAGE, SINGLE_LINKAGE or COMPLETE_LINKAGE.
     */
    private void setMode(int mode) {
        this.mode = mode;
    }
    
    /**
     * Refreshes the image of the classifier.
     */
    private void displayResults() {
        jLabel1.setIcon(getClassifier().getClassifierImage(getScale(), getMode(), getColored()));
        updateTitle();
        pack();
        //setLocationRelativeTo(getClassifier().getCenter().getFrontendFrame());
    }
    
    /**
     * Updates the title of the ClassifierResultFrame according to the mode. 
     */
    private void updateTitle() {
        String title = "Hierarchical clustering"; 
        switch (getMode()) {
            case HierarchicalClassifier.AVERAGE_LINKAGE : title += " - Average Linkage"; break;
            case HierarchicalClassifier.COMPLETE_LINKAGE : title += " - Complete Linkage"; break;
            case HierarchicalClassifier.SINGLE_LINKAGE : title += " - Single Linkage"; break;
            default : ;
        }
        setTitle(title);
    }
    
    /**
     * Saves the classifier image as png.
     * @param file The file where the image is saved.
     */
    private void saveAsPNG(File file) {
        if (file != null && jLabel1.getIcon()!=null) {
            try {
                // save unscaled picture to disk
                BufferedImage bi = new BufferedImage(jLabel1.getIcon().getIconWidth(), jLabel1.getIcon().getIconHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g = bi.createGraphics();
                g.drawImage(((ImageIcon) jLabel1.getIcon()).getImage(), 0, 0, null);
                ImageIO.write(bi, "png", file);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Save as...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("color");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 25, 0, 0);
        jPanel2.add(jRadioButton1, gridBagConstraints);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("black/white");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel2.add(jRadioButton2, gridBagConstraints);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("average linkage");
        jRadioButton3.setToolTipText("The distance of two clusters is the average distance of each element from the one cluster to each element of the other cluster.");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 4, 0, 0);
        jPanel2.add(jRadioButton3, gridBagConstraints);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("single linkage");
        jRadioButton4.setToolTipText("The distance of two clusters is the minimum distance of an element from the one cluster to an element of the other cluster.");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        jPanel2.add(jRadioButton4, gridBagConstraints);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("complete linkage");
        jRadioButton5.setToolTipText("The distance of two clusters is the maximum distance of an element from the one cluster to an element of the other cluster.");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        jPanel2.add(jRadioButton5, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton2.setText("OK");
        jButton2.setToolTipText("Overtake this clustering.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<String> extensions = new ArrayList();
        extensions.add(".PNG");
        List<String> descriptions = new ArrayList();
        descriptions.add("PNG Image File");
        
        File file = FileChooser.chooseSavingFile(null, ".", "dendrogram.png", extensions, descriptions);
        if (file!=null) {
            saveAsPNG(file);
            //getClassifier().getCenter().getFrontendFrame().setCurrentDir(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        setColored(true);
        jLabel1.setIcon(getClassifier().getClassifierImage(getScale(), getMode(), getColored()));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        setColored(false);
        jLabel1.setIcon(getClassifier().getClassifierImage(getScale(), getMode(), getColored()));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        setMode(HierarchicalClassifier.AVERAGE_LINKAGE);
        getClassifier().doClustering(getMode(), false);
        jLabel1.setIcon(getClassifier().getClassifierImage(getScale(), getMode(), getColored()));
        updateTitle();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        setMode(HierarchicalClassifier.SINGLE_LINKAGE);
        getClassifier().doClustering(getMode(), false);
        jLabel1.setIcon(getClassifier().getClassifierImage(getScale(), getMode(), getColored()));
        updateTitle();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        setMode(HierarchicalClassifier.COMPLETE_LINKAGE);
        getClassifier().doClustering(getMode(), false);
        jLabel1.setIcon(getClassifier().getClassifierImage(getScale(), getMode(), getColored()));
        updateTitle();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        //hc.getCenter().getFrontendFrame().updateSummary();
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    // End of variables declaration//GEN-END:variables
    
}
