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

import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
public class TriangulationTest {
    
    /**
     *
     */
    public TriangulationTest() {
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
     * Test of iterator method, of class Triangulation.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Triangulation instance = null;
        Iterator<Triangle> expResult = null;
        Iterator<Triangle> result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Triangulation.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Triangulation instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Triangulation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangulation instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Triangulation.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object triangle = null;
        Triangulation instance = null;
        boolean expResult = false;
        boolean result = instance.contains(triangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of neighborOpposite method, of class Triangulation.
     */
    @Test
    public void testNeighborOpposite() {
        System.out.println("neighborOpposite");
        Pnt site = null;
        Triangle triangle = null;
        Triangulation instance = null;
        Triangle expResult = null;
        Triangle result = instance.neighborOpposite(site, triangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of neighbors method, of class Triangulation.
     */
    @Test
    public void testNeighbors() {
        System.out.println("neighbors");
        Triangle triangle = null;
        Triangulation instance = null;
        Set<Triangle> expResult = null;
        Set<Triangle> result = instance.neighbors(triangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of surroundingTriangles method, of class Triangulation.
     */
    @Test
    public void testSurroundingTriangles() {
        System.out.println("surroundingTriangles");
        Pnt site = null;
        Triangle triangle = null;
        Triangulation instance = null;
        List<Triangle> expResult = null;
        List<Triangle> result = instance.surroundingTriangles(site, triangle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of locate method, of class Triangulation.
     */
    @Test
    public void testLocate() {
        System.out.println("locate");
        Pnt point = null;
        Triangulation instance = null;
        Triangle expResult = null;
        Triangle result = instance.locate(point);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delaunayPlace method, of class Triangulation.
     */
    @Test
    public void testDelaunayPlace() {
        System.out.println("delaunayPlace");
        Pnt site = null;
        Triangulation instance = null;
        instance.delaunayPlace(site);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Triangulation.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Triangulation.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
