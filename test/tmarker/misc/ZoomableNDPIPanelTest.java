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
package tmarker.misc;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openslide.OpenSlide;

/**
 *
 * @author victoriaalers
 */
public class ZoomableNDPIPanelTest {
    
    /**
     *
     */
    public ZoomableNDPIPanelTest() {
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
     * Test of setParentScrollPane method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testSetParentScrollPane() {
        System.out.println("setParentScrollPane");
        JScrollPane parent = null;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.setParentScrollPane(parent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMouseWheelEnabled method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testIsMouseWheelEnabled() {
        System.out.println("isMouseWheelEnabled");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        boolean expResult = false;
        boolean result = instance.isMouseWheelEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMouseWheelEnabled method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testSetMouseWheelEnabled() {
        System.out.println("setMouseWheelEnabled");
        boolean enabled = false;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.setMouseWheelEnabled(enabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoom method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testGetZoom() {
        System.out.println("getZoom");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        double expResult = 0.0;
        double result = instance.getZoom();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoom method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testSetZoom() {
        System.out.println("setZoom");
        double zoom = 0.0;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.setZoom(zoom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseZoom method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testDecreaseZoom() {
        System.out.println("decreaseZoom");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.decreaseZoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseZoom method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testIncreaseZoom() {
        System.out.println("increaseZoom");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.increaseZoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoomFactor method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testGetZoomFactor() {
        System.out.println("getZoomFactor");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        double expResult = 0.0;
        double result = instance.getZoomFactor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoomFactor method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testSetZoomFactor() {
        System.out.println("setZoomFactor");
        double zoomFactor = 0.0;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.setZoomFactor(zoomFactor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoomMax method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testGetZoomMax() {
        System.out.println("getZoomMax");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        double expResult = 0.0;
        double result = instance.getZoomMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoomMax method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testSetZoomMax() {
        System.out.println("setZoomMax");
        double zoomMax = 0.0;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.setZoomMax(zoomMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoomMin method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testGetZoomMin() {
        System.out.println("getZoomMin");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        double expResult = 0.0;
        double result = instance.getZoomMin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoomMin method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testSetZoomMin() {
        System.out.println("setZoomMin");
        double zoomMin = 0.0;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.setZoomMin(zoomMin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenSlide method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testGetOpenSlide() {
        System.out.println("getOpenSlide");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        OpenSlide expResult = null;
        OpenSlide result = instance.getOpenSlide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpenSlide method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testSetOpenSlide() {
        System.out.println("setOpenSlide");
        OpenSlide os = null;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.setOpenSlide(os);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreferredSize method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testGetPreferredSize() {
        System.out.println("getPreferredSize");
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        Dimension expResult = null;
        Dimension result = instance.getPreferredSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class ZoomableNDPIPanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        ZoomableNDPIPanel instance = new ZoomableNDPIPanel();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
