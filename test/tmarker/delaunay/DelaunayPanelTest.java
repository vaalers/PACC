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
package tmarker.delaunay;

import java.awt.Color;
import java.awt.Graphics;
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
public class DelaunayPanelTest {
    
    /**
     *
     */
    public DelaunayPanelTest() {
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
     * Test of addSite method, of class DelaunayPanel.
     */
    @Test
    public void testAddSite() {
        System.out.println("addSite");
        Pnt point = null;
        DelaunayPanel instance = null;
        instance.addSite(point);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class DelaunayPanel.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        DelaunayPanel instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class DelaunayPanel.
     */
    @Test
    public void testDraw_Pnt() {
        System.out.println("draw");
        Pnt point = null;
        DelaunayPanel instance = null;
        instance.draw(point);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class DelaunayPanel.
     */
    @Test
    public void testDraw_3args() {
        System.out.println("draw");
        Pnt center = null;
        double radius = 0.0;
        Color fillColor = null;
        DelaunayPanel instance = null;
        instance.draw(center, radius, fillColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class DelaunayPanel.
     */
    @Test
    public void testDraw_PntArr_Color() {
        System.out.println("draw");
        Pnt[] polygon = null;
        Color fillColor = null;
        DelaunayPanel instance = null;
        instance.draw(polygon, fillColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class DelaunayPanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        DelaunayPanel instance = null;
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawAllDelaunay method, of class DelaunayPanel.
     */
    @Test
    public void testDrawAllDelaunay() {
        System.out.println("drawAllDelaunay");
        boolean withFill = false;
        DelaunayPanel instance = null;
        instance.drawAllDelaunay(withFill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawAllVoronoi method, of class DelaunayPanel.
     */
    @Test
    public void testDrawAllVoronoi() {
        System.out.println("drawAllVoronoi");
        boolean withFill = false;
        boolean withSites = false;
        DelaunayPanel instance = null;
        instance.drawAllVoronoi(withFill, withSites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawAllCircles method, of class DelaunayPanel.
     */
    @Test
    public void testDrawAllCircles() {
        System.out.println("drawAllCircles");
        DelaunayPanel instance = null;
        instance.drawAllCircles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
