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

import java.awt.image.BufferedImage;
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
public class ForkBlurTest {
    
    /**
     *
     */
    public ForkBlurTest() {
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
     * Test of computeDirectly method, of class ForkBlur.
     */
    @Test
    public void testComputeDirectly() {
        System.out.println("computeDirectly");
        ForkBlur instance = null;
        instance.computeDirectly();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compute method, of class ForkBlur.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        ForkBlur instance = null;
        instance.compute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ForkBlur.
     * @throws java.lang.Exception
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ForkBlur.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of blur method, of class ForkBlur.
     */
    @Test
    public void testBlur() {
        System.out.println("blur");
        BufferedImage srcImage = null;
        BufferedImage expResult = null;
        BufferedImage result = ForkBlur.blur(srcImage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
