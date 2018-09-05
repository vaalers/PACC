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
package tmarker.TMAspot;

import ij.ImagePlus;
import java.awt.Color;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openslide.OpenSlide;
import tmarker.misc.SortedProperties;
import tmarker.tmarker;

/**
 *
 * @author victoriaalers
 */
public class TMAspotTest {
    
    /**
     *
     */
    public TMAspotTest() {
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
     * Test of isNDPI method, of class TMAspot.
     */
    @Test
    public void testIsNDPI() {
        System.out.println("isNDPI");
        TMAspot instance = null;
        boolean expResult = false;
        boolean result;
        result = instance.isNDPI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNDPI method, of class TMAspot.
     */
    @Test
    public void testGetNDPI() {
        System.out.println("getNDPI");
        TMAspot instance = null;
        OpenSlide expResult = null;
        OpenSlide result = instance.getNDPI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTLP method, of class TMAspot.
     */
    @Test
    public void testGetTLP() {
        System.out.println("getTLP");
        TMAspot instance = null;
        TMAspot_list_panel expResult = null;
        TMAspot_list_panel result = instance.getTLP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class TMAspot.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean b = false;
        TMAspot instance = null;
        instance.setSelected(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSelected method, of class TMAspot.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
        TMAspot instance = null;
        boolean expResult = false;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntensity method, of class TMAspot.
     */
    @Test
    public void testGetIntensity() {
        System.out.println("getIntensity");
        TMAspot instance = null;
        byte expResult = 0;
        byte result = instance.getIntensity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntensity method, of class TMAspot.
     */
    @Test
    public void testSetIntensity() {
        System.out.println("setIntensity");
        byte intensity = 0;
        TMAspot instance = null;
        instance.setIntensity(intensity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_nsuperpx method, of class TMAspot.
     */
    @Test
    public void testGetParam_nsuperpx() {
        System.out.println("getParam_nsuperpx");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_nsuperpx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_bg_rgb method, of class TMAspot.
     */
    @Test
    public void testGetParam_bg_rgb() {
        System.out.println("getParam_bg_rgb");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_bg_rgb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_r method, of class TMAspot.
     */
    @Test
    public void testGetParam_r() {
        System.out.println("getParam_r");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_r();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_blur method, of class TMAspot.
     */
    @Test
    public void testGetParam_blur() {
        System.out.println("getParam_blur");
        TMAspot instance = null;
        double expResult = 0.0;
        double result = instance.getParam_blur();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_blur method, of class TMAspot.
     */
    @Test
    public void testSetParam_blur() {
        System.out.println("setParam_blur");
        double param_blur = 0.0;
        TMAspot instance = null;
        instance.setParam_blur(param_blur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_tolerance method, of class TMAspot.
     */
    @Test
    public void testGetParam_tolerance() {
        System.out.println("getParam_tolerance");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_tolerance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_tolerance method, of class TMAspot.
     */
    @Test
    public void testSetParam_tolerance() {
        System.out.println("setParam_tolerance");
        int param_tolerance = 0;
        TMAspot instance = null;
        instance.setParam_tolerance(param_tolerance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_smoothness method, of class TMAspot.
     */
    @Test
    public void testGetParam_smoothness() {
        System.out.println("getParam_smoothness");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_smoothness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_smoothness method, of class TMAspot.
     */
    @Test
    public void testSetParam_smoothness() {
        System.out.println("setParam_smoothness");
        int param_smoothness = 0;
        TMAspot instance = null;
        instance.setParam_smoothness(param_smoothness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_lab_space method, of class TMAspot.
     */
    @Test
    public void testGetParam_lab_space() {
        System.out.println("getParam_lab_space");
        TMAspot instance = null;
        boolean expResult = false;
        boolean result = instance.getParam_lab_space();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_lab_space method, of class TMAspot.
     */
    @Test
    public void testSetParam_lab_space() {
        System.out.println("setParam_lab_space");
        boolean param_lab_space = false;
        TMAspot instance = null;
        instance.setParam_lab_space(param_lab_space);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_t_hema method, of class TMAspot.
     */
    @Test
    public void testGetParam_t_hema() {
        System.out.println("getParam_t_hema");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_t_hema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_t_hema method, of class TMAspot.
     */
    @Test
    public void testSetParam_t_hema() {
        System.out.println("setParam_t_hema");
        int param_t_hema = 0;
        TMAspot instance = null;
        instance.setParam_t_hema(param_t_hema);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_t_dab method, of class TMAspot.
     */
    @Test
    public void testGetParam_t_dab() {
        System.out.println("getParam_t_dab");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_t_dab();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_t_dab method, of class TMAspot.
     */
    @Test
    public void testSetParam_t_dab() {
        System.out.println("setParam_t_dab");
        int param_t_dab = 0;
        TMAspot instance = null;
        instance.setParam_t_dab(param_t_dab);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_t_ch3 method, of class TMAspot.
     */
    @Test
    public void testGetParam_t_ch3() {
        System.out.println("getParam_t_ch3");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getParam_t_ch3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_t_ch3 method, of class TMAspot.
     */
    @Test
    public void testSetParam_t_ch3() {
        System.out.println("setParam_t_ch3");
        int param_t_ch3 = 0;
        TMAspot instance = null;
        instance.setParam_t_ch3(param_t_ch3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveThresholdMaps method, of class TMAspot.
     */
    @Test
    public void testSaveThresholdMaps() {
        System.out.println("saveThresholdMaps");
        List<ImagePlus> TM = null;
        boolean asParallelThread = false;
        TMAspot instance = null;
        instance.saveThresholdMaps(TM, asParallelThread);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeatmapImage method, of class TMAspot.
     */
    @Test
    public void testSetHeatmapImage() {
        System.out.println("setHeatmapImage");
        ImagePlus heatmap = null;
        TMAspot instance = null;
        instance.setHeatmapImage(heatmap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIncludingAreas method, of class TMAspot.
     */
    @Test
    public void testGetIncludingAreas() {
        System.out.println("getIncludingAreas");
        TMAspot instance = null;
        List<Polygon> expResult = null;
        List<Polygon> result = instance.getIncludingAreas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExcludingAreas method, of class TMAspot.
     */
    @Test
    public void testGetExcludingAreas() {
        System.out.println("getExcludingAreas");
        TMAspot instance = null;
        List<Polygon> expResult = null;
        List<Polygon> result = instance.getExcludingAreas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createThumbnail method, of class TMAspot.
     */
    @Test
    public void testCreateThumbnail() {
        System.out.println("createThumbnail");
        TMAspot instance = null;
        instance.createThumbnail();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilename method, of class TMAspot.
     */
    @Test
    public void testSetFilename() {
        System.out.println("setFilename");
        String original_filename = "";
        TMAspot instance = null;
        instance.setFilename(original_filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalImagename method, of class TMAspot.
     */
    @Test
    public void testGetOriginalImagename() {
        System.out.println("getOriginalImagename");
        TMAspot instance = null;
        String expResult = "";
        String result = instance.getOriginalImagename();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagename method, of class TMAspot.
     */
    @Test
    public void testGetImagename() {
        System.out.println("getImagename");
        TMAspot instance = null;
        String expResult = "";
        String result = instance.getImagename();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasBGCorrection method, of class TMAspot.
     */
    @Test
    public void testHasBGCorrection() {
        System.out.println("hasBGCorrection");
        TMAspot instance = null;
        boolean expResult = false;
        boolean result = instance.hasBGCorrection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class TMAspot.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TMAspot instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasStainingEstimation method, of class TMAspot.
     */
    @Test
    public void testHasStainingEstimation() {
        System.out.println("hasStainingEstimation");
        TMAspot instance = null;
        boolean expResult = false;
        boolean result = instance.hasStainingEstimation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPos_total method, of class TMAspot.
     */
    @Test
    public void testGetNumPos_total() {
        System.out.println("getNumPos_total");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumPos_total();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumNeg_total method, of class TMAspot.
     */
    @Test
    public void testGetNumNeg_total() {
        System.out.println("getNumNeg_total");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumNeg_total();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPos_goldst method, of class TMAspot.
     */
    @Test
    public void testGetNumPos_goldst() {
        System.out.println("getNumPos_goldst");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumPos_goldst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumNeg_goldst method, of class TMAspot.
     */
    @Test
    public void testGetNumNeg_goldst() {
        System.out.println("getNumNeg_goldst");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumNeg_goldst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumBG_goldst method, of class TMAspot.
     */
    @Test
    public void testGetNumBG_goldst() {
        System.out.println("getNumBG_goldst");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumBG_goldst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPos_estimated method, of class TMAspot.
     */
    @Test
    public void testGetNumPos_estimated() {
        System.out.println("getNumPos_estimated");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumPos_estimated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumNeg_estimated method, of class TMAspot.
     */
    @Test
    public void testGetNumNeg_estimated() {
        System.out.println("getNumNeg_estimated");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumNeg_estimated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStainingEstimation method, of class TMAspot.
     */
    @Test
    public void testGetStainingEstimation_0args() {
        System.out.println("getStainingEstimation");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getStainingEstimation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStainingEstimation method, of class TMAspot.
     */
    @Test
    public void testGetStainingEstimation_List() {
        System.out.println("getStainingEstimation");
        List<TMApoint> tps = null;
        int expResult = 0;
        int result = TMAspot.getStainingEstimation(tps);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTmpDir method, of class TMAspot.
     */
    @Test
    public void testGetTmpDir() {
        System.out.println("getTmpDir");
        TMAspot instance = null;
        String expResult = "";
        String result = instance.getTmpDir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCenter method, of class TMAspot.
     */
    @Test
    public void testGetCenter() {
        System.out.println("getCenter");
        TMAspot instance = null;
        tmarker expResult = null;
        tmarker result = instance.getCenter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class TMAspot.
     */
    @Test
    public void testGetPoints_0args() {
        System.out.println("getPoints");
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointsInROI method, of class TMAspot.
     */
    @Test
    public void testGetPointsInROI() {
        System.out.println("getPointsInROI");
        Polygon ROI = null;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPointsInROI(ROI);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class TMAspot.
     */
    @Test
    public void testGetPoints_byte() {
        System.out.println("getPoints");
        byte label = 0;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class TMAspot.
     */
    @Test
    public void testGetPoints_byte_boolean() {
        System.out.println("getPoints");
        byte tag = 0;
        boolean isLabel = false;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints(tag, isLabel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class TMAspot.
     */
    @Test
    public void testGetPoints_3args_1() {
        System.out.println("getPoints");
        boolean isGoldStandard = false;
        byte staining = 0;
        byte malignancy = 0;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints(isGoldStandard, staining, malignancy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPoints method, of class TMAspot.
     */
    @Test
    public void testGetNumPoints_3args_1() {
        System.out.println("getNumPoints");
        boolean isGoldStandard = false;
        byte staining = 0;
        byte malignancy = 0;
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumPoints(isGoldStandard, staining, malignancy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class TMAspot.
     */
    @Test
    public void testGetPoints_3args_2() {
        System.out.println("getPoints");
        boolean isGoldStandard = false;
        boolean isStained = false;
        byte malignancy = 0;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints(isGoldStandard, isStained, malignancy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPoints method, of class TMAspot.
     */
    @Test
    public void testGetNumPoints_3args_2() {
        System.out.println("getNumPoints");
        boolean isGoldStandard = false;
        boolean isStained = false;
        byte malignancy = 0;
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getNumPoints(isGoldStandard, isStained, malignancy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPoint method, of class TMAspot.
     */
    @Test
    public void testAddPoint() {
        System.out.println("addPoint");
        TMApoint p = null;
        TMAspot instance = null;
        instance.addPoint(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPoints method, of class TMAspot.
     */
    @Test
    public void testAddPoints() {
        System.out.println("addPoints");
        List<TMApoint> ps = null;
        TMAspot instance = null;
        instance.addPoints(ps);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePoint method, of class TMAspot.
     */
    @Test
    public void testRemovePoint() {
        System.out.println("removePoint");
        TMApoint p = null;
        TMAspot instance = null;
        instance.removePoint(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllPoints_ES method, of class TMAspot.
     */
    @Test
    public void testDeleteAllPoints_ES() {
        System.out.println("deleteAllPoints_ES");
        TMAspot instance = null;
        instance.deleteAllPoints_ES();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointAt method, of class TMAspot.
     */
    @Test
    public void testGetPointAt() {
        System.out.println("getPointAt");
        int x = 0;
        int y = 0;
        int radius = 0;
        boolean onlyVisible = false;
        TMAspot instance = null;
        TMApoint expResult = null;
        TMApoint result = instance.getPointAt(x, y, radius, onlyVisible);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisiblePoints method, of class TMAspot.
     */
    @Test
    public void testGetVisiblePoints() {
        System.out.println("getVisiblePoints");
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getVisiblePoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxGSNumber method, of class TMAspot.
     */
    @Test
    public void testGetMaxGSNumber() {
        System.out.println("getMaxGSNumber");
        TMAspot instance = null;
        byte expResult = 0;
        byte result = instance.getMaxGSNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispStainingInfo method, of class TMAspot.
     */
    @Test
    public void testDispStainingInfo() {
        System.out.println("dispStainingInfo");
        TMAspot instance = null;
        instance.dispStainingInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adoptParams method, of class TMAspot.
     */
    @Test
    public void testAdoptParams() {
        System.out.println("adoptParams");
        TMAspot other_spot = null;
        boolean convertPoints = false;
        TMAspot instance = null;
        instance.adoptParams(other_spot, convertPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllPoints_GS method, of class TMAspot.
     */
    @Test
    public void testDeleteAllPoints_GS() {
        System.out.println("deleteAllPoints_GS");
        TMAspot instance = null;
        instance.deleteAllPoints_GS();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllPoints method, of class TMAspot.
     */
    @Test
    public void testDeleteAllPoints_byte_boolean() {
        System.out.println("deleteAllPoints");
        byte whichPoints = 0;
        boolean goldStandard = false;
        TMAspot instance = null;
        instance.deleteAllPoints(whichPoints, goldStandard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAllPoints method, of class TMAspot.
     */
    @Test
    public void testDeleteAllPoints_3args() {
        System.out.println("deleteAllPoints");
        byte PointLabel = 0;
        byte PointStaining = 0;
        boolean goldStandard = false;
        TMAspot instance = null;
        instance.deleteAllPoints(PointLabel, PointStaining, goldStandard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doBgCorrection method, of class TMAspot.
     */
    @Test
    public void testDoBgCorrection_0args() {
        System.out.println("doBgCorrection");
        TMAspot instance = null;
        instance.doBgCorrection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doBgCorrection method, of class TMAspot.
     */
    @Test
    public void testDoBgCorrection_int_int() {
        System.out.println("doBgCorrection");
        int x = 0;
        int y = 0;
        TMAspot instance = null;
        instance.doBgCorrection(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doBgCorrection method, of class TMAspot.
     */
    @Test
    public void testDoBgCorrection_int() {
        System.out.println("doBgCorrection");
        int bg_rgb = 0;
        TMAspot instance = null;
        instance.doBgCorrection(bg_rgb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doBgCorrection method, of class TMAspot.
     */
    @Test
    public void testDoBgCorrection_int_BufferedImage() {
        System.out.println("doBgCorrection");
        int bg_rgb = 0;
        BufferedImage I = null;
        TMAspot instance = null;
        instance.doBgCorrection(bg_rgb, I);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doBgCorrectionAutomatic method, of class TMAspot.
     */
    @Test
    public void testDoBgCorrectionAutomatic() {
        System.out.println("doBgCorrectionAutomatic");
        TMAspot instance = null;
        instance.doBgCorrectionAutomatic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ColorAtPoint method, of class TMAspot.
     */
    @Test
    public void testColorAtPoint() {
        System.out.println("ColorAtPoint");
        BufferedImage I = null;
        int x = 0;
        int y = 0;
        Color expResult = null;
        Color result = TMAspot.ColorAtPoint(I, x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverageColorAtPoint method, of class TMAspot.
     */
    @Test
    public void testGetAverageColorAtPoint() {
        System.out.println("getAverageColorAtPoint");
        BufferedImage I = null;
        int x = 0;
        int y = 0;
        int radius = 0;
        boolean median = false;
        Color expResult = null;
        Color result = TMAspot.getAverageColorAtPoint(I, x, y, radius, median);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagepointsAroundPoint method, of class TMAspot.
     */
    @Test
    public void testGetImagepointsAroundPoint() {
        System.out.println("getImagepointsAroundPoint");
        BufferedImage I = null;
        int x = 0;
        int y = 0;
        int r = 0;
        List expResult = null;
        List result = TMAspot.getImagepointsAroundPoint(I, x, y, r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverageColor method, of class TMAspot.
     */
    @Test
    public void testGetAverageColor_byte_boolean() {
        System.out.println("getAverageColor");
        byte label = 0;
        boolean median = false;
        TMAspot instance = null;
        Color expResult = null;
        Color result = instance.getAverageColor(label, median);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverageColor method, of class TMAspot.
     */
    @Test
    public void testGetAverageColor_3args() {
        System.out.println("getAverageColor");
        byte tag = 0;
        boolean isLabel = false;
        boolean median = false;
        TMAspot instance = null;
        Color expResult = null;
        Color result = instance.getAverageColor(tag, isLabel, median);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverageColor method, of class TMAspot.
     */
    @Test
    public void testGetAverageColor_List_boolean() {
        System.out.println("getAverageColor");
        List<TMApoint> ps = null;
        boolean median = false;
        TMAspot instance = null;
        Color expResult = null;
        Color result = instance.getAverageColor(ps, median);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntensities method, of class TMAspot.
     */
    @Test
    public void testGetIntensities_byte_boolean() {
        System.out.println("getIntensities");
        byte label = 0;
        boolean median = false;
        TMAspot instance = null;
        double[][] expResult = null;
        double[][] result = instance.getIntensities(label, median);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntensities method, of class TMAspot.
     */
    @Test
    public void testGetIntensities_0args() {
        System.out.println("getIntensities");
        TMAspot instance = null;
        double[][] expResult = null;
        double[][] result = instance.getIntensities();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistograms method, of class TMAspot.
     */
    @Test
    public void testGetHistograms() {
        System.out.println("getHistograms");
        int nbins = 0;
        boolean relativeFrequency = false;
        TMAspot instance = null;
        double[][] expResult = null;
        double[][] result = instance.getHistograms(nbins, relativeFrequency);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flipAllPoints method, of class TMAspot.
     */
    @Test
    public void testFlipAllPoints() {
        System.out.println("flipAllPoints");
        TMAspot instance = null;
        instance.flipAllPoints();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints_GoldStandard method, of class TMAspot.
     */
    @Test
    public void testGetPoints_GoldStandard_0args() {
        System.out.println("getPoints_GoldStandard");
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints_GoldStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints_GoldStandard method, of class TMAspot.
     */
    @Test
    public void testGetPoints_GoldStandard_byte() {
        System.out.println("getPoints_GoldStandard");
        byte label = 0;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints_GoldStandard(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints_GoldStandard method, of class TMAspot.
     */
    @Test
    public void testGetPoints_GoldStandard_byte_byte() {
        System.out.println("getPoints_GoldStandard");
        byte gs_number = 0;
        byte label = 0;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints_GoldStandard(gs_number, label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints_Estimated method, of class TMAspot.
     */
    @Test
    public void testGetPoints_Estimated_0args() {
        System.out.println("getPoints_Estimated");
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints_Estimated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints_Estimated method, of class TMAspot.
     */
    @Test
    public void testGetPoints_Estimated_byte() {
        System.out.println("getPoints_Estimated");
        byte label = 0;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints_Estimated(label);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints_Estimated method, of class TMAspot.
     */
    @Test
    public void testGetPoints_Estimated_byte_boolean() {
        System.out.println("getPoints_Estimated");
        byte label = 0;
        boolean stained = false;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints_Estimated(label, stained);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints_Estimated method, of class TMAspot.
     */
    @Test
    public void testGetPoints_Estimated_byte_byte() {
        System.out.println("getPoints_Estimated");
        byte label = 0;
        byte staining = 0;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getPoints_Estimated(label, staining);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNonTrainingPoints method, of class TMAspot.
     */
    @Test
    public void testGetNonTrainingPoints() {
        System.out.println("getNonTrainingPoints");
        boolean classification = false;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getNonTrainingPoints(classification);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrainingPoints method, of class TMAspot.
     */
    @Test
    public void testGetTrainingPoints() {
        System.out.println("getTrainingPoints");
        boolean classification = false;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getTrainingPoints(classification);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrainingPoints_Consensus method, of class TMAspot.
     */
    @Test
    public void testGetTrainingPoints_Consensus() {
        System.out.println("getTrainingPoints_Consensus");
        boolean classification = false;
        TMAspot instance = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = instance.getTrainingPoints_Consensus(classification);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHScore method, of class TMAspot.
     */
    @Test
    public void testGetHScore_0args() {
        System.out.println("getHScore");
        TMAspot instance = null;
        double expResult = 0.0;
        double result = instance.getHScore();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHScore method, of class TMAspot.
     */
    @Test
    public void testGetHScore_Polygon() {
        System.out.println("getHScore");
        Polygon includingROI = null;
        TMAspot instance = null;
        double expResult = 0.0;
        double result = instance.getHScore(includingROI);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateMatchStatistics method, of class TMAspot.
     */
    @Test
    public void testCalculateMatchStatistics_0args() {
        System.out.println("calculateMatchStatistics");
        TMAspot instance = null;
        double[] expResult = null;
        double[] result = instance.calculateMatchStatistics();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filter_centroids_on_distance method, of class TMAspot.
     */
    @Test
    public void testFilter_centroids_on_distance() {
        System.out.println("filter_centroids_on_distance");
        List<TMApoint> blue_spots = null;
        List<TMApoint> brown_spots = null;
        int radius = 0;
        TMAspot.filter_centroids_on_distance(blue_spots, brown_spots, radius);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filter_centroids_on_border method, of class TMAspot.
     */
    @Test
    public void testFilter_centroids_on_border() {
        System.out.println("filter_centroids_on_border");
        List<TMApoint> spots = null;
        int width = 0;
        int height = 0;
        int border = 0;
        TMAspot.filter_centroids_on_border(spots, width, height, border);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filter_centroids_on_Areas method, of class TMAspot.
     */
    @Test
    public void testFilter_centroids_on_Areas() {
        System.out.println("filter_centroids_on_Areas");
        List<TMApoint> points = null;
        TMAspot ts = null;
        TMAspot.filter_centroids_on_Areas(points, ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateMatchStatistics method, of class TMAspot.
     */
    @Test
    public void testCalculateMatchStatistics_3args() {
        System.out.println("calculateMatchStatistics");
        List<TMApoint> gs = null;
        List<TMApoint> es = null;
        int radius = 0;
        TMAspot instance = null;
        double[] expResult = null;
        double[] result = instance.calculateMatchStatistics(gs, es, radius);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPointsWithinRadius method, of class TMAspot.
     */
    @Test
    public void testGetPointsWithinRadius() {
        System.out.println("getPointsWithinRadius");
        int x = 0;
        int y = 0;
        int r = 0;
        List<TMApoint> tps = null;
        List<TMApoint> expResult = null;
        List<TMApoint> result = TMAspot.getPointsWithinRadius(x, y, r, tps);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateConsensusPoints method, of class TMAspot.
     */
    @Test
    public void testCalculateConsensusPoints() {
        System.out.println("calculateConsensusPoints");
        boolean considerLabel = false;
        TMAspot instance = null;
        instance.calculateConsensusPoints(considerLabel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNonConsensusGSPoints method, of class TMAspot.
     */
    @Test
    public void testDeleteNonConsensusGSPoints() {
        System.out.println("deleteNonConsensusGSPoints");
        TMAspot instance = null;
        instance.deleteNonConsensusGSPoints();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countBooleanArray method, of class TMAspot.
     */
    @Test
    public void testCountBooleanArray() {
        System.out.println("countBooleanArray");
        boolean[] array = null;
        boolean b = false;
        int expResult = 0;
        int result = TMAspot.countBooleanArray(array, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyGoldStandardAsUnknownEstimated method, of class TMAspot.
     */
    @Test
    public void testCopyGoldStandardAsUnknownEstimated() {
        System.out.println("copyGoldStandardAsUnknownEstimated");
        TMAspot instance = null;
        instance.copyGoldStandardAsUnknownEstimated();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBufferedImage method, of class TMAspot.
     */
    @Test
    public void testGetBufferedImage() {
        System.out.println("getBufferedImage");
        TMAspot instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.getBufferedImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubimage method, of class TMAspot.
     */
    @Test
    public void testGetSubimage_6args() {
        System.out.println("getSubimage");
        int x = 0;
        int y = 0;
        int w = 0;
        int h = 0;
        int maxsize = 0;
        BufferedImage fullImage = null;
        TMAspot instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.getSubimage(x, y, w, h, maxsize, fullImage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubimage method, of class TMAspot.
     */
    @Test
    public void testGetSubimage_7args() {
        System.out.println("getSubimage");
        int x = 0;
        int y = 0;
        int w = 0;
        int h = 0;
        int maxsize = 0;
        int bufferedImageType = 0;
        BufferedImage fullImage = null;
        TMAspot instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.getSubimage(x, y, w, h, maxsize, bufferedImageType, fullImage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePolygonOnPoint method, of class TMAspot.
     */
    @Test
    public void testDeletePolygonOnPoint() {
        System.out.println("deletePolygonOnPoint");
        int x = 0;
        int y = 0;
        TMAspot instance = null;
        instance.deletePolygonOnPoint(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchPolygonOnPoint method, of class TMAspot.
     */
    @Test
    public void testSwitchPolygonOnPoint() {
        System.out.println("switchPolygonOnPoint");
        int x = 0;
        int y = 0;
        TMAspot instance = null;
        instance.switchPolygonOnPoint(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProperties method, of class TMAspot.
     */
    @Test
    public void testSetProperties() {
        System.out.println("setProperties");
        SortedProperties prop = null;
        TMAspot instance = null;
        instance.setProperties(prop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperties method, of class TMAspot.
     */
    @Test
    public void testAddProperties() {
        System.out.println("addProperties");
        SortedProperties prop = null;
        TMAspot instance = null;
        instance.addProperties(prop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProperty method, of class TMAspot.
     */
    @Test
    public void testAddProperty() {
        System.out.println("addProperty");
        String key = "";
        String value = "";
        TMAspot instance = null;
        instance.addProperty(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class TMAspot.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        TMAspot instance = null;
        SortedProperties expResult = null;
        SortedProperties result = instance.getProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasArea method, of class TMAspot.
     */
    @Test
    public void testHasArea() {
        System.out.println("hasArea");
        TMAspot instance = null;
        boolean expResult = false;
        boolean result = instance.hasArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class TMAspot.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class TMAspot.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelers method, of class TMAspot.
     */
    @Test
    public void testGetLabelers() {
        System.out.println("getLabelers");
        TMAspot instance = null;
        Set<Byte> expResult = null;
        Set<Byte> result = instance.getLabelers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFeatureVector_IntensityClustering method, of class TMAspot.
     */
    @Test
    public void testGetFeatureVector_IntensityClustering() {
        System.out.println("getFeatureVector_IntensityClustering");
        TMAspot instance = null;
        double[] expResult = null;
        double[] result = instance.getFeatureVector_IntensityClustering();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePointsInArea method, of class TMAspot.
     */
    @Test
    public void testDeletePointsInArea() {
        System.out.println("deletePointsInArea");
        Polygon pol = null;
        TMAspot instance = null;
        instance.deletePointsInArea(pol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreaOnPoint method, of class TMAspot.
     */
    @Test
    public void testGetAreaOnPoint_int_int() {
        System.out.println("getAreaOnPoint");
        int x = 0;
        int y = 0;
        TMAspot instance = null;
        Polygon expResult = null;
        Polygon result = instance.getAreaOnPoint(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreaOnPoint method, of class TMAspot.
     */
    @Test
    public void testGetAreaOnPoint_3args() {
        System.out.println("getAreaOnPoint");
        int x = 0;
        int y = 0;
        int tolerance = 0;
        TMAspot instance = null;
        Polygon expResult = null;
        Polygon result = instance.getAreaOnPoint(x, y, tolerance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIncludingAreaOnPoint method, of class TMAspot.
     */
    @Test
    public void testGetIncludingAreaOnPoint_int_int() {
        System.out.println("getIncludingAreaOnPoint");
        int x = 0;
        int y = 0;
        TMAspot instance = null;
        Polygon expResult = null;
        Polygon result = instance.getIncludingAreaOnPoint(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIncludingAreaOnPoint method, of class TMAspot.
     */
    @Test
    public void testGetIncludingAreaOnPoint_3args() {
        System.out.println("getIncludingAreaOnPoint");
        int x = 0;
        int y = 0;
        int tolerance = 0;
        TMAspot instance = null;
        Polygon expResult = null;
        Polygon result = instance.getIncludingAreaOnPoint(x, y, tolerance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExcludingAreaOnPoint method, of class TMAspot.
     */
    @Test
    public void testGetExcludingAreaOnPoint_int_int() {
        System.out.println("getExcludingAreaOnPoint");
        int x = 0;
        int y = 0;
        TMAspot instance = null;
        Polygon expResult = null;
        Polygon result = instance.getExcludingAreaOnPoint(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExcludingAreaOnPoint method, of class TMAspot.
     */
    @Test
    public void testGetExcludingAreaOnPoint_3args() {
        System.out.println("getExcludingAreaOnPoint");
        int x = 0;
        int y = 0;
        int tolerance = 0;
        TMAspot instance = null;
        Polygon expResult = null;
        Polygon result = instance.getExcludingAreaOnPoint(x, y, tolerance);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class TMAspot.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        TMAspot instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThumbnailImage method, of class TMAspot.
     */
    @Test
    public void testGetThumbnailImage() {
        System.out.println("getThumbnailImage");
        int w_max = 0;
        int h_max = 0;
        double[] factor = null;
        TMAspot instance = null;
        Image expResult = null;
        Image result = instance.getThumbnailImage(w_max, h_max, factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
