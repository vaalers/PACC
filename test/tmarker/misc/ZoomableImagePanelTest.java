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
import java.awt.Image;
import javax.swing.JScrollPane;
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
public class ZoomableImagePanelTest {
    
    /**
     *
     */
    public ZoomableImagePanelTest() {
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
     * Test of setParentScrollPane method, of class ZoomableImagePanel.
     */
    @Test
    public void testSetParentScrollPane() {
        System.out.println("setParentScrollPane");
        JScrollPane parent = null;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.setParentScrollPane(parent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMouseWheelEnabled method, of class ZoomableImagePanel.
     */
    @Test
    public void testIsMouseWheelEnabled() {
        System.out.println("isMouseWheelEnabled");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        boolean expResult = false;
        boolean result = instance.isMouseWheelEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMouseWheelEnabled method, of class ZoomableImagePanel.
     */
    @Test
    public void testSetMouseWheelEnabled() {
        System.out.println("setMouseWheelEnabled");
        boolean enabled = false;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.setMouseWheelEnabled(enabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoom method, of class ZoomableImagePanel.
     */
    @Test
    public void testGetZoom() {
        System.out.println("getZoom");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        double expResult = 0.0;
        double result = instance.getZoom();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoom method, of class ZoomableImagePanel.
     */
    @Test
    public void testSetZoom() {
        System.out.println("setZoom");
        double zoom = 0.0;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.setZoom(zoom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseZoom method, of class ZoomableImagePanel.
     */
    @Test
    public void testDecreaseZoom() {
        System.out.println("decreaseZoom");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.decreaseZoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseZoom method, of class ZoomableImagePanel.
     */
    @Test
    public void testIncreaseZoom() {
        System.out.println("increaseZoom");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.increaseZoom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoomFactor method, of class ZoomableImagePanel.
     */
    @Test
    public void testGetZoomFactor() {
        System.out.println("getZoomFactor");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        double expResult = 0.0;
        double result = instance.getZoomFactor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoomFactor method, of class ZoomableImagePanel.
     */
    @Test
    public void testSetZoomFactor() {
        System.out.println("setZoomFactor");
        double zoomFactor = 0.0;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.setZoomFactor(zoomFactor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoomMax method, of class ZoomableImagePanel.
     */
    @Test
    public void testGetZoomMax() {
        System.out.println("getZoomMax");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        double expResult = 0.0;
        double result = instance.getZoomMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoomMax method, of class ZoomableImagePanel.
     */
    @Test
    public void testSetZoomMax() {
        System.out.println("setZoomMax");
        double zoomMax = 0.0;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.setZoomMax(zoomMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZoomMin method, of class ZoomableImagePanel.
     */
    @Test
    public void testGetZoomMin() {
        System.out.println("getZoomMin");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        double expResult = 0.0;
        double result = instance.getZoomMin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZoomMin method, of class ZoomableImagePanel.
     */
    @Test
    public void testSetZoomMin() {
        System.out.println("setZoomMin");
        double zoomMin = 0.0;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.setZoomMin(zoomMin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class ZoomableImagePanel.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class ZoomableImagePanel.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        Image image = null;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreferredSize method, of class ZoomableImagePanel.
     */
    @Test
    public void testGetPreferredSize() {
        System.out.println("getPreferredSize");
        ZoomableImagePanel instance = new ZoomableImagePanel();
        Dimension expResult = null;
        Dimension result = instance.getPreferredSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class ZoomableImagePanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        ZoomableImagePanel instance = new ZoomableImagePanel();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
