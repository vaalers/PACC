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
package tmarker.misc;

import java.net.URL;
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
public class DownloadTest {
    
    /**
     *
     */
    public DownloadTest() {
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
     * Test of getUrl method, of class Download.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        Download instance = null;
        String expResult = "";
        String result = instance.getUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Download.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Download instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProgress method, of class Download.
     */
    @Test
    public void testGetProgress() {
        System.out.println("getProgress");
        Download instance = null;
        float expResult = 0.0F;
        float result = instance.getProgress();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Download.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Download instance = null;
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class Download.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        Download instance = null;
        instance.pause();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resume method, of class Download.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        Download instance = null;
        instance.resume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class Download.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        Download instance = null;
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThread method, of class Download.
     */
    @Test
    public void testGetThread() {
        System.out.println("getThread");
        Download instance = null;
        Thread expResult = null;
        Thread result = instance.getThread();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class Download.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        URL url = null;
        Download instance = null;
        String expResult = "";
        String result = instance.getFileName(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Download.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Download instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
