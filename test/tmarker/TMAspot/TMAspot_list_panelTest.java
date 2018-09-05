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

import java.awt.Graphics;
import java.awt.image.BufferedImage;
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
public class TMAspot_list_panelTest {
    
    /**
     *
     */
    public TMAspot_list_panelTest() {
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
     * Test of getTMAspot method, of class TMAspot_list_panel.
     */
    @Test
    public void testGetTMAspot() {
        System.out.println("getTMAspot");
        TMAspot_list_panel instance = null;
        TMAspot expResult = null;
        TMAspot result = instance.getTMAspot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class TMAspot_list_panel.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean b = false;
        TMAspot_list_panel instance = null;
        instance.setSelected(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class TMAspot_list_panel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        TMAspot_list_panel instance = null;
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawNucleiCounts method, of class TMAspot_list_panel.
     */
    @Test
    public void testDrawNucleiCounts() {
        System.out.println("drawNucleiCounts");
        Graphics g = null;
        boolean drawEstimated = false;
        boolean drawGoldstandard = false;
        TMAspot_list_panel instance = null;
        instance.drawNucleiCounts(g, drawEstimated, drawGoldstandard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCellNumbers method, of class TMAspot_list_panel.
     */
    @Test
    public void testUpdateCellNumbers() {
        System.out.println("updateCellNumbers");
        TMAspot_list_panel tlp = null;
        TMAspot_list_panel.updateCellNumbers(tlp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Int2FormatedString method, of class TMAspot_list_panel.
     */
    @Test
    public void testInt2FormatedString() {
        System.out.println("Int2FormatedString");
        int i = 0;
        String expResult = "";
        String result = TMAspot_list_panel.Int2FormatedString(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListItemHeight method, of class TMAspot_list_panel.
     */
    @Test
    public void testGetListItemHeight() {
        System.out.println("getListItemHeight");
        TMAspot_list_panel instance = null;
        int expResult = 0;
        int result = instance.getListItemHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOffsetx method, of class TMAspot_list_panel.
     */
    @Test
    public void testGetOffsetx() {
        System.out.println("getOffsetx");
        TMAspot_list_panel instance = null;
        int expResult = 0;
        int result = instance.getOffsetx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOffsety method, of class TMAspot_list_panel.
     */
    @Test
    public void testGetOffsety() {
        System.out.println("getOffsety");
        TMAspot_list_panel instance = null;
        int expResult = 0;
        int result = instance.getOffsety();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExpanded method, of class TMAspot_list_panel.
     */
    @Test
    public void testIsExpanded() {
        System.out.println("isExpanded");
        TMAspot_list_panel instance = null;
        boolean expResult = false;
        boolean result = instance.isExpanded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleExpansion method, of class TMAspot_list_panel.
     */
    @Test
    public void testToggleExpansion() {
        System.out.println("toggleExpansion");
        TMAspot_list_panel instance = null;
        instance.toggleExpansion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleShowGstOrEst method, of class TMAspot_list_panel.
     */
    @Test
    public void testToggleShowGstOrEst() {
        System.out.println("toggleShowGstOrEst");
        TMAspot_list_panel instance = null;
        instance.toggleShowGstOrEst();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingEstimated method, of class TMAspot_list_panel.
     */
    @Test
    public void testIsShowingEstimated() {
        System.out.println("isShowingEstimated");
        TMAspot_list_panel instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingEstimated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowingGoldstandard method, of class TMAspot_list_panel.
     */
    @Test
    public void testIsShowingGoldstandard() {
        System.out.println("isShowingGoldstandard");
        TMAspot_list_panel instance = null;
        boolean expResult = false;
        boolean result = instance.isShowingGoldstandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThumbnailImage method, of class TMAspot_list_panel.
     */
    @Test
    public void testSetThumbnailImage() {
        System.out.println("setThumbnailImage");
        BufferedImage I = null;
        TMAspot_list_panel instance = null;
        instance.setThumbnailImage(I);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
