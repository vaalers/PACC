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

import java.io.File;
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
public class ExampleFileFilterTest {
    
    /**
     *
     */
    public ExampleFileFilterTest() {
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
     * Test of accept method, of class ExampleFileFilter.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        File f = null;
        ExampleFileFilter instance = new ExampleFileFilter();
        boolean expResult = false;
        boolean result = instance.accept(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExtension method, of class ExampleFileFilter.
     */
    @Test
    public void testGetExtension() {
        System.out.println("getExtension");
        File f = null;
        ExampleFileFilter instance = new ExampleFileFilter();
        String expResult = "";
        String result = instance.getExtension(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExtension method, of class ExampleFileFilter.
     */
    @Test
    public void testAddExtension() {
        System.out.println("addExtension");
        String extension = "";
        ExampleFileFilter instance = new ExampleFileFilter();
        instance.addExtension(extension);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class ExampleFileFilter.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        ExampleFileFilter instance = new ExampleFileFilter();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class ExampleFileFilter.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        ExampleFileFilter instance = new ExampleFileFilter();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExtensionListInDescription method, of class ExampleFileFilter.
     */
    @Test
    public void testSetExtensionListInDescription() {
        System.out.println("setExtensionListInDescription");
        boolean b = false;
        ExampleFileFilter instance = new ExampleFileFilter();
        instance.setExtensionListInDescription(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExtensionListInDescription method, of class ExampleFileFilter.
     */
    @Test
    public void testIsExtensionListInDescription() {
        System.out.println("isExtensionListInDescription");
        ExampleFileFilter instance = new ExampleFileFilter();
        boolean expResult = false;
        boolean result = instance.isExtensionListInDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
