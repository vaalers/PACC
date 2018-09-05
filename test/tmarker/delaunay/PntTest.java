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
public class PntTest {
    
    /**
     *
     */
    public PntTest() {
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
     * Test of toString method, of class Pnt.
     */
    @Test
    public void testToString_0args() {
        System.out.println("toString");
        Pnt instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pnt.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        Pnt instance = null;
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pnt.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pnt instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of coord method, of class Pnt.
     */
    @Test
    public void testCoord() {
        System.out.println("coord");
        int i = 0;
        Pnt instance = null;
        double expResult = 0.0;
        double result = instance.coord(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dimension method, of class Pnt.
     */
    @Test
    public void testDimension() {
        System.out.println("dimension");
        Pnt instance = null;
        int expResult = 0;
        int result = instance.dimension();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dimCheck method, of class Pnt.
     */
    @Test
    public void testDimCheck() {
        System.out.println("dimCheck");
        Pnt p = null;
        Pnt instance = null;
        int expResult = 0;
        int result = instance.dimCheck(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extend method, of class Pnt.
     */
    @Test
    public void testExtend() {
        System.out.println("extend");
        double[] coords = null;
        Pnt instance = null;
        Pnt expResult = null;
        Pnt result = instance.extend(coords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dot method, of class Pnt.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Pnt p = null;
        Pnt instance = null;
        double expResult = 0.0;
        double result = instance.dot(p);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of magnitude method, of class Pnt.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Pnt instance = null;
        double expResult = 0.0;
        double result = instance.magnitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Pnt.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Pnt p = null;
        Pnt instance = null;
        Pnt expResult = null;
        Pnt result = instance.subtract(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Pnt.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Pnt p = null;
        Pnt instance = null;
        Pnt expResult = null;
        Pnt result = instance.add(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of angle method, of class Pnt.
     */
    @Test
    public void testAngle() {
        System.out.println("angle");
        Pnt p = null;
        Pnt instance = null;
        double expResult = 0.0;
        double result = instance.angle(p);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bisector method, of class Pnt.
     */
    @Test
    public void testBisector() {
        System.out.println("bisector");
        Pnt point = null;
        Pnt instance = null;
        Pnt expResult = null;
        Pnt result = instance.bisector(point);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pnt.
     */
    @Test
    public void testToString_PntArr() {
        System.out.println("toString");
        Pnt[] matrix = null;
        String expResult = "";
        String result = Pnt.toString(matrix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinant method, of class Pnt.
     */
    @Test
    public void testDeterminant() {
        System.out.println("determinant");
        Pnt[] matrix = null;
        double expResult = 0.0;
        double result = Pnt.determinant(matrix);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cross method, of class Pnt.
     */
    @Test
    public void testCross() {
        System.out.println("cross");
        Pnt[] matrix = null;
        Pnt expResult = null;
        Pnt result = Pnt.cross(matrix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of content method, of class Pnt.
     */
    @Test
    public void testContent() {
        System.out.println("content");
        Pnt[] simplex = null;
        double expResult = 0.0;
        double result = Pnt.content(simplex);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of relation method, of class Pnt.
     */
    @Test
    public void testRelation() {
        System.out.println("relation");
        Pnt[] simplex = null;
        Pnt instance = null;
        int[] expResult = null;
        int[] result = instance.relation(simplex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOutside method, of class Pnt.
     */
    @Test
    public void testIsOutside() {
        System.out.println("isOutside");
        Pnt[] simplex = null;
        Pnt instance = null;
        Pnt expResult = null;
        Pnt result = instance.isOutside(simplex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOn method, of class Pnt.
     */
    @Test
    public void testIsOn() {
        System.out.println("isOn");
        Pnt[] simplex = null;
        Pnt instance = null;
        Pnt expResult = null;
        Pnt result = instance.isOn(simplex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInside method, of class Pnt.
     */
    @Test
    public void testIsInside() {
        System.out.println("isInside");
        Pnt[] simplex = null;
        Pnt instance = null;
        boolean expResult = false;
        boolean result = instance.isInside(simplex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vsCircumcircle method, of class Pnt.
     */
    @Test
    public void testVsCircumcircle() {
        System.out.println("vsCircumcircle");
        Pnt[] simplex = null;
        Pnt instance = null;
        int expResult = 0;
        int result = instance.vsCircumcircle(simplex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of circumcenter method, of class Pnt.
     */
    @Test
    public void testCircumcenter() {
        System.out.println("circumcenter");
        Pnt[] simplex = null;
        Pnt expResult = null;
        Pnt result = Pnt.circumcenter(simplex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Pnt.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Pnt.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
