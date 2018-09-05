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

import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.List;
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
public class DelaunayApTest {
    
    /**
     *
     */
    public DelaunayApTest() {
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
     * Test of main method, of class DelaunayAp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DelaunayAp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class DelaunayAp.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        DelaunayAp instance = new DelaunayAp();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class DelaunayAp.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        DelaunayAp instance = new DelaunayAp();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class DelaunayAp.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        DelaunayAp instance = new DelaunayAp();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseEntered method, of class DelaunayAp.
     */
    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        DelaunayAp instance = new DelaunayAp();
        instance.mouseEntered(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseExited method, of class DelaunayAp.
     */
    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        DelaunayAp instance = new DelaunayAp();
        instance.mouseExited(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mousePressed method, of class DelaunayAp.
     */
    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        DelaunayAp instance = new DelaunayAp();
        instance.mousePressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseReleased method, of class DelaunayAp.
     */
    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        DelaunayAp instance = new DelaunayAp();
        instance.mouseReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseClicked method, of class DelaunayAp.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        DelaunayAp instance = new DelaunayAp();
        instance.mouseClicked(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isColorful method, of class DelaunayAp.
     */
    @Test
    public void testIsColorful() {
        System.out.println("isColorful");
        DelaunayAp instance = new DelaunayAp();
        boolean expResult = false;
        boolean result = instance.isColorful();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVoronoi method, of class DelaunayAp.
     */
    @Test
    public void testIsVoronoi() {
        System.out.println("isVoronoi");
        DelaunayAp instance = new DelaunayAp();
        boolean expResult = false;
        boolean result = instance.isVoronoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showingCircles method, of class DelaunayAp.
     */
    @Test
    public void testShowingCircles() {
        System.out.println("showingCircles");
        DelaunayAp instance = new DelaunayAp();
        boolean expResult = false;
        boolean result = instance.showingCircles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showingDelaunay method, of class DelaunayAp.
     */
    @Test
    public void testShowingDelaunay() {
        System.out.println("showingDelaunay");
        DelaunayAp instance = new DelaunayAp();
        boolean expResult = false;
        boolean result = instance.showingDelaunay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showingVoronoi method, of class DelaunayAp.
     */
    @Test
    public void testShowingVoronoi() {
        System.out.println("showingVoronoi");
        DelaunayAp instance = new DelaunayAp();
        boolean expResult = false;
        boolean result = instance.showingVoronoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllVoronoiPoints method, of class DelaunayAp.
     */
    @Test
    public void testGetAllVoronoiPoints() {
        System.out.println("getAllVoronoiPoints");
        List<Pnt> points = null;
        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;
        List<Pnt> expResult = null;
        List<Pnt> result = DelaunayAp.getAllVoronoiPoints(points, minX, maxX, minY, maxY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllVoronoiPolygons method, of class DelaunayAp.
     */
    @Test
    public void testGetAllVoronoiPolygons() {
        System.out.println("getAllVoronoiPolygons");
        List<Pnt> points = null;
        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;
        List<Polygon> expResult = null;
        List<Polygon> result = DelaunayAp.getAllVoronoiPolygons(points, minX, maxX, minY, maxY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDelaunayTriangles method, of class DelaunayAp.
     */
    @Test
    public void testGetAllDelaunayTriangles() {
        System.out.println("getAllDelaunayTriangles");
        List<Pnt> points = null;
        int minX = 0;
        int maxX = 0;
        int minY = 0;
        int maxY = 0;
        List<Triangle> expResult = null;
        List<Triangle> result = DelaunayAp.getAllDelaunayTriangles(points, minX, maxX, minY, maxY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
