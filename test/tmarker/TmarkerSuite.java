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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tmarker.TMAspot.TMAspotSuite;
import tmarker.delaunay.DelaunaySuite;
import tmarker.img.ImgSuite;
import tmarker.misc.MiscSuite;
import tmarker.ndpi.NdpiSuite;

/**
 *
 * @author victoriaalers
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TMAspotSuite.class, ExampleFileFilterTest.class, LegendElementTest.class, NoneSelectedButtonGroupTest.class, ImgSuite.class, PerformanceOverviewPanelTest.class, BgCorrectionThreadTest.class, WholeSlide_view_panelTest.class, MiscSuite.class, tmarkerTest.class, NdpiSuite.class, DelaunaySuite.class, ForkBlurTest.class, OptionDialogTest.class, FileChooserTest.class, TMA_view_panelTest.class, LegendElementIconTest.class, TMAspot_view_panelTest.class, BgCorrectionDialogTest.class, LegendElementNucleusTest.class, TMARKERAboutBoxTest.class, LogoPanelTest.class, UpdateDialogTest.class})
public class TmarkerSuite {

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }
    
}
