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
public class GraphTest {
    
    /**
     *
     */
    public GraphTest() {
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
     * Test of add method, of class Graph.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object node = null;
        Graph instance = new Graph();
        instance.add(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Graph.
     */
    @Test
    public void testAdd_GenericType_GenericType() {
        System.out.println("add");
        Object nodeA = null;
        Object nodeB = null;
        Graph instance = new Graph();
        instance.add(nodeA, nodeB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Graph.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object node = null;
        Graph instance = new Graph();
        instance.remove(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Graph.
     */
    @Test
    public void testRemove_GenericType_GenericType() {
        System.out.println("remove");
        Object nodeA = null;
        Object nodeB = null;
        Graph instance = new Graph();
        instance.remove(nodeA, nodeB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of neighbors method, of class Graph.
     */
    @Test
    public void testNeighbors() {
        System.out.println("neighbors");
        Object node = null;
        Graph instance = new Graph();
        Set expResult = null;
        Set result = instance.neighbors(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nodeSet method, of class Graph.
     */
    @Test
    public void testNodeSet() {
        System.out.println("nodeSet");
        Graph instance = new Graph();
        Set expResult = null;
        Set result = instance.nodeSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
