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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victoriaalers
 */
public class BgCorrectionDialogTest {
    
    /**
     *
     */
    public BgCorrectionDialogTest() {
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
     * Test of main method, of class BgCorrectionDialog.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BgCorrectionDialog.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUseColor method, of class BgCorrectionDialog.
     */
    @Test
    public void testGetUseColor() {
        System.out.println("getUseColor");
        BgCorrectionDialog instance = null;
        boolean expResult = false;
        boolean result = instance.getUseColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUseColor method, of class BgCorrectionDialog.
     */
    @Test
    public void testSetUseColor() {
        System.out.println("setUseColor");
        boolean useColor = false;
        BgCorrectionDialog instance = null;
        instance.setUseColor(useColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveBGcorrectedImages method, of class BgCorrectionDialog.
     */
    @Test
    public void testSaveBGcorrectedImages() {
        System.out.println("saveBGcorrectedImages");
        BgCorrectionDialog instance = null;
        instance.saveBGcorrectedImages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
