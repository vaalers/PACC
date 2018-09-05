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

import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.JScrollPane;
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
public class TMA_view_panelTest {
    
    /**
     *
     */
    public TMA_view_panelTest() {
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
     * Test of getTMAspot method, of class TMA_view_panel.
     */
    @Test
    public void testGetTMAspot() {
        System.out.println("getTMAspot");
        TMA_view_panel instance = new TMA_view_panelImpl();
        TMAspot expResult = null;
        TMAspot result = instance.getTMAspot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowing method, of class TMA_view_panel.
     */
    @Test
    public void testIsShowing() {
        System.out.println("isShowing");
        int x = 0;
        int y = 0;
        TMA_view_panel instance = new TMA_view_panelImpl();
        boolean expResult = false;
        boolean result = instance.isShowing(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspot method, of class TMA_view_panel.
     */
    @Test
    public void testShowTMAspot_TMAspot() {
        System.out.println("showTMAspot");
        TMAspot ts = null;
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.showTMAspot(ts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTMAspot method, of class TMA_view_panel.
     */
    @Test
    public void testShowTMAspot_TMAspot_boolean() {
        System.out.println("showTMAspot");
        TMAspot ts = null;
        boolean forceRepaint = false;
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.showTMAspot(ts, forceRepaint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class TMA_view_panel.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        TMA_view_panel instance = new TMA_view_panelImpl();
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageWidth method, of class TMA_view_panel.
     */
    @Test
    public void testGetImageWidth() {
        System.out.println("getImageWidth");
        TMA_view_panel instance = new TMA_view_panelImpl();
        int expResult = 0;
        int result = instance.getImageWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageHeight method, of class TMA_view_panel.
     */
    @Test
    public void testGetImageHeight() {
        System.out.println("getImageHeight");
        TMA_view_panel instance = new TMA_view_panelImpl();
        int expResult = 0;
        int result = instance.getImageHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentPolyline_x method, of class TMA_view_panel.
     */
    @Test
    public void testGetRecentPolyline_x() {
        System.out.println("getRecentPolyline_x");
        TMA_view_panel instance = new TMA_view_panelImpl();
        List<Integer> expResult = null;
        List<Integer> result = instance.getRecentPolyline_x();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentPolyline_y method, of class TMA_view_panel.
     */
    @Test
    public void testGetRecentPolyline_y() {
        System.out.println("getRecentPolyline_y");
        TMA_view_panel instance = new TMA_view_panelImpl();
        List<Integer> expResult = null;
        List<Integer> result = instance.getRecentPolyline_y();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reliefRecentPolyLine method, of class TMA_view_panel.
     */
    @Test
    public void testReliefRecentPolyLine() {
        System.out.println("reliefRecentPolyLine");
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.reliefRecentPolyLine();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enablePopupMenu method, of class TMA_view_panel.
     */
    @Test
    public void testEnablePopupMenu() {
        System.out.println("enablePopupMenu");
        boolean b = false;
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.enablePopupMenu(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of repaint method, of class TMA_view_panel.
     */
    @Test
    public void testRepaint() {
        System.out.println("repaint");
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.repaint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoom method, of class TMA_view_panel.
     */
    @Test
    public void testSetZoom() {
        System.out.println("setZoom");
        double z = 0.0;
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.setZoom(z);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoom method, of class TMA_view_panel.
     */
    @Test
    public void testGetZoom() {
        System.out.println("getZoom");
        TMA_view_panel instance = new TMA_view_panelImpl();
        double expResult = 0.0;
        double result = instance.getZoom();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParentScrollPane method, of class TMA_view_panel.
     */
    @Test
    public void testSetParentScrollPane() {
        System.out.println("setParentScrollPane");
        JScrollPane parent = null;
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.setParentScrollPane(parent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jumpToVisibleLocus method, of class TMA_view_panel.
     */
    @Test
    public void testJumpToVisibleLocus() {
        System.out.println("jumpToVisibleLocus");
        int x = 0;
        int y = 0;
        TMA_view_panel instance = new TMA_view_panelImpl();
        instance.jumpToVisibleLocus(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisibleRect method, of class TMA_view_panel.
     */
    @Test
    public void testGetVisibleRect() {
        System.out.println("getVisibleRect");
        TMA_view_panel instance = new TMA_view_panelImpl();
        Rectangle expResult = null;
        Rectangle result = instance.getVisibleRect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     */
    public class TMA_view_panelImpl implements TMA_view_panel {

        public TMAspot getTMAspot() {
            return null;
        }

        public boolean isShowing(int x, int y) {
            return false;
        }

        /**
         *
         * @param ts
         */
        public void showTMAspot(TMAspot ts) {
        }

        /**
         *
         * @param ts
         * @param forceRepaint
         */
        public void showTMAspot(TMAspot ts, boolean forceRepaint) {
        }

        public Image getImage() {
            return null;
        }

        public int getImageWidth() {
            return 0;
        }

        public int getImageHeight() {
            return 0;
        }

        public List<Integer> getRecentPolyline_x() {
            return null;
        }

        public List<Integer> getRecentPolyline_y() {
            return null;
        }

        public void reliefRecentPolyLine() {
        }

        public void enablePopupMenu(boolean b) {
        }

        public void repaint() {
        }

        public void setZoom(double z) {
        }

        public double getZoom() {
            return 0.0;
        }

        public void setParentScrollPane(JScrollPane parent) {
        }

        public void jumpToVisibleLocus(int x, int y) {
        }

        /**
         *
         * @return
         */
        public Rectangle getVisibleRect() {
            return null;
        }
    }
    
}
