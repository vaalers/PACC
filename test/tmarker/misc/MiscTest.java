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

import ij.gui.Roi;
import java.awt.Color;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.media.jai.ROI;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
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
public class MiscTest {
    
    /**
     *
     */
    public MiscTest() {
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
     * Test of FilePathStringtoExtension method, of class Misc.
     */
    @Test
    public void testFilePathStringtoExtension() {
        System.out.println("FilePathStringtoExtension");
        String filepath = "";
        String expResult = "";
        String result = Misc.FilePathStringtoExtension(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilePathStringtoFilename method, of class Misc.
     */
    @Test
    public void testFilePathStringtoFilename() {
        System.out.println("FilePathStringtoFilename");
        String filepath = "";
        String expResult = "";
        String result = Misc.FilePathStringtoFilename(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilePathStringtoFilenameWOExtension method, of class Misc.
     */
    @Test
    public void testFilePathStringtoFilenameWOExtension() {
        System.out.println("FilePathStringtoFilenameWOExtension");
        String filepath = "";
        String expResult = "";
        String result = Misc.FilePathStringtoFilenameWOExtension(filepath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resizeArray method, of class Misc.
     */
    @Test
    public void testResizeArray() {
        System.out.println("resizeArray");
        Object oldArray = null;
        int newSize = 0;
        Object expResult = null;
        Object result = Misc.resizeArray(oldArray, newSize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pushbackArray method, of class Misc.
     */
    @Test
    public void testPushbackArray() {
        System.out.println("pushbackArray");
        Object oldArray = null;
        Object element = null;
        Misc.pushbackArray(oldArray, element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderArray method, of class Misc.
     */
    @Test
    public void testOrderArray() {
        System.out.println("orderArray");
        double[] array = null;
        boolean reverse = false;
        int[] expResult = null;
        int[] result = Misc.orderArray(array, reverse);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mean method, of class Misc.
     */
    @Test
    public void testMean_doubleArr() {
        System.out.println("mean");
        double[] a = null;
        double expResult = 0.0;
        double result = Misc.mean(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mean method, of class Misc.
     */
    @Test
    public void testMean_DoubleArr() {
        System.out.println("mean");
        Double[] a = null;
        double expResult = 0.0;
        double result = Misc.mean(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class Misc.
     */
    @Test
    public void testMax_intArr() {
        System.out.println("max");
        int[] a = null;
        int expResult = 0;
        int result = Misc.max(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class Misc.
     */
    @Test
    public void testMax_doubleArr() {
        System.out.println("max");
        double[] a = null;
        double expResult = 0.0;
        double result = Misc.max(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class Misc.
     */
    @Test
    public void testMax_doubleArrArr() {
        System.out.println("max");
        double[][] a = null;
        double expResult = 0.0;
        double result = Misc.max(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class Misc.
     */
    @Test
    public void testMin_doubleArrArr() {
        System.out.println("min");
        double[][] a = null;
        double expResult = 0.0;
        double result = Misc.min(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class Misc.
     */
    @Test
    public void testMin_intArr() {
        System.out.println("min");
        int[] a = null;
        int expResult = 0;
        int result = Misc.min(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class Misc.
     */
    @Test
    public void testMin_doubleArr() {
        System.out.println("min");
        double[] a = null;
        double expResult = 0.0;
        double result = Misc.min(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of var method, of class Misc.
     */
    @Test
    public void testVar() {
        System.out.println("var");
        double[] a = null;
        double expResult = 0.0;
        double result = Misc.var(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Euclidean_length method, of class Misc.
     */
    @Test
    public void testEuclidean_length() {
        System.out.println("Euclidean_length");
        double[] a = null;
        double expResult = 0.0;
        double result = Misc.Euclidean_length(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Euclidean_distance method, of class Misc.
     */
    @Test
    public void testEuclidean_distance() {
        System.out.println("Euclidean_distance");
        double[] a = null;
        double[] b = null;
        double expResult = 0.0;
        double result = Misc.Euclidean_distance(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of std method, of class Misc.
     */
    @Test
    public void testStd_doubleArr() {
        System.out.println("std");
        double[] a = null;
        double expResult = 0.0;
        double result = Misc.std(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of std method, of class Misc.
     */
    @Test
    public void testStd_DoubleArr() {
        System.out.println("std");
        Double[] a = null;
        double expResult = 0.0;
        double result = Misc.std(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of auc method, of class Misc.
     */
    @Test
    public void testAuc() {
        System.out.println("auc");
        double[] xs = null;
        double[] ys = null;
        double expResult = 0.0;
        double result = Misc.auc(xs, ys);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entropy method, of class Misc.
     */
    @Test
    public void testEntropy() {
        System.out.println("entropy");
        double[] vector = null;
        double expResult = 0.0;
        double result = Misc.entropy(vector);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RGBToGray method, of class Misc.
     */
    @Test
    public void testRGBToGray() {
        System.out.println("RGBToGray");
        double R = 0.0;
        double G = 0.0;
        double B = 0.0;
        double expResult = 0.0;
        double result = Misc.RGBToGray(R, G, B);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeImage method, of class Misc.
     */
    @Test
    public void testWriteImage_BufferedImage_String() {
        System.out.println("writeImage");
        BufferedImage bi = null;
        String filename = "";
        Misc.writeImage(bi, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeImage method, of class Misc.
     */
    @Test
    public void testWriteImage_Image_String() {
        System.out.println("writeImage");
        Image I = null;
        String filename = "";
        Misc.writeImage(I, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toBufferedImage method, of class Misc.
     */
    @Test
    public void testToBufferedImage() {
        System.out.println("toBufferedImage");
        Image image = null;
        BufferedImage expResult = null;
        BufferedImage result = Misc.toBufferedImage(image);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasAlpha method, of class Misc.
     */
    @Test
    public void testHasAlpha() {
        System.out.println("hasAlpha");
        Image image = null;
        boolean expResult = false;
        boolean result = Misc.hasAlpha(image);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeImage method, of class Misc.
     */
    @Test
    public void testWriteImage_3args() {
        System.out.println("writeImage");
        double[][] I = null;
        boolean normalize = false;
        String filename = "";
        Misc.writeImage(I, normalize, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeROI method, of class Misc.
     */
    @Test
    public void testWriteROI_ROI_String() {
        System.out.println("writeROI");
        ROI roi = null;
        String filename = "";
        Misc.writeROI(roi, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeROI method, of class Misc.
     */
    @Test
    public void testWriteROI_Roi_String() {
        System.out.println("writeROI");
        Roi roi = null;
        String filename = "";
        Misc.writeROI(roi, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Misc.
     */
    @Test
    public void testSum_doubleArr() {
        System.out.println("sum");
        double[] darray = null;
        double expResult = 0.0;
        double result = Misc.sum(darray);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Misc.
     */
    @Test
    public void testSum_intArr() {
        System.out.println("sum");
        int[] darray = null;
        int expResult = 0;
        int result = Misc.sum(darray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ElemProduct method, of class Misc.
     */
    @Test
    public void testElemProduct() {
        System.out.println("ElemProduct");
        int[] a = null;
        double k = 0.0;
        int[] expResult = null;
        int[] result = Misc.ElemProduct(a, k);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sample method, of class Misc.
     */
    @Test
    public void testSample() {
        System.out.println("sample");
        int n = 0;
        int k = 0;
        boolean replacement = false;
        int[] expResult = null;
        int[] result = Misc.sample(n, k, replacement);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sub2ind method, of class Misc.
     */
    @Test
    public void testSub2ind() {
        System.out.println("Sub2ind");
        int x = 0;
        int y = 0;
        int width = 0;
        int expResult = 0;
        int result = Misc.Sub2ind(x, y, width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ind2sub method, of class Misc.
     */
    @Test
    public void testInd2sub() {
        System.out.println("Ind2sub");
        int[] sub = null;
        int ind = 0;
        int width = 0;
        Misc.Ind2sub(sub, ind, width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IndexOf method, of class Misc.
     */
    @Test
    public void testIndexOf() {
        System.out.println("IndexOf");
        int[] array = null;
        int a = 0;
        int expResult = 0;
        int result = Misc.IndexOf(array, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToGrayscale method, of class Misc.
     */
    @Test
    public void testConvertToGrayscale() {
        System.out.println("convertToGrayscale");
        BufferedImage source = null;
        BufferedImage expResult = null;
        BufferedImage result = Misc.convertToGrayscale(source);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ROIToRoi method, of class Misc.
     */
    @Test
    public void testROIToRoi_ROI() {
        System.out.println("ROIToRoi");
        ROI roi = null;
        Roi expResult = null;
        Roi result = Misc.ROIToRoi(roi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ROIToRoi method, of class Misc.
     */
    @Test
    public void testROIToRoi_lROI() {
        System.out.println("ROIToRoi");
        lROI roi = null;
        Roi expResult = null;
        Roi result = Misc.ROIToRoi(roi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of concat method, of class Misc.
     */
    @Test
    public void testConcat_intArr_intArr() {
        System.out.println("concat");
        int[] A = null;
        int[] B = null;
        int[] expResult = null;
        int[] result = Misc.concat(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of concat method, of class Misc.
     */
    @Test
    public void testConcat_doubleArr_doubleArr() {
        System.out.println("concat");
        double[] A = null;
        double[] B = null;
        double[] expResult = null;
        double[] result = Misc.concat(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of concat method, of class Misc.
     */
    @Test
    public void testConcat_StringArr_StringArr() {
        System.out.println("concat");
        String[] A = null;
        String[] B = null;
        String[] expResult = null;
        String[] result = Misc.concat(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArrayToString method, of class Misc.
     */
    @Test
    public void testArrayToString() {
        System.out.println("ArrayToString");
        String[] ss = null;
        String delim = "";
        String expResult = "";
        String result = Misc.ArrayToString(ss, delim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of histogram method, of class Misc.
     */
    @Test
    public void testHistogram() {
        System.out.println("histogram");
        double[] data = null;
        double min = 0.0;
        double max = 0.0;
        int numBins = 0;
        int[] expResult = null;
        int[] result = Misc.histogram(data, min, max, numBins);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateSimilarity method, of class Misc.
     */
    @Test
    public void testCalculateSimilarity() {
        System.out.println("CalculateSimilarity");
        double[] u = null;
        double[] v = null;
        double expResult = 0.0;
        double result = Misc.CalculateSimilarity(u, v);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedButtonText method, of class Misc.
     */
    @Test
    public void testGetSelectedButtonText() {
        System.out.println("getSelectedButtonText");
        ButtonGroup buttonGroup = null;
        String expResult = "";
        String result = Misc.getSelectedButtonText(buttonGroup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectButtonWithText method, of class Misc.
     */
    @Test
    public void testSelectButtonWithText() {
        System.out.println("selectButtonWithText");
        ButtonGroup buttonGroup = null;
        String text = "";
        Misc.selectButtonWithText(buttonGroup, text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScreenShot method, of class Misc.
     */
    @Test
    public void testGetScreenShot() {
        System.out.println("getScreenShot");
        JPanel panel = null;
        BufferedImage expResult = null;
        BufferedImage result = Misc.getScreenShot(panel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DoubleListToArray method, of class Misc.
     */
    @Test
    public void testDoubleListToArray() {
        System.out.println("DoubleListToArray");
        List<Double> list = null;
        double[] expResult = null;
        double[] result = Misc.DoubleListToArray(list);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BooleanListToIntArray method, of class Misc.
     */
    @Test
    public void testBooleanListToIntArray() {
        System.out.println("BooleanListToIntArray");
        List<Boolean> list = null;
        int[] expResult = null;
        int[] result = Misc.BooleanListToIntArray(list);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IntegerListToArray method, of class Misc.
     */
    @Test
    public void testIntegerListToArray() {
        System.out.println("IntegerListToArray");
        List<Integer> list = null;
        int[] expResult = null;
        int[] result = Misc.IntegerListToArray(list);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of survdiff2 method, of class Misc.
     */
    @Test
    public void testSurvdiff2() {
        System.out.println("survdiff2");
        int nn = 0;
        int nngroup = 0;
        int nstrat = 0;
        double rho = 0.0;
        double[] time = null;
        int[] status = null;
        int[] group = null;
        int[] strata = null;
        double[] obs = null;
        double[] exp = null;
        double[] var = null;
        double[] risk = null;
        double[] kaplan = null;
        Misc.survdiff2(nn, nngroup, nstrat, rho, time, status, group, strata, obs, exp, var, risk, kaplan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getROICentroid method, of class Misc.
     */
    @Test
    public void testGetROICentroid() {
        System.out.println("getROICentroid");
        double[] container = null;
        Roi roi = null;
        Misc.getROICentroid(container, roi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadImageFast method, of class Misc.
     */
    @Test
    public void testLoadImageFast() {
        System.out.println("loadImageFast");
        String file = "";
        BufferedImage expResult = null;
        BufferedImage result = Misc.loadImageFast(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadImage method, of class Misc.
     * @throws java.lang.Exception
     */
    @Test
    public void testLoadImage() throws Exception {
        System.out.println("loadImage");
        byte[] data = null;
        BufferedImage expResult = null;
        BufferedImage result = Misc.loadImage(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SamePolygons method, of class Misc.
     */
    @Test
    public void testSamePolygons() {
        System.out.println("SamePolygons");
        Polygon p1 = null;
        Polygon p2 = null;
        boolean expResult = false;
        boolean result = Misc.SamePolygons(p1, p2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScaledImageWithMaxSize method, of class Misc.
     */
    @Test
    public void testGetScaledImageWithMaxSize() {
        System.out.println("getScaledImageWithMaxSize");
        BufferedImage I = null;
        int maxX = 0;
        int maxY = 0;
        double[] factor = null;
        Image expResult = null;
        Image result = Misc.getScaledImageWithMaxSize(I, maxX, maxY, factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min_arg method, of class Misc.
     */
    @Test
    public void testMin_arg() {
        System.out.println("min_arg");
        double[] ds = null;
        int expResult = 0;
        int result = Misc.min_arg(ds);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of image2histogram method, of class Misc.
     */
    @Test
    public void testImage2histogram() {
        System.out.println("image2histogram");
        BufferedImage bi = null;
        ROI roi = null;
        int numBins = 0;
        double[] expResult = null;
        double[] result = Misc.image2histogram(bi, roi, numBins);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of normalize method, of class Misc.
     */
    @Test
    public void testNormalize() {
        System.out.println("normalize");
        double[] fv = null;
        Misc.normalize(fv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Color2HTML method, of class Misc.
     */
    @Test
    public void testColor2HTML_intArr() {
        System.out.println("Color2HTML");
        int[] rgb = null;
        String expResult = "";
        String result = Misc.Color2HTML(rgb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Color2HTML method, of class Misc.
     */
    @Test
    public void testColor2HTML_Color() {
        System.out.println("Color2HTML");
        Color color = null;
        String expResult = "";
        String result = Misc.Color2HTML(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContrast50 method, of class Misc.
     */
    @Test
    public void testGetContrast50() {
        System.out.println("getContrast50");
        Color c = null;
        boolean expResult = false;
        boolean result = Misc.getContrast50(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
