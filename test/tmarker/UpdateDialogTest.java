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
public class UpdateDialogTest {
    
    /**
     *
     */
    public UpdateDialogTest() {
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
     * Test of downloadAndExtractUpdates method, of class UpdateDialog.
     */
    @Test
    public void testDownloadAndExtractUpdates() {
        System.out.println("downloadAndExtractUpdates");
        UpdateDialog instance = null;
        instance.downloadAndExtractUpdates();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class UpdateDialog.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        JFrame parent = null;
        String thisRevision = "";
        String remoteRevision = "";
        boolean verbose = false;
        boolean installAutomatically = false;
        UpdateDialog instance = null;
        instance.main(parent, thisRevision, remoteRevision, verbose, installAutomatically);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkForUpdates method, of class UpdateDialog.
     */
    @Test
    public void testCheckForUpdates() {
        System.out.println("checkForUpdates");
        boolean verbose = false;
        boolean installAutomatically = false;
        UpdateDialog instance = null;
        instance.checkForUpdates(verbose, installAutomatically);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
