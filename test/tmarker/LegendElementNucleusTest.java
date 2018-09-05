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

import java.awt.Color;
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
public class LegendElementNucleusTest {
    
    /**
     *
     */
    public LegendElementNucleusTest() {
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
     * Test of createNucIcon method, of class LegendElementNucleus.
     */
    @Test
    public void testCreateNucIcon() {
        System.out.println("createNucIcon");
        LegendElementNucleus instance = null;
        instance.createNucIcon();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doubleClickAction method, of class LegendElementNucleus.
     */
    @Test
    public void testDoubleClickAction() {
        System.out.println("doubleClickAction");
        LegendElementNucleus instance = null;
        instance.doubleClickAction();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class LegendElementNucleus.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Color fg = null;
        LegendElementNucleus instance = null;
        instance.setColor(fg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class LegendElementNucleus.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        LegendElementNucleus instance = null;
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNucLabel method, of class LegendElementNucleus.
     */
    @Test
    public void testGetNucLabel() {
        System.out.println("getNucLabel");
        LegendElementNucleus instance = null;
        byte expResult = 0;
        byte result = instance.getNucLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNucLabel method, of class LegendElementNucleus.
     */
    @Test
    public void testSetNucLabel() {
        System.out.println("setNucLabel");
        byte label = 0;
        LegendElementNucleus instance = null;
        instance.setNucLabel(label);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStaining method, of class LegendElementNucleus.
     */
    @Test
    public void testGetStaining() {
        System.out.println("getStaining");
        LegendElementNucleus instance = null;
        byte expResult = 0;
        byte result = instance.getStaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStaining method, of class LegendElementNucleus.
     */
    @Test
    public void testSetStaining() {
        System.out.println("setStaining");
        byte staining = 0;
        LegendElementNucleus instance = null;
        instance.setStaining(staining);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
