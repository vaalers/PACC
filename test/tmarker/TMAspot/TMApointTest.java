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

import ij.gui.Roi;
import java.awt.image.BufferedImage;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tmarker.misc.lROI;

/**
 *
 * @author victoriaalers
 */
public class TMApointTest {
    
    /**
     *
     */
    public TMApointTest() {
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
     * Test of clone method, of class TMApoint.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        TMApoint instance = null;
        TMApoint expResult = null;
        TMApoint result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class TMApoint.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        TMApoint instance = null;
        byte expResult = 0;
        byte result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel method, of class TMApoint.
     */
    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        byte label = 0;
        TMApoint instance = null;
        instance.setLabel(label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStained method, of class TMApoint.
     */
    @Test
    public void testIsStained() {
        System.out.println("isStained");
        TMApoint instance = null;
        boolean expResult = false;
        boolean result = instance.isStained();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStaining method, of class TMApoint.
     */
    @Test
    public void testGetStaining() {
        System.out.println("getStaining");
        TMApoint instance = null;
        byte expResult = 0;
        byte result = instance.getStaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStaining method, of class TMApoint.
     */
    @Test
    public void testSetStaining() {
        System.out.println("setStaining");
        byte staining = 0;
        TMApoint instance = null;
        instance.setStaining(staining);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTMAspot method, of class TMApoint.
     */
    @Test
    public void testSetTMAspot() {
        System.out.println("setTMAspot");
        TMAspot ts = null;
        TMApoint instance = null;
        instance.setTMAspot(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAspot method, of class TMApoint.
     */
    @Test
    public void testGetTMAspot() {
        System.out.println("getTMAspot");
        TMApoint instance = null;
        TMAspot expResult = null;
        TMAspot result = instance.getTMAspot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getROI method, of class TMApoint.
     */
    @Test
    public void testGetROI() {
        System.out.println("getROI");
        TMApoint instance = null;
        lROI expResult = null;
        lROI result = instance.getROI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setROI method, of class TMApoint.
     */
    @Test
    public void testSetROI() {
        System.out.println("setROI");
        lROI lROI = null;
        TMApoint instance = null;
        instance.setROI(lROI);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoi method, of class TMApoint.
     */
    @Test
    public void testGetRoi() {
        System.out.println("getRoi");
        TMApoint instance = null;
        Roi expResult = null;
        Roi result = instance.getRoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoi method, of class TMApoint.
     */
    @Test
    public void testSetRoi() {
        System.out.println("setRoi");
        Roi lroi = null;
        TMApoint instance = null;
        instance.setRoi(lroi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flipLabel method, of class TMApoint.
     */
    @Test
    public void testFlipLabel() {
        System.out.println("flipLabel");
        boolean binary = false;
        TMApoint instance = null;
        instance.flipLabel(binary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flipStaining method, of class TMApoint.
     */
    @Test
    public void testFlipStaining() {
        System.out.println("flipStaining");
        boolean binary = false;
        TMApoint instance = null;
        instance.flipStaining(binary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGoldStandard method, of class TMApoint.
     */
    @Test
    public void testIsGoldStandard() {
        System.out.println("isGoldStandard");
        TMApoint instance = null;
        boolean expResult = false;
        boolean result = instance.isGoldStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGoldStandard method, of class TMApoint.
     */
    @Test
    public void testGetGoldStandard() {
        System.out.println("getGoldStandard");
        TMApoint instance = null;
        byte expResult = 0;
        byte result = instance.getGoldStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGoldStandard method, of class TMApoint.
     */
    @Test
    public void testSetGoldStandard() {
        System.out.println("setGoldStandard");
        byte goldStandard = 0;
        TMApoint instance = null;
        instance.setGoldStandard(goldStandard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTrainingPoint method, of class TMApoint.
     */
    @Test
    public void testIsTrainingPoint() {
        System.out.println("isTrainingPoint");
        boolean classification = false;
        TMApoint instance = null;
        boolean expResult = false;
        boolean result = instance.isTrainingPoint(classification);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrainingsPoint method, of class TMApoint.
     */
    @Test
    public void testSetTrainingsPoint() {
        System.out.println("setTrainingsPoint");
        boolean classification = false;
        boolean isTrainingsPoint = false;
        TMApoint instance = null;
        instance.setTrainingsPoint(classification, isTrainingsPoint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatches method, of class TMApoint.
     */
    @Test
    public void testGetPatches() {
        System.out.println("getPatches");
        BufferedImage I = null;
        int patchsize = 0;
        TMApoint instance = null;
        List<Object> expResult = null;
        List<Object> result = instance.getPatches(I, patchsize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
