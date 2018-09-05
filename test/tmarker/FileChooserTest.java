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
import java.util.List;
import javax.swing.JFrame;
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
public class FileChooserTest {
    
    /**
     *
     */
    public FileChooserTest() {
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
     * Test of chooseLoadingFiles method, of class FileChooser.
     */
    @Test
    public void testChooseLoadingFiles() {
        System.out.println("chooseLoadingFiles");
        JFrame t = null;
        String currentDir = "";
        File[] expResult = null;
        File[] result = FileChooser.chooseLoadingFiles(t, currentDir);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseLoadingFile method, of class FileChooser.
     */
    @Test
    public void testChooseLoadingFile() {
        System.out.println("chooseLoadingFile");
        JFrame t = null;
        String currentDir = "";
        List<String> extensions = null;
        List<String> descriptions = null;
        File expResult = null;
        File result = FileChooser.chooseLoadingFile(t, currentDir, extensions, descriptions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseSavingFile method, of class FileChooser.
     */
    @Test
    public void testChooseSavingFile_3args() {
        System.out.println("chooseSavingFile");
        JFrame t = null;
        String currentDir = "";
        String standardFilename = "";
        File expResult = null;
        File result = FileChooser.chooseSavingFile(t, currentDir, standardFilename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseSavingFile method, of class FileChooser.
     */
    @Test
    public void testChooseSavingFile_5args() {
        System.out.println("chooseSavingFile");
        JFrame t = null;
        String currentDir = "";
        String standardFilename = "";
        List<String> extensions = null;
        List<String> descriptions = null;
        File expResult = null;
        File result = FileChooser.chooseSavingFile(t, currentDir, standardFilename, extensions, descriptions);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseSavingFolder method, of class FileChooser.
     */
    @Test
    public void testChooseSavingFolder() {
        System.out.println("chooseSavingFolder");
        JFrame t = null;
        String currentDir = "";
        File expResult = null;
        File result = FileChooser.chooseSavingFolder(t, currentDir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseCSVFile method, of class FileChooser.
     */
    @Test
    public void testChooseCSVFile() {
        System.out.println("chooseCSVFile");
        JFrame t = null;
        String currentDir = "";
        File expResult = null;
        File result = FileChooser.chooseCSVFile(t, currentDir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWritable method, of class FileChooser.
     */
    @Test
    public void testIsWritable() {
        System.out.println("isWritable");
        JFrame parent = null;
        File f = null;
        boolean expResult = false;
        boolean result = FileChooser.isWritable(parent, f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionDialog method, of class FileChooser.
     */
    @Test
    public void testSetQuestionDialog() {
        System.out.println("setQuestionDialog");
        JFrame parent = null;
        String s = "";
        boolean expResult = false;
        boolean result = FileChooser.setQuestionDialog(parent, s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
