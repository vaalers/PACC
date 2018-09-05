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

import java.awt.Point;
import java.util.Iterator;
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
public class TriangleTest {
    
    /**
     *
     */
    public TriangleTest() {
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
     * Test of toString method, of class Triangle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangle instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVertexButNot method, of class Triangle.
     */
    @Test
    public void testGetVertexButNot() {
        System.out.println("getVertexButNot");
        Pnt[] badVertices = null;
        Triangle instance = null;
        Pnt expResult = null;
        Pnt result = instance.getVertexButNot(badVertices);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNeighbor method, of class Triangle.
     */
    @Test
    public void testIsNeighbor() {
        System.out.println("isNeighbor");
        Triangle triangle = null;
        Triangle instance = null;
        boolean expResult = false;
        boolean result = instance.isNeighbor(triangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of facetOpposite method, of class Triangle.
     */
    @Test
    public void testFacetOpposite() {
        System.out.println("facetOpposite");
        Pnt vertex = null;
        Triangle instance = null;
        ArraySet<Pnt> expResult = null;
        ArraySet<Pnt> result = instance.facetOpposite(vertex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCircumcenter method, of class Triangle.
     */
    @Test
    public void testGetCircumcenter() {
        System.out.println("getCircumcenter");
        Triangle instance = null;
        Pnt expResult = null;
        Pnt result = instance.getCircumcenter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Triangle.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Pnt vertex = null;
        Triangle instance = null;
        boolean expResult = false;
        boolean result = instance.add(vertex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Triangle.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Triangle instance = null;
        Iterator<Pnt> expResult = null;
        Iterator<Pnt> result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Triangle.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Triangle instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Triangle.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Triangle instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Triangle.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        int x = 0;
        int y = 0;
        Triangle instance = null;
        boolean expResult = false;
        boolean result = instance.contains(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class Triangle.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        int width = 0;
        int height = 0;
        Triangle instance = null;
        List<Point> expResult = null;
        List<Point> result = instance.getPoints(width, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
