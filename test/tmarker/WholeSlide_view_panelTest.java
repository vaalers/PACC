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

import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tmarker.TMAspot.TMAspot;

/**
 *
 * @author victoriaalers
 */
public class WholeSlide_view_panelTest {
    
    /**
     *
     */
    public WholeSlide_view_panelTest() {
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
     * Test of isShowing method, of class WholeSlide_view_panel.
     */
    @Test
    public void testIsShowing() {
        System.out.println("isShowing");
        int x = 0;
        int y = 0;
        WholeSlide_view_panel instance = null;
        boolean expResult = false;
        boolean result = instance.isShowing(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspot method, of class WholeSlide_view_panel.
     */
    @Test
    public void testShowTMAspot_TMAspot_boolean() {
        System.out.println("showTMAspot");
        TMAspot ts = null;
        boolean forceRepaint = false;
        WholeSlide_view_panel instance = null;
        instance.showTMAspot(ts, forceRepaint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class WholeSlide_view_panel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        WholeSlide_view_panel instance = null;
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspot method, of class WholeSlide_view_panel.
     */
    @Test
    public void testShowTMAspot_TMAspot() {
        System.out.println("showTMAspot");
        TMAspot ts = null;
        WholeSlide_view_panel instance = null;
        instance.showTMAspot(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTMAspot method, of class WholeSlide_view_panel.
     */
    @Test
    public void testGetTMAspot() {
        System.out.println("getTMAspot");
        WholeSlide_view_panel instance = null;
        TMAspot expResult = null;
        TMAspot result = instance.getTMAspot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageWidth method, of class WholeSlide_view_panel.
     */
    @Test
    public void testGetImageWidth() {
        System.out.println("getImageWidth");
        WholeSlide_view_panel instance = null;
        int expResult = 0;
        int result = instance.getImageWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageHeight method, of class WholeSlide_view_panel.
     */
    @Test
    public void testGetImageHeight() {
        System.out.println("getImageHeight");
        WholeSlide_view_panel instance = null;
        int expResult = 0;
        int result = instance.getImageHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentPolyline_x method, of class WholeSlide_view_panel.
     */
    @Test
    public void testGetRecentPolyline_x() {
        System.out.println("getRecentPolyline_x");
        WholeSlide_view_panel instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.getRecentPolyline_x();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentPolyline_y method, of class WholeSlide_view_panel.
     */
    @Test
    public void testGetRecentPolyline_y() {
        System.out.println("getRecentPolyline_y");
        WholeSlide_view_panel instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.getRecentPolyline_y();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reliefRecentPolyLine method, of class WholeSlide_view_panel.
     */
    @Test
    public void testReliefRecentPolyLine() {
        System.out.println("reliefRecentPolyLine");
        WholeSlide_view_panel instance = null;
        instance.reliefRecentPolyLine();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enablePopupMenu method, of class WholeSlide_view_panel.
     */
    @Test
    public void testEnablePopupMenu() {
        System.out.println("enablePopupMenu");
        boolean b = false;
        WholeSlide_view_panel instance = null;
        instance.enablePopupMenu(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class WholeSlide_view_panel.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        WholeSlide_view_panel instance = null;
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jumpToVisibleLocus method, of class WholeSlide_view_panel.
     */
    @Test
    public void testJumpToVisibleLocus() {
        System.out.println("jumpToVisibleLocus");
        int x = 0;
        int y = 0;
        WholeSlide_view_panel instance = null;
        instance.jumpToVisibleLocus(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
