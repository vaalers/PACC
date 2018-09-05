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

import java.util.Collection;
import java.util.Iterator;
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
public class ArraySetTest {
    
    /**
     *
     */
    public ArraySetTest() {
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
     * Test of get method, of class ArraySet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        ArraySet instance = new ArraySet();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAny method, of class ArraySet.
     */
    @Test
    public void testContainsAny() {
        System.out.println("containsAny");
        Collection collection = null;
        ArraySet instance = new ArraySet();
        boolean expResult = false;
        boolean result = instance.containsAny(collection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ArraySet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        ArraySet instance = new ArraySet();
        boolean expResult = false;
        boolean result = instance.add(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class ArraySet.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        ArraySet instance = new ArraySet();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ArraySet.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArraySet instance = new ArraySet();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
