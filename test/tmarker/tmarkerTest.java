/*
 * Copyright (C) 2018 victoriaalers
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package tmarker;

import TMARKERPluginInterface.Pluggable;
import java.awt.Color;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tmarker.TMAspot.TMAspot;
import tmarker.TMAspot.TMAspot_summary_Dialog;

/**
 *
 * @author victoriaalers
 */
public class tmarkerTest {
    
    /**
     *
     */
    public tmarkerTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of splashTextAndProgress method, of class tmarker.
     */
    @Test
    public void testSplashTextAndProgress() {
        System.out.println("splashTextAndProgress");
        String str = "";
        int pct = 0;
        tmarker.splashTextAndProgress(str, pct);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTargetProperty method, of class tmarker.
     */
    @Test
    public void testGetTargetProperty() {
        System.out.println("getTargetProperty");
        tmarker instance = null;
        String expResult = "";
        String result = instance.getTargetProperty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTargetProperty method, of class tmarker.
     */
    @Test
    public void testSetTargetProperty() {
        System.out.println("setTargetProperty");
        String targetProperty = "";
        tmarker instance = null;
        instance.setTargetProperty(targetProperty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class tmarker.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        tmarker.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openWebsite method, of class tmarker.
     */
    @Test
    public void testOpenWebsite() {
        System.out.println("openWebsite");
        String url = "";
        tmarker.openWebsite(url);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doExit method, of class tmarker.
     */
    @Test
    public void testDoExit() {
        System.out.println("doExit");
        tmarker instance = null;
        instance.doExit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandom method, of class tmarker.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        tmarker instance = null;
        Random expResult = null;
        Random result = instance.getRandom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTMAspot method, of class tmarker.
     */
    @Test
    public void testAddTMAspot() {
        System.out.println("addTMAspot");
        TMAspot ts = null;
        tmarker instance = null;
        instance.addTMAspot(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTMATable method, of class tmarker.
     */
    @Test
    public void testUpdateTMATable_TMAspot() {
        System.out.println("updateTMATable");
        TMAspot ts = null;
        tmarker instance = null;
        instance.updateTMATable(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTMATable method, of class tmarker.
     */
    @Test
    public void testUpdateTMATable_TMAspot_boolean() {
        System.out.println("updateTMATable");
        TMAspot ts = null;
        boolean newspot = false;
        tmarker instance = null;
        instance.updateTMATable(ts, newspot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserInfo method, of class tmarker.
     */
    @Test
    public void testSetUserInfo() {
        System.out.println("setUserInfo");
        String text = "";
        tmarker instance = null;
        instance.setUserInfo(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateScrollPanel method, of class tmarker.
     */
    @Test
    public void testValidateScrollPanel() {
        System.out.println("validateScrollPanel");
        tmarker instance = null;
        instance.validateScrollPanel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnotationValues method, of class tmarker.
     */
    @Test
    public void testGetAnnotationValues() {
        System.out.println("getAnnotationValues");
        tmarker instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAnnotationValues();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnotationValues method, of class tmarker.
     */
    @Test
    public void testSetAnnotationValues() {
        System.out.println("setAnnotationValues");
        List<String> values = null;
        tmarker instance = null;
        instance.setAnnotationValues(values);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnotationProperties method, of class tmarker.
     */
    @Test
    public void testGetAnnotationProperties() {
        System.out.println("getAnnotationProperties");
        tmarker instance = null;
        List<String> expResult = null;
        List<String> result = instance.getAnnotationProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnnotationProperties method, of class tmarker.
     */
    @Test
    public void testSetAnnotationProperties() {
        System.out.println("setAnnotationProperties");
        List<String> annotation_props = null;
        tmarker instance = null;
        instance.setAnnotationProperties(annotation_props);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAspots method, of class tmarker.
     */
    @Test
    public void testGetTMAspots() {
        System.out.println("getTMAspots");
        tmarker instance = null;
        List<TMAspot> expResult = null;
        List<TMAspot> result = instance.getTMAspots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentDir method, of class tmarker.
     */
    @Test
    public void testSetCurrentDir() {
        System.out.println("setCurrentDir");
        String currentDir = "";
        tmarker instance = null;
        instance.setCurrentDir(currentDir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentDir method, of class tmarker.
     */
    @Test
    public void testGetCurrentDir() {
        System.out.println("getCurrentDir");
        tmarker instance = null;
        String expResult = "";
        String result = instance.getCurrentDir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOptionDialog method, of class tmarker.
     */
    @Test
    public void testGetOptionDialog() {
        System.out.println("getOptionDialog");
        tmarker instance = null;
        OptionDialog expResult = null;
        OptionDialog result = instance.getOptionDialog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoadFilesWithChooser method, of class tmarker.
     */
    @Test
    public void testLoadFilesWithChooser() {
        System.out.println("LoadFilesWithChooser");
        tmarker t = null;
        String currentDir_local = "";
        tmarker.LoadFilesWithChooser(t, currentDir_local);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DEBUG method, of class tmarker.
     */
    @Test
    public void testDEBUG() {
        System.out.println("DEBUG");
        tmarker instance = null;
        int expResult = 0;
        int result = instance.DEBUG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcceptedFiles method, of class tmarker.
     */
    @Test
    public void testGetAcceptedFiles() {
        System.out.println("getAcceptedFiles");
        Collection<String> expResult = null;
        Collection<String> result = tmarker.getAcceptedFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoadFiles method, of class tmarker.
     */
    @Test
    public void testLoadFiles() {
        System.out.println("LoadFiles");
        tmarker t = null;
        File[] filelist = null;
        tmarker.LoadFiles(t, filelist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAllTMAspots method, of class tmarker.
     */
    @Test
    public void testSelectAllTMAspots() {
        System.out.println("selectAllTMAspots");
        tmarker instance = null;
        instance.selectAllTMAspots();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectTMAspot method, of class tmarker.
     */
    @Test
    public void testSelectTMAspot() {
        System.out.println("selectTMAspot");
        TMAspot ts = null;
        tmarker instance = null;
        instance.selectTMAspot(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedTMAspots method, of class tmarker.
     */
    @Test
    public void testGetSelectedTMAspots_0args() {
        System.out.println("getSelectedTMAspots");
        tmarker instance = null;
        List<TMAspot> expResult = null;
        List<TMAspot> result = instance.getSelectedTMAspots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedTMAspots method, of class tmarker.
     */
    @Test
    public void testGetSelectedTMAspots_boolean() {
        System.out.println("getSelectedTMAspots");
        boolean verbose = false;
        tmarker instance = null;
        List<TMAspot> expResult = null;
        List<TMAspot> result = instance.getSelectedTMAspots(verbose);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisibleTMAspot method, of class tmarker.
     */
    @Test
    public void testGetVisibleTMAspot() {
        System.out.println("getVisibleTMAspot");
        tmarker instance = null;
        TMAspot expResult = null;
        TMAspot result = instance.getVisibleTMAspot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTMAspot method, of class tmarker.
     */
    @Test
    public void testRemoveTMAspot() {
        System.out.println("removeTMAspot");
        TMAspot ts = null;
        tmarker instance = null;
        instance.removeTMAspot(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTMAspots method, of class tmarker.
     */
    @Test
    public void testRemoveTMAspots() {
        System.out.println("removeTMAspots");
        List<TMAspot> tss = null;
        tmarker instance = null;
        instance.removeTMAspots(tss);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAList method, of class tmarker.
     */
    @Test
    public void testGetTMAList() {
        System.out.println("getTMAList");
        tmarker instance = null;
        JPanel expResult = null;
        JPanel result = instance.getTMAList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAListScrollPane method, of class tmarker.
     */
    @Test
    public void testGetTMAListScrollPane() {
        System.out.println("getTMAListScrollPane");
        tmarker instance = null;
        JScrollPane expResult = null;
        JScrollPane result = instance.getTMAListScrollPane();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performVoronoiSampling method, of class tmarker.
     */
    @Test
    public void testPerformVoronoiSampling() {
        System.out.println("performVoronoiSampling");
        tmarker instance = null;
        instance.performVoronoiSampling();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performBackgroundPointsFiltering method, of class tmarker.
     */
    @Test
    public void testPerformBackgroundPointsFiltering() {
        System.out.println("performBackgroundPointsFiltering");
        TMAspot ts = null;
        tmarker instance = null;
        instance.performBackgroundPointsFiltering(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAView method, of class tmarker.
     */
    @Test
    public void testGetTMAView() {
        System.out.println("getTMAView");
        tmarker instance = null;
        TMA_view_panel expResult = null;
        TMA_view_panel result = instance.getTMAView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspot method, of class tmarker.
     */
    @Test
    public void testShowTMAspot() {
        System.out.println("showTMAspot");
        TMAspot ts = null;
        tmarker instance = null;
        instance.showTMAspot(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspotPreview method, of class tmarker.
     */
    @Test
    public void testShowTMAspotPreview() {
        System.out.println("showTMAspotPreview");
        tmarker instance = null;
        instance.showTMAspotPreview();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspotLocalZoom method, of class tmarker.
     */
    @Test
    public void testShowTMAspotLocalZoom() {
        System.out.println("showTMAspotLocalZoom");
        int x = 0;
        int y = 0;
        tmarker instance = null;
        instance.showTMAspotLocalZoom(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspotLocalZoomOnPreview method, of class tmarker.
     */
    @Test
    public void testShowTMAspotLocalZoomOnPreview() {
        System.out.println("showTMAspotLocalZoomOnPreview");
        int x = 0;
        int y = 0;
        tmarker instance = null;
        instance.showTMAspotLocalZoomOnPreview(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProgressbar method, of class tmarker.
     */
    @Test
    public void testGetProgressbar() {
        System.out.println("getProgressbar");
        tmarker instance = null;
        JProgressBar expResult = null;
        JProgressBar result = instance.getProgressbar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgressbar method, of class tmarker.
     */
    @Test
    public void testSetProgressbar() {
        System.out.println("setProgressbar");
        int percentage = 0;
        tmarker instance = null;
        instance.setProgressbar(percentage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatusMessageLabel method, of class tmarker.
     */
    @Test
    public void testGetStatusMessageLabel() {
        System.out.println("getStatusMessageLabel");
        tmarker instance = null;
        JLabel expResult = null;
        JLabel result = instance.getStatusMessageLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusMessageLabel method, of class tmarker.
     */
    @Test
    public void testSetStatusMessageLabel() {
        System.out.println("setStatusMessageLabel");
        String text = "";
        tmarker instance = null;
        instance.setStatusMessageLabel(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelsColor method, of class tmarker.
     */
    @Test
    public void testGetLabelsColor() {
        System.out.println("getLabelsColor");
        byte labelType = 0;
        byte staining = 0;
        tmarker instance = null;
        Color expResult = null;
        Color result = instance.getLabelsColor(labelType, staining);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabelsColor method, of class tmarker.
     */
    @Test
    public void testSetLabelsColor() {
        System.out.println("setLabelsColor");
        byte labelType = 0;
        byte staining = 0;
        Color c = null;
        tmarker instance = null;
        instance.setLabelsColor(labelType, staining, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelsColorWOAlpha method, of class tmarker.
     */
    @Test
    public void testGetLabelsColorWOAlpha() {
        System.out.println("getLabelsColorWOAlpha");
        byte labelType = 0;
        byte staining = 0;
        tmarker instance = null;
        Color expResult = null;
        Color result = instance.getLabelsColorWOAlpha(labelType, staining);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAViewContainer method, of class tmarker.
     */
    @Test
    public void testGetTMAViewContainer() {
        System.out.println("getTMAViewContainer");
        tmarker instance = null;
        JScrollPane expResult = null;
        JScrollPane result = instance.getTMAViewContainer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState_ImagesLoaded method, of class tmarker.
     */
    @Test
    public void testSetState_ImagesLoaded() {
        System.out.println("setState_ImagesLoaded");
        tmarker instance = null;
        instance.setState_ImagesLoaded();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState_init method, of class tmarker.
     */
    @Test
    public void testSetState_init() {
        System.out.println("setState_init");
        tmarker instance = null;
        instance.setState_init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoomSlider method, of class tmarker.
     */
    @Test
    public void testSetZoomSlider() {
        System.out.println("setZoomSlider");
        int i = 0;
        tmarker instance = null;
        instance.setZoomSlider(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoom method, of class tmarker.
     */
    @Test
    public void testGetZoom() {
        System.out.println("getZoom");
        tmarker instance = null;
        double expResult = 0.0;
        double result = instance.getZoom();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingPosLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingPosLabels() {
        System.out.println("isShowingPosLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingPosLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingNegLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingNegLabels() {
        System.out.println("isShowingNegLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingNegLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingUnkLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingUnkLabels() {
        System.out.println("isShowingUnkLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingUnkLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingBGLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingBGLabels() {
        System.out.println("isShowingBGLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingBGLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingLabels() {
        System.out.println("isShowingLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingTextLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingTextLabels() {
        System.out.println("isShowingTextLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingTextLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingStainedLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingStainedLabels() {
        System.out.println("isShowingStainedLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingStainedLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingUnstainedLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingUnstainedLabels() {
        System.out.println("isShowingUnstainedLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingUnstainedLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingGoldStandardLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingGoldStandardLabels() {
        System.out.println("isShowingGoldStandardLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingGoldStandardLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingEstimatedLabels method, of class tmarker.
     */
    @Test
    public void testIsShowingEstimatedLabels() {
        System.out.println("isShowingEstimatedLabels");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingEstimatedLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingCellDensitySoft method, of class tmarker.
     */
    @Test
    public void testIsShowingCellDensitySoft() {
        System.out.println("isShowingCellDensitySoft");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingCellDensitySoft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGSNumberForViewing method, of class tmarker.
     */
    @Test
    public void testGetGSNumberForViewing() {
        System.out.println("getGSNumberForViewing");
        tmarker instance = null;
        byte expResult = 0;
        byte result = instance.getGSNumberForViewing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGSNumberForLabeling method, of class tmarker.
     */
    @Test
    public void testGetGSNumberForLabeling() {
        System.out.println("getGSNumberForLabeling");
        tmarker instance = null;
        byte expResult = 0;
        byte result = instance.getGSNumberForLabeling();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTmpDir method, of class tmarker.
     */
    @Test
    public void testSetTmpDir() {
        System.out.println("setTmpDir");
        String tmp_dir = "";
        tmarker instance = null;
        instance.setTmpDir(tmp_dir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTmpDir method, of class tmarker.
     */
    @Test
    public void testGetTmpDir() {
        System.out.println("getTmpDir");
        tmarker instance = null;
        String expResult = "";
        String result = instance.getTmpDir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProgramFolder method, of class tmarker.
     */
    @Test
    public void testGetProgramFolder() {
        System.out.println("getProgramFolder");
        tmarker instance = null;
        String expResult = "";
        String result = instance.getProgramFolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveAsXML method, of class tmarker.
     */
    @Test
    public void testSaveAsXML() {
        System.out.println("SaveAsXML");
        tmarker t = null;
        File file = null;
        boolean asSingleFiles = false;
        boolean expResult = false;
        boolean result = tmarker.SaveAsXML(t, file, asSingleFiles);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveAsCSV method, of class tmarker.
     */
    @Test
    public void testSaveAsCSV() {
        System.out.println("SaveAsCSV");
        tmarker t = null;
        File file = null;
        tmarker.SaveAsCSV(t, file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveAsCSV_Properties method, of class tmarker.
     */
    @Test
    public void testSaveAsCSV_Properties() {
        System.out.println("SaveAsCSV_Properties");
        tmarker t = null;
        File file = null;
        tmarker.SaveAsCSV_Properties(t, file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class tmarker.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        List<TMAspot> tss = null;
        Set<String> expResult = null;
        Set<String> result = tmarker.getProperties(tss);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performConsensusPointCalculation method, of class tmarker.
     */
    @Test
    public void testPerformConsensusPointCalculation() {
        System.out.println("performConsensusPointCalculation");
        boolean considerLabel = false;
        tmarker instance = null;
        instance.performConsensusPointCalculation(considerLabel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performNonConsensusGSPointsDeletion method, of class tmarker.
     */
    @Test
    public void testPerformNonConsensusGSPointsDeletion() {
        System.out.println("performNonConsensusGSPointsDeletion");
        tmarker instance = null;
        instance.performNonConsensusGSPointsDeletion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBgCorrectionDialog method, of class tmarker.
     */
    @Test
    public void testGetBgCorrectionDialog() {
        System.out.println("getBgCorrectionDialog");
        tmarker instance = null;
        BgCorrectionDialog expResult = null;
        BgCorrectionDialog result = instance.getBgCorrectionDialog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTSD method, of class tmarker.
     */
    @Test
    public void testGetTSD() {
        System.out.println("getTSD");
        tmarker instance = null;
        TMAspot_summary_Dialog expResult = null;
        TMAspot_summary_Dialog result = instance.getTSD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPath method, of class tmarker.
     */
    @Test
    public void testAddPath() {
        System.out.println("addPath");
        String p = "";
        tmarker instance = null;
        instance.addPath(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class tmarker.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        tmarker instance = null;
        List<String> expResult = null;
        List<String> result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performBGCorrection method, of class tmarker.
     */
    @Test
    public void testPerformBGCorrection() {
        System.out.println("performBGCorrection");
        int x = 0;
        int y = 0;
        tmarker instance = null;
        instance.performBGCorrection(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDllLocationToPath method, of class tmarker.
     */
    @Test
    public void testAddDllLocationToPath() {
        System.out.println("addDllLocationToPath");
        String dllLocation = "";
        boolean expResult = false;
        boolean result = tmarker.addDllLocationToPath(dllLocation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performBGCorrectionAutomatic method, of class tmarker.
     */
    @Test
    public void testPerformBGCorrectionAutomatic() {
        System.out.println("performBGCorrectionAutomatic");
        boolean asParallelThread = false;
        tmarker instance = null;
        instance.performBGCorrectionAutomatic(asParallelThread);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetRandomSeed method, of class tmarker.
     */
    @Test
    public void testResetRandomSeed() {
        System.out.println("resetRandomSeed");
        tmarker instance = null;
        instance.resetRandomSeed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberNuclei method, of class tmarker.
     */
    @Test
    public void testGetNumberNuclei() {
        System.out.println("getNumberNuclei");
        List<TMAspot> tss = null;
        int expResult = 0;
        int result = tmarker.getNumberNuclei(tss);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUID method, of class tmarker.
     */
    @Test
    public void testGetUID() {
        System.out.println("getUID");
        tmarker instance = null;
        UUID expResult = null;
        UUID result = instance.getUID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveAsPDF method, of class tmarker.
     */
    @Test
    public void testSaveAsPDF() {
        System.out.println("SaveAsPDF");
        tmarker t = null;
        File file = null;
        tmarker.SaveAsPDF(t, file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveAsHTML method, of class tmarker.
     */
    @Test
    public void testSaveAsHTML() {
        System.out.println("SaveAsHTML");
        tmarker t = null;
        File file = null;
        tmarker.SaveAsHTML(t, file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of myFormatInteger method, of class tmarker.
     */
    @Test
    public void testMyFormatInteger() {
        System.out.println("myFormatInteger");
        int i = 0;
        String expResult = "";
        String result = tmarker.myFormatInteger(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listenForOrientationChange method, of class tmarker.
     */
    @Test
    public void testListenForOrientationChange() {
        System.out.println("listenForOrientationChange");
        JToolBar toolBar = null;
        tmarker instance = null;
        instance.listenForOrientationChange(toolBar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of repaintNucleiOnToolBar method, of class tmarker.
     */
    @Test
    public void testRepaintNucleiOnToolBar() {
        System.out.println("repaintNucleiOnToolBar");
        tmarker instance = null;
        instance.repaintNucleiOnToolBar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInBGCorrectionModus method, of class tmarker.
     */
    @Test
    public void testIsInBGCorrectionModus() {
        System.out.println("isInBGCorrectionModus");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isInBGCorrectionModus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInDrawIncludingAreaModus method, of class tmarker.
     */
    @Test
    public void testIsInDrawIncludingAreaModus() {
        System.out.println("isInDrawIncludingAreaModus");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isInDrawIncludingAreaModus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInDrawExcludingAreaModus method, of class tmarker.
     */
    @Test
    public void testIsInDrawExcludingAreaModus() {
        System.out.println("isInDrawExcludingAreaModus");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isInDrawExcludingAreaModus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInSwitchAreaModus method, of class tmarker.
     */
    @Test
    public void testIsInSwitchAreaModus() {
        System.out.println("isInSwitchAreaModus");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isInSwitchAreaModus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInDeleteAreaModus method, of class tmarker.
     */
    @Test
    public void testIsInDeleteAreaModus() {
        System.out.println("isInDeleteAreaModus");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isInDeleteAreaModus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isROIselected method, of class tmarker.
     */
    @Test
    public void testIsROIselected() {
        System.out.println("isROIselected");
        tmarker instance = null;
        boolean expResult = false;
        boolean result = instance.isROIselected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClickBehaviour method, of class tmarker.
     */
    @Test
    public void testGetClickBehaviour() {
        System.out.println("getClickBehaviour");
        tmarker instance = null;
        int expResult = 0;
        int result = instance.getClickBehaviour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentStainingIntensity method, of class tmarker.
     */
    @Test
    public void testGetCurrentStainingIntensity() {
        System.out.println("getCurrentStainingIntensity");
        tmarker instance = null;
        byte expResult = 0;
        byte result = instance.getCurrentStainingIntensity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNucleusToolBarComponent method, of class tmarker.
     */
    @Test
    public void testGetNucleusToolBarComponent() {
        System.out.println("getNucleusToolBarComponent");
        byte labelType = 0;
        byte staining = 0;
        tmarker instance = null;
        LegendElementNucleus expResult = null;
        LegendElementNucleus result = instance.getNucleusToolBarComponent(labelType, staining);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelRadius method, of class tmarker.
     */
    @Test
    public void testGetLabelRadius() {
        System.out.println("getLabelRadius");
        tmarker instance = null;
        int expResult = 0;
        int result = instance.getLabelRadius();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabelRadius method, of class tmarker.
     */
    @Test
    public void testSetLabelRadius() {
        System.out.println("setLabelRadius");
        int r = 0;
        tmarker instance = null;
        instance.setLabelRadius(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParameterValues method, of class tmarker.
     */
    @Test
    public void testGetParameterValues() {
        System.out.println("getParameterValues");
        tmarker instance = null;
        Properties expResult = null;
        Properties result = instance.getParameterValues();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restoreParameterValuesDefaults method, of class tmarker.
     */
    @Test
    public void testRestoreParameterValuesDefaults() {
        System.out.println("restoreParameterValuesDefaults");
        tmarker instance = null;
        instance.restoreParameterValuesDefaults();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAnalysis method, of class tmarker.
     */
    @Test
    public void testSaveAnalysis() {
        System.out.println("saveAnalysis");
        File file = null;
        tmarker instance = null;
        instance.saveAnalysis(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAspotWithName method, of class tmarker.
     */
    @Test
    public void testGetTMAspotWithName() {
        System.out.println("getTMAspotWithName");
        String name = "";
        tmarker instance = null;
        TMAspot expResult = null;
        TMAspot result = instance.getTMAspotWithName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openBgCorrectionDialog method, of class tmarker.
     */
    @Test
    public void testOpenBgCorrectionDialog() {
        System.out.println("openBgCorrectionDialog");
        tmarker instance = null;
        instance.openBgCorrectionDialog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flipUNKto method, of class tmarker.
     */
    @Test
    public void testFlipUNKto() {
        System.out.println("flipUNKto");
        tmarker t = null;
        List<TMAspot> tss = null;
        boolean positive = false;
        tmarker.flipUNKto(t, tss, positive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadPlugins method, of class tmarker.
     */
    @Test
    public void testLoadPlugins() {
        System.out.println("loadPlugins");
        tmarker instance = null;
        instance.loadPlugins();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlugins method, of class tmarker.
     */
    @Test
    public void testGetPlugins() {
        System.out.println("getPlugins");
        tmarker instance = null;
        List<Pluggable> expResult = null;
        List<Pluggable> result = instance.getPlugins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
