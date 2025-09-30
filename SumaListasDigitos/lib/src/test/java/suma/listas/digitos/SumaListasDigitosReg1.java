package suma.listas.digitos;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SumaListasDigitosReg1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test501");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        charArrayList57.trimToSize();
        int int73 = charArrayList57.indexOf((java.lang.Object) 1.0d);
        boolean[] booleanArray78 = new boolean[] { false, false, true, true };
        boolean[] booleanArray81 = new boolean[] { true, false };
        int int82 = java.util.Arrays.mismatch(booleanArray78, booleanArray81);
        boolean boolean83 = charArrayList57.equals((java.lang.Object) booleanArray81);
        java.util.ArrayList<char[]> charArrayList84 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList85 = charArrayList84.reversed();
        charArrayList84.clear();
        java.lang.Object[] objArray87 = charArrayList84.toArray();
        boolean boolean89 = charArrayList84.equals((java.lang.Object) false);
        char[] charArray91 = new char[] { ' ' };
        charArrayList84.addLast(charArray91);
        charArrayList57.addLast(charArray91);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray96 = java.util.Arrays.copyOfRange(charArray91, 45, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 45 > 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(booleanArray78);
        assertBooleanArrayEquals(booleanArray78, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray81);
        assertBooleanArrayEquals(booleanArray81, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(charArrayList85);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertArrayEquals(objArray87, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertArrayEquals(charArray91, new char[] { ' ' });
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test502");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        short[] shortArray11 = new short[] { (byte) 100 };
        int int12 = java.util.Arrays.compare(shortArray9, shortArray11);
        short[] shortArray19 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray22 = java.util.Arrays.copyOfRange(shortArray19, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray22);
        java.util.Arrays.fill(shortArray22, (short) 0);
        java.util.Arrays.fill(shortArray22, (short) 1);
        int int28 = java.util.Arrays.compare(shortArray9, shortArray22);
        short[] shortArray34 = new short[] { (byte) 0, (short) 0, (byte) 1 };
        short[] shortArray37 = java.util.Arrays.copyOfRange(shortArray34, (int) (byte) 1, 5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = java.util.Arrays.equals(shortArray9, (-1), (-90), shortArray37, (-90), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(-1) > toIndex(-90)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-90) + "'", int12 == (-90));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 0, (short) 0, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] { (short) 0, (short) 1, (short) 0, (short) 0 });
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test503");
        boolean[] booleanArray6 = new boolean[] { true, true, true, true, false, true };
        boolean[] booleanArray11 = new boolean[] { false, false, true, true };
        boolean[] booleanArray14 = new boolean[] { true, false };
        int int15 = java.util.Arrays.mismatch(booleanArray11, booleanArray14);
        boolean[] booleanArray20 = new boolean[] { false, false, true, true };
        boolean[] booleanArray23 = new boolean[] { true, false };
        int int24 = java.util.Arrays.mismatch(booleanArray20, booleanArray23);
        int int25 = java.util.Arrays.mismatch(booleanArray14, booleanArray23);
        int int26 = java.util.Arrays.compare(booleanArray6, booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] { true, true, true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray11);
        assertBooleanArrayEquals(booleanArray11, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray14);
        assertBooleanArrayEquals(booleanArray14, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test504");
        int[] intArray5 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray5);
        int[] intArray12 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray12);
        java.util.Arrays.sort(intArray12);
        int int15 = java.util.Arrays.compareUnsigned(intArray5, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort(intArray5, (int) (byte) 1, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-90)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test505");
        int[] intArray5 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray5);
        java.util.Arrays.sort(intArray5);
        java.util.Arrays.sort(intArray5);
        java.util.function.IntBinaryOperator intBinaryOperator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(intArray5, 3, (int) (short) -1, intBinaryOperator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test506");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList1 = charArrayList0.reversed();
        boolean boolean2 = charArrayList1.isEmpty();
        java.util.ArrayList<char[]> charArrayList3 = new java.util.ArrayList<char[]>();
        boolean boolean4 = charArrayList3.isEmpty();
        java.lang.Object obj5 = null;
        boolean boolean6 = charArrayList3.equals(obj5);
        java.util.random.RandomGenerator randomGenerator7 = null;
        java.util.Collections.shuffle((java.util.List<char[]>) charArrayList3, randomGenerator7);
        boolean boolean9 = java.util.Objects.equals((java.lang.Object) boolean2, (java.lang.Object) charArrayList3);
        org.junit.Assert.assertNotNull(charArrayList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test507");
        double[] doubleArray1 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray1, (double) 6);
        double[] doubleArray5 = java.util.Arrays.copyOf(doubleArray1, 100);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray1, doubleBinaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test508");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        java.lang.Object[] objArray71 = charArrayList57.toArray();
        java.lang.Object obj72 = charArrayList57.clone();
        java.lang.Object[] objArray73 = charArrayList57.toArray();
        int int74 = charArrayList57.size();
        java.util.Spliterator<char[]> charArraySpliterator75 = charArrayList57.spliterator();
        char[] charArray80 = new char[] { ' ', '#', 'a' };
        char[] charArray86 = new char[] { ' ', '#', '4', '#', 'a' };
        int int87 = java.util.Arrays.compare(charArray80, charArray86);
        // The following exception was thrown during execution in test generation
        try {
            charArrayList57.add((int) (short) -1, charArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[[ , #, 4, #, a], [ , #, a]]");
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[[ , #, 4, #, a], [ , #, a]]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertNotNull(charArraySpliterator75);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertArrayEquals(charArray86, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 45 + "'", int87 == 45);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test509");
        double[] doubleArray1 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray1, (double) 6);
        java.util.Arrays.sort(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 6.0d }, 1.0E-15);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test510");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList1 = charArrayList0.reversed();
        charArrayList0.clear();
        java.lang.Object[] objArray3 = charArrayList0.toArray();
        boolean boolean5 = charArrayList0.equals((java.lang.Object) false);
        char[] charArray7 = new char[] { ' ' };
        charArrayList0.addLast(charArray7);
        char[] charArray9 = charArrayList0.removeLast();
        char[] charArray13 = new char[] { ' ', '#', 'a' };
        char[] charArray19 = new char[] { ' ', '#', '4', '#', 'a' };
        int int20 = java.util.Arrays.compare(charArray13, charArray19);
        char[] charArray24 = new char[] { ' ', '#', 'a' };
        char[] charArray30 = new char[] { ' ', '#', '4', '#', 'a' };
        int int31 = java.util.Arrays.compare(charArray24, charArray30);
        char[] charArray35 = new char[] { ' ', '#', 'a' };
        char[] charArray41 = new char[] { ' ', '#', '4', '#', 'a' };
        int int42 = java.util.Arrays.compare(charArray35, charArray41);
        char[] charArray46 = new char[] { ' ', '#', 'a' };
        char[] charArray52 = new char[] { ' ', '#', '4', '#', 'a' };
        int int53 = java.util.Arrays.compare(charArray46, charArray52);
        java.util.List<char[]> charArrayList54 = java.util.List.of(charArray19, charArray24, charArray35, charArray52);
        int int56 = java.util.Arrays.binarySearch(charArray35, 'a');
        boolean boolean57 = charArrayList0.add(charArray35);
        charArrayList0.clear();
        org.junit.Assert.assertNotNull(charArrayList1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 45 + "'", int20 == 45);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 45 + "'", int31 == 45);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 45 + "'", int42 == 45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 45 + "'", int53 == 45);
        org.junit.Assert.assertNotNull(charArrayList54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test511");
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration0 = java.util.Collections.emptyEnumeration();
        java.util.function.Supplier<java.lang.String> strSupplier1 = null;
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration2 = java.util.Objects.requireNonNull(byteArraySetEnumeration0, strSupplier1);
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration3 = java.util.Collections.emptyEnumeration();
        java.util.function.Supplier<java.lang.String> strSupplier4 = null;
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration5 = java.util.Objects.requireNonNull(byteArraySetEnumeration3, strSupplier4);
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration6 = java.util.Objects.requireNonNullElse(byteArraySetEnumeration0, byteArraySetEnumeration5);
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration7 = java.util.Collections.emptyEnumeration();
        java.util.function.Supplier<java.lang.String> strSupplier8 = null;
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration9 = java.util.Objects.requireNonNull(byteArraySetEnumeration7, strSupplier8);
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration10 = java.util.Collections.emptyEnumeration();
        java.util.function.Supplier<java.lang.String> strSupplier11 = null;
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration12 = java.util.Objects.requireNonNull(byteArraySetEnumeration10, strSupplier11);
        java.util.Enumeration<java.util.SortedSet<byte[]>> byteArraySetEnumeration13 = java.util.Objects.requireNonNullElse(byteArraySetEnumeration7, byteArraySetEnumeration12);
        java.util.Enumeration[] enumerationArray15 = new java.util.Enumeration[2];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.util.SortedSet<byte[]>>[] byteArraySetEnumerationArray16 = (java.util.Enumeration<java.util.SortedSet<byte[]>>[]) enumerationArray15;
        byteArraySetEnumerationArray16[0] = byteArraySetEnumeration0;
        byteArraySetEnumerationArray16[1] = byteArraySetEnumeration12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator<java.util.Enumeration<java.util.SortedSet<byte[]>>> byteArraySetEnumerationSpliterator23 = java.util.Arrays.spliterator(byteArraySetEnumerationArray16, 4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: origin(4) > fence(1)");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArraySetEnumeration0);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration2);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration3);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration5);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration6);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration7);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration9);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration10);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration12);
        org.junit.Assert.assertNotNull(byteArraySetEnumeration13);
        org.junit.Assert.assertNotNull(enumerationArray15);
        org.junit.Assert.assertNotNull(byteArraySetEnumerationArray16);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test512");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        boolean boolean1 = charArrayList0.isEmpty();
        java.util.function.UnaryOperator<char[]> charArrayUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            charArrayList0.replaceAll(charArrayUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test513");
        java.util.NavigableSet<byte[]> byteArraySet0 = java.util.Collections.emptyNavigableSet();
        java.util.NavigableSet<byte[]> byteArraySet1 = java.util.Collections.unmodifiableNavigableSet(byteArraySet0);
        java.util.NavigableSet<byte[]> byteArraySet2 = java.util.Collections.synchronizedNavigableSet(byteArraySet0);
        java.lang.Class<byte[]> byteArrayClass3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<byte[]> byteArraySet4 = java.util.Collections.checkedSortedSet((java.util.SortedSet<byte[]>) byteArraySet0, byteArrayClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArraySet0);
        org.junit.Assert.assertNotNull(byteArraySet1);
        org.junit.Assert.assertNotNull(byteArraySet2);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test514");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = java.util.Objects.checkIndex((long) 10, (long) (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length -90");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test515");
        float[] floatArray6 = new float[] { 'a', (-1.0f), 0.0f, (short) 1, 0, 1L };
        int int8 = java.util.Arrays.binarySearch(floatArray6, (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = java.util.Arrays.binarySearch(floatArray6, 5, 9, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 97.0f, (-1.0f), 0.0f, 1.0f, 0.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test516");
        long[] longArray0 = new long[] {};
        java.util.Arrays.sort(longArray0, 0, (int) (short) 0);
        long[] longArray4 = new long[] {};
        java.util.Arrays.sort(longArray4, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray4);
        int int9 = java.util.Arrays.compare(longArray0, longArray4);
        long[] longArray10 = new long[] {};
        java.util.Arrays.sort(longArray10, 0, (int) (short) 0);
        long[] longArray14 = new long[] {};
        java.util.Arrays.sort(longArray14, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray14);
        int int19 = java.util.Arrays.compare(longArray10, longArray14);
        int int20 = java.util.Arrays.compare(longArray0, longArray10);
        java.util.function.Supplier<java.lang.String> strSupplier21 = null;
        long[] longArray22 = java.util.Objects.requireNonNull(longArray10, strSupplier21);
        int int24 = java.util.Arrays.binarySearch(longArray22, (long) (-2060931702));
        long[] longArray26 = java.util.Arrays.copyOf(longArray22, 1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 0L });
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test517");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList1 = charArrayList0.reversed();
        charArrayList0.clear();
        java.lang.Object[] objArray3 = charArrayList0.toArray();
        boolean boolean5 = charArrayList0.equals((java.lang.Object) false);
        java.lang.Object[] objArray6 = charArrayList0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = charArrayList0.getFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArrayList1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test518");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray9);
        java.util.Arrays.fill(shortArray9, (short) 0);
        java.util.Arrays.fill(shortArray9, (short) -1);
        int int16 = java.util.Arrays.binarySearch(shortArray9, (short) 10);
        java.lang.String str17 = java.util.Arrays.toString(shortArray9);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-33) + "'", int16 == (-33));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]" + "'", str17, "[-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test519");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = java.util.Arrays.copyOf(typeArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.sort((java.lang.Object[]) typeArray0, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[] {});
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test520");
        boolean[] booleanArray4 = new boolean[] { false, false, true, true };
        boolean[] booleanArray7 = new boolean[] { true, false };
        int int8 = java.util.Arrays.mismatch(booleanArray4, booleanArray7);
        boolean[] booleanArray15 = new boolean[] { true, false, true, true, false, true };
        boolean[] booleanArray21 = new boolean[] { false, false, false, false, true };
        boolean[] booleanArray24 = new boolean[] { false, true };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true };
        boolean[] booleanArray32 = new boolean[] { true, false };
        int int33 = java.util.Arrays.mismatch(booleanArray29, booleanArray32);
        boolean[] booleanArray38 = new boolean[] { false, false, true, true };
        boolean[] booleanArray41 = new boolean[] { true, false };
        int int42 = java.util.Arrays.mismatch(booleanArray38, booleanArray41);
        boolean[] booleanArray47 = new boolean[] { false, false, true, true };
        boolean[] booleanArray50 = new boolean[] { true, false };
        int int51 = java.util.Arrays.mismatch(booleanArray47, booleanArray50);
        boolean[] booleanArray56 = new boolean[] { false, false, true, true };
        boolean[] booleanArray59 = new boolean[] { true, false };
        int int60 = java.util.Arrays.mismatch(booleanArray56, booleanArray59);
        java.util.List<boolean[]> booleanArrayList61 = java.util.List.of(booleanArray4, booleanArray15, booleanArray21, booleanArray24, booleanArray29, booleanArray38, booleanArray47, booleanArray56);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray64 = java.util.Arrays.copyOfRange(booleanArray47, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 > -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false, true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { false, true });
        org.junit.Assert.assertNotNull(booleanArray29);
        assertBooleanArrayEquals(booleanArray29, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray41);
        assertBooleanArrayEquals(booleanArray41, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(booleanArray47);
        assertBooleanArrayEquals(booleanArray47, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray50);
        assertBooleanArrayEquals(booleanArray50, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(booleanArrayList61);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test521");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        byte[] byteArray7 = new byte[] {};
        int int8 = java.util.Arrays.compareUnsigned(byteArray6, byteArray7);
        java.util.Arrays.parallelSort(byteArray6);
        byte[] byteArray11 = java.util.Arrays.copyOf(byteArray6, 7);
        int int13 = java.util.Arrays.binarySearch(byteArray6, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test522");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = java.util.Objects.checkFromIndexSize((int) '#', 31, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [35, 35 + 31) out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test523");
        double[] doubleArray4 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray11 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int12 = java.util.Arrays.compare(doubleArray4, doubleArray11);
        java.util.stream.DoubleStream doubleStream13 = java.util.Arrays.stream(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble14 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Arrays.sort(doubleArray4);
        java.util.function.DoubleBinaryOperator doubleBinaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelPrefix(doubleArray4, (int) (short) 100, (int) (byte) 0, doubleBinaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(ofDouble14);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test524");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray9);
        java.util.Arrays.fill(shortArray9, (short) 0);
        java.util.Arrays.fill(shortArray9, (short) -1);
        int int16 = java.util.Arrays.binarySearch(shortArray9, (short) 10);
        short[] shortArray25 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray28 = java.util.Arrays.copyOfRange(shortArray25, 0, (int) ' ');
        short[] shortArray30 = new short[] { (byte) 100 };
        int int31 = java.util.Arrays.compare(shortArray28, shortArray30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = java.util.Arrays.equals(shortArray9, 4, (-2), shortArray30, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(4) > toIndex(-2)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-33) + "'", int16 == (-33));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) 100 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-90) + "'", int31 == (-90));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test525");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        java.util.Set<short[]> shortArraySet10 = java.util.Collections.singleton(shortArray6);
        java.util.Arrays.parallelSort(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) -1, (short) 1, (short) 10, (short) 10, (short) 100, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArraySet10);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test526");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        int int71 = charArrayList57.size();
        java.util.ArrayList<char[]> charArrayList72 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList73 = charArrayList72.reversed();
        charArrayList72.clear();
        java.lang.Object[] objArray75 = charArrayList72.toArray();
        int int76 = java.util.Collections.indexOfSubList((java.util.List<char[]>) charArrayList57, (java.util.List<char[]>) charArrayList72);
        char[] charArray78 = charArrayList57.get((int) (byte) 0);
        java.util.Arrays.parallelSort(charArray78);
        java.util.Arrays.fill(charArray78, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.parallelSort(charArray78, (-50), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(charArrayList73);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertArrayEquals(objArray75, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { '4', '4', '4', '4', '4' });
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test527");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = java.util.Arrays.copyOfRange(doubleArray1, (int) (short) 0, (int) 'a');
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray1, (int) (byte) 0, 7);
        java.lang.String str8 = java.util.Arrays.toString(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[-1.0]" + "'", str8, "[-1.0]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test528");
        long[] longArray0 = new long[] {};
        java.util.Arrays.sort(longArray0, 0, (int) (short) 0);
        long[] longArray4 = new long[] {};
        java.util.Arrays.sort(longArray4, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray4);
        int int9 = java.util.Arrays.compare(longArray0, longArray4);
        long[] longArray10 = new long[] {};
        java.util.Arrays.sort(longArray10, 0, (int) (short) 0);
        long[] longArray14 = new long[] {};
        java.util.Arrays.sort(longArray14, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray14);
        int int19 = java.util.Arrays.compare(longArray10, longArray14);
        int int20 = java.util.Arrays.compare(longArray0, longArray10);
        long[] longArray25 = new long[] { 100L, 1L };
        java.util.Arrays.sort(longArray25);
        long[] longArray28 = new long[] { 3 };
        int int29 = java.util.Arrays.mismatch(longArray25, longArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = java.util.Arrays.mismatch(longArray0, 45, 0, longArray28, (-1), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(45) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 1L, 100L });
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 3L });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test529");
        java.util.List list0 = java.util.Collections.EMPTY_LIST;
        java.util.List list1 = java.util.Collections.EMPTY_LIST;
        java.util.List[] listArray3 = new java.util.List[2];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Integer>[] intListArray4 = (java.util.List<java.lang.Integer>[]) listArray3;
        intListArray4[0] = list0;
        intListArray4[1] = list1;
        java.util.List<java.lang.Integer> intList9 = suma.listas.digitos.SumaListasDigitos.sumaVariasListasDeDigitos(intListArray4);
        java.lang.constant.ConstantDesc constantDesc10 = null;
        java.util.List<java.lang.constant.ConstantDesc> constantDescList11 = java.util.Collections.singletonList(constantDesc10);
        java.util.Arrays.fill((java.lang.Object[]) intListArray4, (java.lang.Object) constantDesc10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList13 = suma.listas.digitos.SumaListasDigitos.sumaVariasListasDeDigitos(intListArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: La lista en la posicio?n 0 es nula");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(listArray3);
        org.junit.Assert.assertArrayEquals(listArray3, new java.util.List[] { null, null });
        org.junit.Assert.assertNotNull(intListArray4);
        org.junit.Assert.assertArrayEquals(intListArray4, new java.util.List[] { null, null });
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(constantDescList11);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test530");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray9);
        short[] shortArray17 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray20 = java.util.Arrays.copyOfRange(shortArray17, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray20);
        java.util.Arrays.fill(shortArray20, (short) 0);
        java.util.Arrays.fill(shortArray20, (short) -1);
        int int26 = java.util.Arrays.mismatch(shortArray9, shortArray20);
        short[] shortArray35 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray38 = java.util.Arrays.copyOfRange(shortArray35, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray38);
        java.util.Arrays.fill(shortArray38, (short) 0);
        java.util.Arrays.fill(shortArray38, (short) -1);
        int int45 = java.util.Arrays.binarySearch(shortArray38, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = java.util.Arrays.mismatch(shortArray9, (int) (short) 1, (int) ' ', shortArray38, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-33) + "'", int45 == (-33));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test531");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = java.util.Objects.toIdentityString(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test532");
        boolean[] booleanArray4 = new boolean[] { false, false, true, true };
        boolean[] booleanArray7 = new boolean[] { true, false };
        int int8 = java.util.Arrays.mismatch(booleanArray4, booleanArray7);
        boolean[] booleanArray13 = new boolean[] { false, false, true, true };
        boolean[] booleanArray16 = new boolean[] { true, false };
        int int17 = java.util.Arrays.mismatch(booleanArray13, booleanArray16);
        int int18 = java.util.Arrays.mismatch(booleanArray7, booleanArray16);
        boolean[] booleanArray23 = new boolean[] { false, false, true, true };
        boolean[] booleanArray26 = new boolean[] { true, false };
        int int27 = java.util.Arrays.mismatch(booleanArray23, booleanArray26);
        boolean[] booleanArray34 = new boolean[] { true, false, true, true, false, true };
        boolean[] booleanArray40 = new boolean[] { false, false, false, false, true };
        boolean[] booleanArray43 = new boolean[] { false, true };
        boolean[] booleanArray48 = new boolean[] { false, false, true, true };
        boolean[] booleanArray51 = new boolean[] { true, false };
        int int52 = java.util.Arrays.mismatch(booleanArray48, booleanArray51);
        boolean[] booleanArray57 = new boolean[] { false, false, true, true };
        boolean[] booleanArray60 = new boolean[] { true, false };
        int int61 = java.util.Arrays.mismatch(booleanArray57, booleanArray60);
        boolean[] booleanArray66 = new boolean[] { false, false, true, true };
        boolean[] booleanArray69 = new boolean[] { true, false };
        int int70 = java.util.Arrays.mismatch(booleanArray66, booleanArray69);
        boolean[] booleanArray75 = new boolean[] { false, false, true, true };
        boolean[] booleanArray78 = new boolean[] { true, false };
        int int79 = java.util.Arrays.mismatch(booleanArray75, booleanArray78);
        java.util.List<boolean[]> booleanArrayList80 = java.util.List.of(booleanArray23, booleanArray34, booleanArray40, booleanArray43, booleanArray48, booleanArray57, booleanArray66, booleanArray75);
        int int81 = java.util.Arrays.mismatch(booleanArray7, booleanArray40);
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(booleanArray23);
        assertBooleanArrayEquals(booleanArray23, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray26);
        assertBooleanArrayEquals(booleanArray26, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(booleanArray34);
        assertBooleanArrayEquals(booleanArray34, new boolean[] { true, false, true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray40);
        assertBooleanArrayEquals(booleanArray40, new boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray43);
        assertBooleanArrayEquals(booleanArray43, new boolean[] { false, true });
        org.junit.Assert.assertNotNull(booleanArray48);
        assertBooleanArrayEquals(booleanArray48, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray51);
        assertBooleanArrayEquals(booleanArray51, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(booleanArray57);
        assertBooleanArrayEquals(booleanArray57, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray60);
        assertBooleanArrayEquals(booleanArray60, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(booleanArray66);
        assertBooleanArrayEquals(booleanArray66, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray69);
        assertBooleanArrayEquals(booleanArray69, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(booleanArray75);
        assertBooleanArrayEquals(booleanArray75, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray78);
        assertBooleanArrayEquals(booleanArray78, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(booleanArrayList80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test533");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList1 = charArrayList0.reversed();
        int int2 = charArrayList0.size();
        java.lang.Object[] objArray3 = charArrayList0.toArray();
        org.junit.Assert.assertNotNull(charArrayList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test534");
        short[] shortArray3 = new short[] { (short) 100, (short) 0, (byte) 1 };
        short[] shortArray12 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray15 = java.util.Arrays.copyOfRange(shortArray12, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray15);
        short[] shortArray20 = new short[] { (byte) 1, (byte) 1, (short) 0 };
        int int21 = java.util.Arrays.compare(shortArray15, shortArray20);
        short[] shortArray28 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray31 = java.util.Arrays.copyOfRange(shortArray28, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray31);
        java.util.Arrays.fill(shortArray31, (short) 0);
        java.util.Arrays.fill(shortArray31, (short) -1);
        int int38 = java.util.Arrays.binarySearch(shortArray31, (short) 10);
        int int39 = java.util.Arrays.mismatch(shortArray15, shortArray31);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = java.util.Arrays.compareUnsigned(shortArray3, (int) (byte) 10, 7, shortArray15, 31, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(7)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) 100, (short) 0, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 1, (short) 1, (short) 0 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-33) + "'", int38 == (-33));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test535");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        charArrayList57.trimToSize();
        charArrayList57.clear();
        java.lang.Object[] objArray73 = charArrayList57.toArray();
        java.lang.Object[] objArray74 = charArrayList57.toArray();
        java.util.Iterator<char[]> charArrayItor75 = charArrayList57.iterator();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertArrayEquals(objArray73, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(charArrayItor75);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test536");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        charArrayList57.trimToSize();
        int int73 = charArrayList57.indexOf((java.lang.Object) 1.0d);
        char[] charArray78 = new char[] { ' ', '#', 'a' };
        char[] charArray84 = new char[] { ' ', '#', '4', '#', 'a' };
        int int85 = java.util.Arrays.compare(charArray78, charArray84);
        char[] charArray86 = charArrayList57.set(0, charArray84);
        java.util.Arrays.fill(charArray84, '4');
        int int90 = java.util.Arrays.binarySearch(charArray84, ' ');
        java.util.Arrays.sort(charArray84);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { '4', '4', '4', '4', '4' });
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 45 + "'", int85 == 45);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertArrayEquals(charArray86, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test537");
        java.util.Map<java.util.stream.BaseStream<java.lang.Long, java.util.stream.LongStream>, java.lang.reflect.AnnotatedElement> longBaseStreamMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(longBaseStreamMap0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test538");
        java.util.AbstractList<char[]> charArrayList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractList<char[]> charArrayList2 = java.util.Objects.requireNonNull(charArrayList0, "[0, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: [0, 0]");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test539");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 'a', ' ', 0, 5 };
        java.util.Arrays.sort(intArray6);
        int int9 = java.util.Arrays.binarySearch(intArray6, (-2));
        java.util.Spliterator.OfInt ofInt10 = java.util.Arrays.spliterator(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 5, 10, 32, 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(ofInt10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test540");
        boolean[] booleanArray4 = new boolean[] { false, false, true, true };
        boolean[] booleanArray7 = new boolean[] { true, false };
        int int8 = java.util.Arrays.mismatch(booleanArray4, booleanArray7);
        boolean[] booleanArray15 = new boolean[] { true, false, true, true, false, true };
        boolean[] booleanArray21 = new boolean[] { false, false, false, false, true };
        boolean[] booleanArray24 = new boolean[] { false, true };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true };
        boolean[] booleanArray32 = new boolean[] { true, false };
        int int33 = java.util.Arrays.mismatch(booleanArray29, booleanArray32);
        boolean[] booleanArray38 = new boolean[] { false, false, true, true };
        boolean[] booleanArray41 = new boolean[] { true, false };
        int int42 = java.util.Arrays.mismatch(booleanArray38, booleanArray41);
        boolean[] booleanArray47 = new boolean[] { false, false, true, true };
        boolean[] booleanArray50 = new boolean[] { true, false };
        int int51 = java.util.Arrays.mismatch(booleanArray47, booleanArray50);
        boolean[] booleanArray56 = new boolean[] { false, false, true, true };
        boolean[] booleanArray59 = new boolean[] { true, false };
        int int60 = java.util.Arrays.mismatch(booleanArray56, booleanArray59);
        java.util.List<boolean[]> booleanArrayList61 = java.util.List.of(booleanArray4, booleanArray15, booleanArray21, booleanArray24, booleanArray29, booleanArray38, booleanArray47, booleanArray56);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(booleanArray38, (int) (short) 1, 65535, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 65535");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false, true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { false, true });
        org.junit.Assert.assertNotNull(booleanArray29);
        assertBooleanArrayEquals(booleanArray29, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray41);
        assertBooleanArrayEquals(booleanArray41, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(booleanArray47);
        assertBooleanArrayEquals(booleanArray47, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray50);
        assertBooleanArrayEquals(booleanArray50, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(booleanArrayList61);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test541");
        java.util.SortedSet<byte[]>[] byteArraySetArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<byte[]>[] byteArraySetArray2 = java.util.Arrays.copyOf(byteArraySetArray0, (-2060931702));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"original\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test542");
        float[] floatArray6 = new float[] { 'a', (-1.0f), 0.0f, (short) 1, 0, 1L };
        int int8 = java.util.Arrays.binarySearch(floatArray6, (float) (short) 1);
        java.util.Arrays.sort(floatArray6);
        int int13 = java.util.Arrays.binarySearch(floatArray6, 1, 4, (float) ' ');
        java.lang.String str14 = java.util.Arrays.toString(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { (-1.0f), 0.0f, 0.0f, 1.0f, 1.0f, 97.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-5) + "'", int13 == (-5));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[-1.0, 0.0, 0.0, 1.0, 1.0, 97.0]" + "'", str14, "[-1.0, 0.0, 0.0, 1.0, 1.0, 97.0]");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test543");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        int int72 = charArrayList57.indexOf((java.lang.Object) "[false, true, true, true, false]");
        java.util.ListIterator<char[]> charArrayItor73 = charArrayList57.listIterator();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(charArrayItor73);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test544");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        charArrayList57.trimToSize();
        charArrayList57.clear();
        java.util.Iterator<char[]> charArrayItor73 = charArrayList57.iterator();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(charArrayItor73);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test545");
        boolean[] booleanArray4 = new boolean[] { false, false, true, true };
        boolean[] booleanArray7 = new boolean[] { true, false };
        int int8 = java.util.Arrays.mismatch(booleanArray4, booleanArray7);
        boolean[] booleanArray13 = new boolean[] { false, false, true, true };
        boolean[] booleanArray16 = new boolean[] { true, false };
        int int17 = java.util.Arrays.mismatch(booleanArray13, booleanArray16);
        boolean[] booleanArray24 = new boolean[] { true, false, true, true, false, true };
        boolean[] booleanArray30 = new boolean[] { false, false, false, false, true };
        boolean[] booleanArray33 = new boolean[] { false, true };
        boolean[] booleanArray38 = new boolean[] { false, false, true, true };
        boolean[] booleanArray41 = new boolean[] { true, false };
        int int42 = java.util.Arrays.mismatch(booleanArray38, booleanArray41);
        boolean[] booleanArray47 = new boolean[] { false, false, true, true };
        boolean[] booleanArray50 = new boolean[] { true, false };
        int int51 = java.util.Arrays.mismatch(booleanArray47, booleanArray50);
        boolean[] booleanArray56 = new boolean[] { false, false, true, true };
        boolean[] booleanArray59 = new boolean[] { true, false };
        int int60 = java.util.Arrays.mismatch(booleanArray56, booleanArray59);
        boolean[] booleanArray65 = new boolean[] { false, false, true, true };
        boolean[] booleanArray68 = new boolean[] { true, false };
        int int69 = java.util.Arrays.mismatch(booleanArray65, booleanArray68);
        java.util.List<boolean[]> booleanArrayList70 = java.util.List.of(booleanArray13, booleanArray24, booleanArray30, booleanArray33, booleanArray38, booleanArray47, booleanArray56, booleanArray65);
        int int71 = java.util.Arrays.mismatch(booleanArray7, booleanArray47);
        boolean[] booleanArray78 = new boolean[] { false, false, true, true };
        boolean[] booleanArray81 = new boolean[] { true, false };
        int int82 = java.util.Arrays.mismatch(booleanArray78, booleanArray81);
        boolean[] booleanArray87 = new boolean[] { false, false, true, true };
        boolean[] booleanArray90 = new boolean[] { true, false };
        int int91 = java.util.Arrays.mismatch(booleanArray87, booleanArray90);
        int int92 = java.util.Arrays.mismatch(booleanArray81, booleanArray90);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = java.util.Arrays.mismatch(booleanArray7, 0, 0, booleanArray81, (-50), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(booleanArray13);
        assertBooleanArrayEquals(booleanArray13, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray16);
        assertBooleanArrayEquals(booleanArray16, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { true, false, true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { false, true });
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray41);
        assertBooleanArrayEquals(booleanArray41, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(booleanArray47);
        assertBooleanArrayEquals(booleanArray47, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray50);
        assertBooleanArrayEquals(booleanArray50, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(booleanArray65);
        assertBooleanArrayEquals(booleanArray65, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray68);
        assertBooleanArrayEquals(booleanArray68, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(booleanArrayList70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(booleanArray78);
        assertBooleanArrayEquals(booleanArray78, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray81);
        assertBooleanArrayEquals(booleanArray81, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(booleanArray87);
        assertBooleanArrayEquals(booleanArray87, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray90);
        assertBooleanArrayEquals(booleanArray90, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test546");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList1 = charArrayList0.reversed();
        java.lang.Object obj2 = charArrayList0.clone();
        short[] shortArray9 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray12 = java.util.Arrays.copyOfRange(shortArray9, 0, (int) ' ');
        short[] shortArray16 = new short[] { (byte) 0, (short) 0, (byte) 1 };
        short[] shortArray19 = java.util.Arrays.copyOfRange(shortArray16, (int) (byte) 1, 5);
        int int20 = java.util.Arrays.compareUnsigned(shortArray9, shortArray16);
        int int21 = charArrayList0.indexOf((java.lang.Object) shortArray16);
        org.junit.Assert.assertNotNull(charArrayList1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 0, (short) 0, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 0, (short) 1, (short) 0, (short) 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test547");
        int[] intArray5 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray5);
        java.util.Arrays.sort(intArray5);
        java.util.Arrays.sort(intArray5);
        int[] intArray14 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray14);
        java.util.Arrays.sort(intArray14);
        java.util.Arrays.sort(intArray14);
        int int18 = java.util.Arrays.compareUnsigned(intArray5, intArray14);
        int[] intArray25 = new int[] { (short) 10, (byte) 1, 'a', ' ', 0, 5 };
        java.util.Arrays.sort(intArray25);
        java.util.stream.IntStream intStream27 = java.util.Arrays.stream(intArray25);
        int int28 = java.util.Arrays.mismatch(intArray14, intArray25);
        int[] intArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = java.util.Arrays.mismatch(intArray14, intArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"b\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 1, 5, 10, 32, 97 });
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test548");
        int[] intArray0 = null;
        int[] intArray8 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray8);
        int[] intArray16 = new int[] { (short) 10, (byte) 1, 'a', ' ', 0, 5 };
        java.util.Arrays.sort(intArray16);
        int int19 = java.util.Arrays.binarySearch(intArray16, (-2));
        int[] intArray22 = java.util.Arrays.copyOfRange(intArray16, 3, (int) '#');
        java.util.stream.IntStream intStream23 = java.util.Arrays.stream(intArray22);
        int int24 = java.util.Arrays.compare(intArray8, intArray22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = java.util.Arrays.equals(intArray0, (-50), 0, intArray22, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 1, 5, 10, 32, 97 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test549");
        long[] longArray0 = new long[] {};
        java.util.Arrays.sort(longArray0, 0, (int) (short) 0);
        long[] longArray4 = new long[] {};
        java.util.Arrays.sort(longArray4, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray4);
        int int9 = java.util.Arrays.compare(longArray0, longArray4);
        java.util.Arrays.parallelSort(longArray0);
        java.util.Arrays.sort(longArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(longArray0, 2, (int) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test550");
        boolean[] booleanArray4 = new boolean[] { false, false, true, true };
        boolean[] booleanArray7 = new boolean[] { true, false };
        int int8 = java.util.Arrays.mismatch(booleanArray4, booleanArray7);
        boolean[] booleanArray15 = new boolean[] { true, false, true, true, false, true };
        boolean[] booleanArray21 = new boolean[] { false, false, false, false, true };
        boolean[] booleanArray24 = new boolean[] { false, true };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true };
        boolean[] booleanArray32 = new boolean[] { true, false };
        int int33 = java.util.Arrays.mismatch(booleanArray29, booleanArray32);
        boolean[] booleanArray38 = new boolean[] { false, false, true, true };
        boolean[] booleanArray41 = new boolean[] { true, false };
        int int42 = java.util.Arrays.mismatch(booleanArray38, booleanArray41);
        boolean[] booleanArray47 = new boolean[] { false, false, true, true };
        boolean[] booleanArray50 = new boolean[] { true, false };
        int int51 = java.util.Arrays.mismatch(booleanArray47, booleanArray50);
        boolean[] booleanArray56 = new boolean[] { false, false, true, true };
        boolean[] booleanArray59 = new boolean[] { true, false };
        int int60 = java.util.Arrays.mismatch(booleanArray56, booleanArray59);
        java.util.List<boolean[]> booleanArrayList61 = java.util.List.of(booleanArray4, booleanArray15, booleanArray21, booleanArray24, booleanArray29, booleanArray38, booleanArray47, booleanArray56);
        java.lang.String str62 = java.util.Arrays.toString(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray4);
        assertBooleanArrayEquals(booleanArray4, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray7);
        assertBooleanArrayEquals(booleanArray7, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(booleanArray15);
        assertBooleanArrayEquals(booleanArray15, new boolean[] { true, false, true, true, false, true });
        org.junit.Assert.assertNotNull(booleanArray21);
        assertBooleanArrayEquals(booleanArray21, new boolean[] { false, false, false, false, true });
        org.junit.Assert.assertNotNull(booleanArray24);
        assertBooleanArrayEquals(booleanArray24, new boolean[] { false, true });
        org.junit.Assert.assertNotNull(booleanArray29);
        assertBooleanArrayEquals(booleanArray29, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray32);
        assertBooleanArrayEquals(booleanArray32, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(booleanArray38);
        assertBooleanArrayEquals(booleanArray38, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray41);
        assertBooleanArrayEquals(booleanArray41, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(booleanArray47);
        assertBooleanArrayEquals(booleanArray47, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray50);
        assertBooleanArrayEquals(booleanArray50, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(booleanArray56);
        assertBooleanArrayEquals(booleanArray56, new boolean[] { false, false, true, true });
        org.junit.Assert.assertNotNull(booleanArray59);
        assertBooleanArrayEquals(booleanArray59, new boolean[] { true, false });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(booleanArrayList61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[false, false, false, false, true]" + "'", str62, "[false, false, false, false, true]");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test551");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = java.util.Arrays.copyOfRange(doubleArray1, (int) (short) 0, (int) 'a');
        double[] doubleArray7 = java.util.Arrays.copyOfRange(doubleArray1, (int) (byte) 0, 7);
        double[] doubleArray9 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray9, (double) 6);
        double[] doubleArray13 = java.util.Arrays.copyOf(doubleArray9, 100);
        int int14 = java.util.Arrays.compare(doubleArray7, doubleArray9);
        double[] doubleArray18 = new double[] { (short) 0, 0.0d, (byte) -1 };
        java.util.stream.DoubleStream doubleStream19 = java.util.Arrays.stream(doubleArray18);
        double[] doubleArray21 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray21, (double) 6);
        double[] doubleArray25 = java.util.Arrays.copyOf(doubleArray21, 100);
        java.util.Arrays.fill(doubleArray25, (double) (short) 1);
        int int28 = java.util.Arrays.compare(doubleArray18, doubleArray25);
        double[] doubleArray32 = new double[] { 1.0d, (-6), 2 };
        int int33 = java.util.Arrays.mismatch(doubleArray25, doubleArray32);
        int int34 = java.util.Arrays.compare(doubleArray7, doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-6.0d), 2.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test552");
        float[] floatArray6 = new float[] { 'a', (-1.0f), 0.0f, (short) 1, 0, 1L };
        int int8 = java.util.Arrays.binarySearch(floatArray6, (float) (short) 1);
        java.util.Arrays.fill(floatArray6, (float) 100);
        java.util.Arrays.parallelSort(floatArray6);
        float[] floatArray18 = new float[] { 'a', (-1.0f), 0.0f, (short) 1, 0, 1L };
        int int20 = java.util.Arrays.binarySearch(floatArray18, (float) (short) 1);
        int int21 = java.util.Arrays.compare(floatArray6, floatArray18);
        float[] floatArray25 = new float[] { 10, 1L, 100 };
        float[] floatArray27 = java.util.Arrays.copyOf(floatArray25, (int) (short) 1);
        float[] floatArray34 = new float[] { 'a', (-1.0f), 0.0f, (short) 1, 0, 1L };
        int int36 = java.util.Arrays.binarySearch(floatArray34, (float) (short) 1);
        java.util.Arrays.fill(floatArray34, (float) 100);
        int int39 = java.util.Arrays.mismatch(floatArray27, floatArray34);
        int int40 = java.util.Arrays.mismatch(floatArray18, floatArray27);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertArrayEquals(floatArray6, new float[] { 100.0f, 100.0f, 100.0f, 100.0f, 100.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 97.0f, (-1.0f), 0.0f, 1.0f, 0.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 10.0f, 1.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertArrayEquals(floatArray27, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertArrayEquals(floatArray34, new float[] { 100.0f, 100.0f, 100.0f, 100.0f, 100.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test553");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        int int72 = charArrayList57.indexOf((java.lang.Object) "[false, true, true, true, false]");
        double[] doubleArray74 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray74, (double) 6);
        double[] doubleArray78 = java.util.Arrays.copyOf(doubleArray74, 100);
        double[] doubleArray80 = java.util.Arrays.copyOf(doubleArray78, 10);
        int int81 = charArrayList57.indexOf((java.lang.Object) doubleArray80);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 6.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test554");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        short[] shortArray18 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray21 = java.util.Arrays.copyOfRange(shortArray18, 0, (int) ' ');
        short[] shortArray23 = new short[] { (byte) 100 };
        int int24 = java.util.Arrays.compare(shortArray21, shortArray23);
        short[] shortArray31 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray34 = java.util.Arrays.copyOfRange(shortArray31, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray34);
        java.util.Arrays.fill(shortArray34, (short) 0);
        java.util.Arrays.fill(shortArray34, (short) 1);
        int int40 = java.util.Arrays.compare(shortArray21, shortArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = java.util.Arrays.compareUnsigned(shortArray9, (int) '4', (int) '#', shortArray34, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 100 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-90) + "'", int24 == (-90));
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test555");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        int int71 = charArrayList57.size();
        java.util.ArrayList<char[]> charArrayList72 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList73 = charArrayList72.reversed();
        charArrayList72.clear();
        java.lang.Object[] objArray75 = charArrayList72.toArray();
        int int76 = java.util.Collections.indexOfSubList((java.util.List<char[]>) charArrayList57, (java.util.List<char[]>) charArrayList72);
        int[] intArray82 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray82);
        int[] intArray90 = new int[] { (short) 10, (byte) 1, 'a', ' ', 0, 5 };
        java.util.Arrays.sort(intArray90);
        int int93 = java.util.Arrays.binarySearch(intArray90, (-2));
        int[] intArray96 = java.util.Arrays.copyOfRange(intArray90, 3, (int) '#');
        java.util.stream.IntStream intStream97 = java.util.Arrays.stream(intArray96);
        int int98 = java.util.Arrays.compare(intArray82, intArray96);
        boolean boolean99 = charArrayList57.equals((java.lang.Object) intArray82);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(charArrayList73);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertArrayEquals(objArray75, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 0, 1, 5, 10, 32, 97 });
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertNotNull(intStream97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test556");
        java.util.ArrayList<java.util.AbstractList<char[]>> charArrayListList0 = new java.util.ArrayList<java.util.AbstractList<char[]>>();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test557");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        java.util.List<char[]> charArrayList44 = java.util.List.of(charArray9, charArray14, charArray25, charArray42);
        int int48 = java.util.Arrays.binarySearch(charArray14, 0, 2, '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArrayList44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-3) + "'", int48 == (-3));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test558");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList1 = charArrayList0.reversed();
        java.lang.Object obj2 = charArrayList0.clone();
        char[] charArray6 = new char[] { ' ', '#', 'a' };
        char[] charArray12 = new char[] { ' ', '#', '4', '#', 'a' };
        int int13 = java.util.Arrays.compare(charArray6, charArray12);
        charArrayList0.addFirst(charArray6);
        char[] charArray18 = new char[] { ' ', '#', 'a' };
        char[] charArray24 = new char[] { ' ', '#', '4', '#', 'a' };
        int int25 = java.util.Arrays.compare(charArray18, charArray24);
        char[] charArray29 = new char[] { ' ', '#', 'a' };
        char[] charArray35 = new char[] { ' ', '#', '4', '#', 'a' };
        int int36 = java.util.Arrays.compare(charArray29, charArray35);
        char[] charArray40 = new char[] { ' ', '#', 'a' };
        char[] charArray46 = new char[] { ' ', '#', '4', '#', 'a' };
        int int47 = java.util.Arrays.compare(charArray40, charArray46);
        char[] charArray51 = new char[] { ' ', '#', 'a' };
        char[] charArray57 = new char[] { ' ', '#', '4', '#', 'a' };
        int int58 = java.util.Arrays.compare(charArray51, charArray57);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        java.util.List<char[]> charArrayList70 = java.util.List.of(charArray35, charArray40, charArray51, charArray68);
        char[][] charArray71 = new char[][] { charArray24, charArray40 };
        java.util.ArrayList<char[]> charArrayList72 = new java.util.ArrayList<char[]>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList72, charArray71);
        char[] charArray77 = new char[] { ' ', '#', 'a' };
        char[] charArray83 = new char[] { ' ', '#', '4', '#', 'a' };
        int int84 = java.util.Arrays.compare(charArray77, charArray83);
        boolean boolean85 = charArrayList72.contains((java.lang.Object) charArray77);
        java.lang.Object[] objArray86 = charArrayList72.toArray();
        char[] charArray87 = charArrayList72.removeLast();
        char[] charArray88 = charArrayList72.removeFirst();
        int int89 = java.util.Arrays.mismatch(charArray6, charArray88);
        org.junit.Assert.assertNotNull(charArrayList1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 45 + "'", int13 == 45);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 45 + "'", int25 == 45);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 45 + "'", int36 == 45);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 45 + "'", int47 == 45);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 45 + "'", int58 == 45);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertNotNull(charArrayList70);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertArrayEquals(charArray83, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 45 + "'", int84 == 45);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[[ , #, 4, #, a], [ , #, a]]");
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test559");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        java.lang.String str72 = java.util.Objects.toString((java.lang.Object) charArray62, "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test560");
        double[] doubleArray3 = new double[] { (short) 0, 0.0d, (byte) -1 };
        java.util.stream.DoubleStream doubleStream4 = java.util.Arrays.stream(doubleArray3);
        double[] doubleArray6 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray6, (double) 6);
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray6, 100);
        java.util.Arrays.fill(doubleArray10, (double) (short) 1);
        int int13 = java.util.Arrays.compare(doubleArray3, doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Spliterator.OfDouble ofDouble16 = java.util.Arrays.spliterator(doubleArray3, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test561");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        int int71 = charArrayList57.size();
        int[] intArray77 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray77);
        int[] intArray84 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray84);
        java.util.Arrays.sort(intArray84);
        int int87 = java.util.Arrays.compareUnsigned(intArray77, intArray84);
        int int88 = charArrayList57.lastIndexOf((java.lang.Object) int87);
        java.util.Spliterator<char[]> charArraySpliterator89 = charArrayList57.spliterator();
        java.util.List<char[]> charArrayList90 = java.util.Collections.synchronizedList((java.util.List<char[]>) charArrayList57);
        boolean boolean91 = java.util.Objects.isNull((java.lang.Object) charArrayList57);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(charArraySpliterator89);
        org.junit.Assert.assertNotNull(charArrayList90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test562");
        java.util.NavigableSet<byte[]> byteArraySet0 = java.util.Collections.emptyNavigableSet();
        java.util.SortedSet<byte[]> byteArraySet1 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<byte[]>) byteArraySet0);
        java.util.SortedSet<byte[]> byteArraySet2 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<byte[]>) byteArraySet0);
        java.util.List<java.util.SequencedSet<byte[]>> byteArraySetList3 = java.util.Collections.singletonList((java.util.SequencedSet<byte[]>) byteArraySet2);
        org.junit.Assert.assertNotNull(byteArraySet0);
        org.junit.Assert.assertNotNull(byteArraySet1);
        org.junit.Assert.assertNotNull(byteArraySet2);
        org.junit.Assert.assertNotNull(byteArraySetList3);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test563");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = java.util.Objects.checkFromToIndex(6, (-2060932013), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [6, -2060932013) out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test564");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(shortArray9, (int) (byte) 10, 4, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test565");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = java.util.Arrays.copyOfRange(doubleArray1, (int) (short) 0, (int) 'a');
        double[] doubleArray9 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray16 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int17 = java.util.Arrays.compare(doubleArray9, doubleArray16);
        java.util.stream.DoubleStream doubleStream18 = java.util.Arrays.stream(doubleArray9);
        java.util.Arrays.parallelSort(doubleArray9);
        int int20 = java.util.Arrays.mismatch(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.0d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test566");
        int[] intArray5 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray5);
        java.util.Arrays.sort(intArray5);
        java.util.Arrays.sort(intArray5);
        int[] intArray14 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray14);
        java.util.Arrays.sort(intArray14);
        java.util.Arrays.sort(intArray14);
        int int18 = java.util.Arrays.compareUnsigned(intArray5, intArray14);
        java.util.Spliterator.OfInt ofInt19 = java.util.Arrays.spliterator(intArray5);
        java.util.List<java.util.Spliterator.OfInt> ofIntList20 = java.util.List.of(ofInt19);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(ofInt19);
        org.junit.Assert.assertNotNull(ofIntList20);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test567");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        java.lang.Object[] objArray71 = charArrayList57.toArray();
        char[] charArray72 = charArrayList57.removeLast();
        charArrayList57.trimToSize();
        charArrayList57.clear();
        java.util.ArrayList<char[]> charArrayList75 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList76 = charArrayList75.reversed();
        int int77 = charArrayList75.size();
        java.util.Iterator<char[]> charArrayItor78 = charArrayList75.iterator();
        int int79 = java.util.Collections.indexOfSubList((java.util.List<char[]>) charArrayList57, (java.util.List<char[]>) charArrayList75);
        java.util.ListIterator<char[]> charArrayItor80 = charArrayList75.listIterator();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[[ , #, 4, #, a], [ , #, a]]");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArrayList76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(charArrayItor78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(charArrayItor80);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test568");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = java.util.Arrays.copyOfRange(doubleArray1, (int) (short) 0, (int) 'a');
        java.util.Arrays.parallelSort(doubleArray4);
        java.util.Arrays.parallelSort(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test569");
        java.lang.String[] strArray6 = new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" };
        java.lang.String[] strArray13 = new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" };
        java.lang.String[] strArray20 = new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" };
        java.lang.String[] strArray27 = new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" };
        java.lang.String[] strArray34 = new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" };
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray6, strArray13, strArray20, strArray27, strArray34 };
        java.util.Spliterator<java.lang.String[]> strArraySpliterator36 = java.util.Arrays.spliterator(strArray35);
        java.io.Serializable[] serializableArray39 = java.util.Arrays.copyOfRange((java.io.Serializable[]) strArray35, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[100.0, 100.0, 100.0, 100.0, 100.0, 100.0]", "[false]", "[97.0, -1.0, 0.0, 1.0, 0.0, 1.0]", "[, [hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!], , ]", "5" });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArraySpliterator36);
        org.junit.Assert.assertNotNull(serializableArray39);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test570");
        double[] doubleArray3 = new double[] { (short) 0, 0.0d, (byte) -1 };
        java.util.stream.DoubleStream doubleStream4 = java.util.Arrays.stream(doubleArray3);
        double[] doubleArray6 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray6, (double) 6);
        double[] doubleArray10 = java.util.Arrays.copyOf(doubleArray6, 100);
        java.util.Arrays.fill(doubleArray10, (double) (short) 1);
        int int13 = java.util.Arrays.compare(doubleArray3, doubleArray10);
        double[] doubleArray17 = new double[] { 1.0d, (-6), 2 };
        int int18 = java.util.Arrays.mismatch(doubleArray10, doubleArray17);
        java.util.Spliterator.OfDouble ofDouble19 = java.util.Arrays.spliterator(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-6.0d), 2.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(ofDouble19);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test571");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 'a', ' ', 0, 5 };
        java.util.Arrays.sort(intArray6);
        java.util.stream.IntStream intStream8 = java.util.Arrays.stream(intArray6);
        java.util.Spliterator.OfInt ofInt9 = java.util.Arrays.spliterator(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 5, 10, 32, 97 });
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(ofInt9);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test572");
        java.lang.String str1 = java.util.Objects.toString((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test573");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray6 = new java.lang.String[] { "", "[hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!]", "", "" };
        int int7 = java.util.Arrays.compare(strArray1, strArray6);
        java.util.Arrays.parallelSort(strArray6);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "", "[hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!]", "", "" };
        int int18 = java.util.Arrays.compare(strArray12, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = java.util.Arrays.compare(strArray6, 0, (-5), strArray17, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-5)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "[hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!]" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "[hi!, [0.0, 10.0, 100.0], [0.0, 10.0, 100.0], hi!]", "", "" });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test574");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10, (byte) -1, (short) 100, (byte) 1 };
        short[] shortArray9 = java.util.Arrays.copyOfRange(shortArray6, 0, (int) ' ');
        java.util.Arrays.parallelSort(shortArray9);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = java.util.Arrays.copyOfRange(shortArray9, 65535, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 65535 > 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 100, (short) 10, (short) -1, (short) 100, (short) 1 });
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test575");
        double[] doubleArray1 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray1, (double) 6);
        java.util.stream.DoubleStream doubleStream4 = java.util.Arrays.stream(doubleArray1);
        java.lang.String str5 = java.util.Arrays.toString(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[6.0]" + "'", str5, "[6.0]");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test576");
        long[] longArray0 = new long[] {};
        java.util.Arrays.sort(longArray0, 0, (int) (short) 0);
        long[] longArray4 = new long[] {};
        java.util.Arrays.sort(longArray4, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray4);
        int int9 = java.util.Arrays.compare(longArray0, longArray4);
        java.util.stream.LongStream longStream10 = java.util.Arrays.stream(longArray0);
        java.lang.String str11 = java.util.Objects.toIdentityString((java.lang.Object) longStream10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test577");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 'a', ' ', 0, 5 };
        java.util.Arrays.sort(intArray6);
        int int9 = java.util.Arrays.binarySearch(intArray6, (-2));
        int[] intArray12 = java.util.Arrays.copyOfRange(intArray6, 3, (int) '#');
        java.util.Arrays.parallelSort(intArray12);
        java.util.Spliterator.OfInt ofInt14 = java.util.Arrays.spliterator(intArray12);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 5, 10, 32, 97 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(ofInt14);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test578");
        long[] longArray0 = new long[] {};
        java.util.Arrays.sort(longArray0, 0, (int) (short) 0);
        long[] longArray4 = new long[] {};
        java.util.Arrays.sort(longArray4, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray4);
        int int9 = java.util.Arrays.compare(longArray0, longArray4);
        long[] longArray10 = new long[] {};
        java.util.Arrays.sort(longArray10, 0, (int) (short) 0);
        long[] longArray14 = new long[] {};
        java.util.Arrays.sort(longArray14, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray14);
        int int19 = java.util.Arrays.compare(longArray10, longArray14);
        int int20 = java.util.Arrays.compare(longArray0, longArray10);
        java.util.Arrays.parallelSort(longArray0);
        long[] longArray24 = new long[] {};
        java.util.Arrays.sort(longArray24, 0, (int) (short) 0);
        long[] longArray28 = new long[] {};
        java.util.Arrays.sort(longArray28, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray28);
        int int33 = java.util.Arrays.compare(longArray24, longArray28);
        long[] longArray34 = new long[] {};
        java.util.Arrays.sort(longArray34, 0, (int) (short) 0);
        long[] longArray38 = new long[] {};
        java.util.Arrays.sort(longArray38, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray38);
        int int43 = java.util.Arrays.compare(longArray34, longArray38);
        int int44 = java.util.Arrays.compare(longArray24, longArray34);
        java.util.Arrays.parallelSort(longArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = java.util.Arrays.compare(longArray0, (int) (short) 100, (int) (short) 10, longArray24, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] {});
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test579");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        int int71 = charArrayList57.size();
        java.util.ArrayList<char[]> charArrayList72 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList73 = charArrayList72.reversed();
        charArrayList72.clear();
        java.lang.Object[] objArray75 = charArrayList72.toArray();
        int int76 = java.util.Collections.indexOfSubList((java.util.List<char[]>) charArrayList57, (java.util.List<char[]>) charArrayList72);
        char[] charArray78 = charArrayList57.get((int) (byte) 0);
        java.util.Arrays.parallelSort(charArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(charArray78, 2, (-50), '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(2) > toIndex(-50)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '#', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(charArrayList73);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertArrayEquals(objArray75, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { ' ', '#', '#', '4', 'a' });
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test580");
        java.util.ArrayList<char[]> charArrayList0 = new java.util.ArrayList<char[]>();
        java.util.List<char[]> charArrayList1 = charArrayList0.reversed();
        charArrayList0.clear();
        java.lang.Object[] objArray3 = charArrayList0.toArray();
        boolean boolean5 = charArrayList0.equals((java.lang.Object) false);
        char[] charArray9 = new char[] { ' ', '#', 'a' };
        char[] charArray15 = new char[] { ' ', '#', '4', '#', 'a' };
        int int16 = java.util.Arrays.compare(charArray9, charArray15);
        charArrayList0.addFirst(charArray9);
        char[] charArray21 = new char[] { ' ', '#', 'a' };
        char[] charArray27 = new char[] { ' ', '#', '4', '#', 'a' };
        int int28 = java.util.Arrays.compare(charArray21, charArray27);
        java.util.Arrays.sort(charArray21);
        int int30 = java.util.Arrays.compare(charArray9, charArray21);
        org.junit.Assert.assertNotNull(charArrayList1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 45 + "'", int28 == 45);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test581");
        java.util.Enumeration<java.lang.reflect.AnnotatedElement> annotatedElementEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(annotatedElementEnumeration0);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test582");
        double[] doubleArray4 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray11 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int12 = java.util.Arrays.compare(doubleArray4, doubleArray11);
        java.util.stream.DoubleStream doubleStream13 = java.util.Arrays.stream(doubleArray4);
        java.util.Spliterator.OfDouble ofDouble14 = java.util.Arrays.spliterator(doubleArray4);
        java.util.function.Supplier<java.lang.String> strSupplier15 = null;
        java.util.Spliterator.OfDouble ofDouble16 = java.util.Objects.requireNonNull(ofDouble14, strSupplier15);
        double[] doubleArray21 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray28 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int29 = java.util.Arrays.compare(doubleArray21, doubleArray28);
        java.util.stream.DoubleStream doubleStream30 = java.util.Arrays.stream(doubleArray21);
        java.util.Spliterator.OfDouble ofDouble31 = java.util.Arrays.spliterator(doubleArray21);
        java.util.function.Supplier<java.lang.String> strSupplier32 = null;
        java.util.Spliterator.OfDouble ofDouble33 = java.util.Objects.requireNonNull(ofDouble31, strSupplier32);
        double[] doubleArray35 = new double[] { (-1.0d) };
        double[] doubleArray38 = java.util.Arrays.copyOfRange(doubleArray35, (int) (short) 0, (int) 'a');
        java.util.Arrays.parallelSort(doubleArray38);
        java.util.Spliterator.OfDouble ofDouble40 = java.util.Arrays.spliterator(doubleArray38);
        double[] doubleArray42 = new double[] { (-1.0d) };
        double[] doubleArray45 = java.util.Arrays.copyOfRange(doubleArray42, (int) (short) 0, (int) 'a');
        java.util.Arrays.parallelSort(doubleArray45);
        java.util.Spliterator.OfDouble ofDouble47 = java.util.Arrays.spliterator(doubleArray45);
        double[] doubleArray52 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray59 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int60 = java.util.Arrays.compare(doubleArray52, doubleArray59);
        java.util.stream.DoubleStream doubleStream61 = java.util.Arrays.stream(doubleArray52);
        java.util.Spliterator.OfDouble ofDouble62 = java.util.Arrays.spliterator(doubleArray52);
        double[] doubleArray67 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray74 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int75 = java.util.Arrays.compare(doubleArray67, doubleArray74);
        java.util.stream.DoubleStream doubleStream76 = java.util.Arrays.stream(doubleArray67);
        java.util.Spliterator.OfDouble ofDouble77 = java.util.Arrays.spliterator(doubleArray67);
        java.util.function.Supplier<java.lang.String> strSupplier78 = null;
        java.util.Spliterator.OfDouble ofDouble79 = java.util.Objects.requireNonNull(ofDouble77, strSupplier78);
        double[] doubleArray84 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray91 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int92 = java.util.Arrays.compare(doubleArray84, doubleArray91);
        java.util.stream.DoubleStream doubleStream93 = java.util.Arrays.stream(doubleArray84);
        java.util.Spliterator.OfDouble ofDouble94 = java.util.Arrays.spliterator(doubleArray84);
        java.util.function.Supplier<java.lang.String> strSupplier95 = null;
        java.util.Spliterator.OfDouble ofDouble96 = java.util.Objects.requireNonNull(ofDouble94, strSupplier95);
        java.util.List<java.util.Spliterator.OfDouble> ofDoubleList97 = java.util.List.of(ofDouble14, ofDouble31, ofDouble40, ofDouble47, ofDouble62, ofDouble77, ofDouble94);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(ofDouble14);
        org.junit.Assert.assertNotNull(ofDouble16);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, (-1.0d), 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(ofDouble31);
        org.junit.Assert.assertNotNull(ofDouble33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(ofDouble40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(ofDouble47);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, (-1.0d), 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(doubleStream61);
        org.junit.Assert.assertNotNull(ofDouble62);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-1.0d), 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(doubleStream76);
        org.junit.Assert.assertNotNull(ofDouble77);
        org.junit.Assert.assertNotNull(ofDouble79);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 0.0d, (-1.0d), 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(doubleStream93);
        org.junit.Assert.assertNotNull(ofDouble94);
        org.junit.Assert.assertNotNull(ofDouble96);
        org.junit.Assert.assertNotNull(ofDoubleList97);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test583");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        java.lang.Object[] objArray71 = charArrayList57.toArray();
        java.lang.Object obj72 = charArrayList57.clone();
        java.util.ListIterator<char[]> charArrayItor73 = charArrayList57.listIterator();
        char[] charArray74 = charArrayList57.removeLast();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[[ , #, 4, #, a], [ , #, a]]");
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(charArrayItor73);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { ' ', '#', 'a' });
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test584");
        java.util.NavigableSet<char[]> charArraySet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(charArraySet0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test585");
        java.util.Set<java.util.stream.IntStream> intStreamSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(intStreamSet0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test586");
        double[] doubleArray1 = new double[] { 1 };
        java.util.Arrays.fill(doubleArray1, (double) 6);
        double[] doubleArray5 = java.util.Arrays.copyOf(doubleArray1, 100);
        java.util.Arrays.fill(doubleArray5, (double) (short) 1);
        java.util.Arrays.fill(doubleArray5, (double) (-33));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 6.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test587");
        char[] charArray3 = new char[] { ' ', '#', 'a' };
        char[] charArray9 = new char[] { ' ', '#', '4', '#', 'a' };
        int int10 = java.util.Arrays.compare(charArray3, charArray9);
        char[] charArray14 = new char[] { ' ', '#', 'a' };
        char[] charArray20 = new char[] { ' ', '#', '4', '#', 'a' };
        int int21 = java.util.Arrays.compare(charArray14, charArray20);
        char[] charArray25 = new char[] { ' ', '#', 'a' };
        char[] charArray31 = new char[] { ' ', '#', '4', '#', 'a' };
        int int32 = java.util.Arrays.compare(charArray25, charArray31);
        char[] charArray36 = new char[] { ' ', '#', 'a' };
        char[] charArray42 = new char[] { ' ', '#', '4', '#', 'a' };
        int int43 = java.util.Arrays.compare(charArray36, charArray42);
        char[] charArray47 = new char[] { ' ', '#', 'a' };
        char[] charArray53 = new char[] { ' ', '#', '4', '#', 'a' };
        int int54 = java.util.Arrays.compare(charArray47, charArray53);
        java.util.List<char[]> charArrayList55 = java.util.List.of(charArray20, charArray25, charArray36, charArray53);
        char[][] charArray56 = new char[][] { charArray9, charArray25 };
        java.util.ArrayList<char[]> charArrayList57 = new java.util.ArrayList<char[]>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<char[]>) charArrayList57, charArray56);
        char[] charArray62 = new char[] { ' ', '#', 'a' };
        char[] charArray68 = new char[] { ' ', '#', '4', '#', 'a' };
        int int69 = java.util.Arrays.compare(charArray62, charArray68);
        boolean boolean70 = charArrayList57.contains((java.lang.Object) charArray62);
        charArrayList57.trimToSize();
        charArrayList57.clear();
        java.lang.Object[] objArray73 = charArrayList57.toArray();
        charArrayList57.trimToSize();
        java.util.Random random75 = null;
        java.util.Collections.shuffle((java.util.List<char[]>) charArrayList57, random75);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray78 = charArrayList57.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 45 + "'", int32 == 45);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 45 + "'", int43 == 45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 45 + "'", int54 == 45);
        org.junit.Assert.assertNotNull(charArrayList55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { ' ', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { ' ', '#', '4', '#', 'a' });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertArrayEquals(objArray73, new java.lang.Object[] {});
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test588");
        int[] intArray5 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray5);
        java.util.Arrays.sort(intArray5);
        java.util.Arrays.sort(intArray5);
        int[] intArray14 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray14);
        java.util.Arrays.sort(intArray14);
        java.util.Arrays.sort(intArray14);
        int int18 = java.util.Arrays.compareUnsigned(intArray5, intArray14);
        java.util.Spliterator.OfInt ofInt19 = java.util.Arrays.spliterator(intArray5);
        java.util.Arrays.sort(intArray5, (int) (byte) 0, (int) (byte) 0);
        int[] intArray30 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray30);
        java.util.Arrays.sort(intArray30);
        java.util.Arrays.sort(intArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = java.util.Arrays.compareUnsigned(intArray5, 0, (-2060931702), intArray30, 0, 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-2060931702)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(ofInt19);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test589");
        int[] intArray5 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray5);
        java.util.Arrays.sort(intArray5);
        java.util.Arrays.sort(intArray5);
        int[] intArray14 = new int[] { (byte) 0, 45, (-2060931702), (-1), (-1947244222) };
        java.util.Arrays.parallelSort(intArray14);
        java.util.Arrays.sort(intArray14);
        java.util.Arrays.sort(intArray14);
        int int18 = java.util.Arrays.compareUnsigned(intArray5, intArray14);
        java.util.Arrays.sort(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-2060931702), (-1947244222), (-1), 0, 45 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test590");
        double[] doubleArray4 = new double[] { 0, (-1.0f), '#', (byte) 100 };
        double[] doubleArray11 = new double[] { (byte) 100, (-1.0d), 100.0f, (byte) -1, (short) -1, 1 };
        int int12 = java.util.Arrays.compare(doubleArray4, doubleArray11);
        java.util.Spliterator.OfDouble ofDouble13 = java.util.Arrays.spliterator(doubleArray4);
        java.util.Arrays.fill(doubleArray4, 0, 4, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Arrays.fill(doubleArray4, 45, 3, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(45) > toIndex(3)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 35.0d, 35.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 100.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(ofDouble13);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test591");
        float[] floatArray3 = new float[] { 10, 1L, 100 };
        float[] floatArray5 = java.util.Arrays.copyOf(floatArray3, (int) (short) 1);
        float[] floatArray14 = new float[] { 'a', (-1.0f), 0.0f, (short) 1, 0, 1L };
        int int16 = java.util.Arrays.binarySearch(floatArray14, (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = java.util.Arrays.equals(floatArray5, (int) (byte) 100, (int) '4', floatArray14, 1, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertArrayEquals(floatArray3, new float[] { 10.0f, 1.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 97.0f, (-1.0f), 0.0f, 1.0f, 0.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test592");
        long[] longArray4 = new long[] { (short) 10, (byte) 0, 100L, '4' };
        long[] longArray5 = new long[] {};
        java.util.Arrays.sort(longArray5, 0, (int) (short) 0);
        int int9 = java.util.Arrays.compareUnsigned(longArray4, longArray5);
        long[] longArray10 = new long[] {};
        java.util.Arrays.sort(longArray10, 0, (int) (short) 0);
        long[] longArray14 = new long[] {};
        java.util.Arrays.sort(longArray14, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray14);
        int int19 = java.util.Arrays.compare(longArray10, longArray14);
        long[] longArray20 = new long[] {};
        java.util.Arrays.sort(longArray20, 0, (int) (short) 0);
        long[] longArray24 = new long[] {};
        java.util.Arrays.sort(longArray24, 0, (int) (short) 0);
        java.util.Arrays.sort(longArray24);
        int int29 = java.util.Arrays.compare(longArray20, longArray24);
        int int30 = java.util.Arrays.compare(longArray10, longArray20);
        java.util.function.Supplier<java.lang.String> strSupplier31 = null;
        long[] longArray32 = java.util.Objects.requireNonNull(longArray20, strSupplier31);
        int int34 = java.util.Arrays.binarySearch(longArray32, (long) (-2060931702));
        int int35 = java.util.Arrays.compareUnsigned(longArray5, longArray32);
        long[] longArray38 = new long[] { 100L, 1L };
        java.util.Arrays.sort(longArray38);
        long[] longArray41 = new long[] { 3 };
        int int42 = java.util.Arrays.mismatch(longArray38, longArray41);
        int int43 = java.util.Arrays.compare(longArray32, longArray41);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 10L, 0L, 100L, 52L });
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] {});
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] {});
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L, 100L });
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { 3L });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SumaListasDigitosReg1.test593");
        long[] longArray2 = new long[] { 65535, 1L };
        long[] longArray5 = new long[] { 65535, 1L };
        long[] longArray8 = new long[] { 65535, 1L };
        long[] longArray11 = new long[] { 65535, 1L };
        long[] longArray14 = new long[] { 65535, 1L };
        long[] longArray17 = new long[] { 65535, 1L };
        long[][] longArray18 = new long[][] { longArray2, longArray5, longArray8, longArray11, longArray14, longArray17 };
        long[] longArray21 = new long[] { 65535, 1L };
        long[] longArray24 = new long[] { 65535, 1L };
        long[] longArray27 = new long[] { 65535, 1L };
        long[] longArray30 = new long[] { 65535, 1L };
        long[] longArray33 = new long[] { 65535, 1L };
        long[] longArray36 = new long[] { 65535, 1L };
        long[][] longArray37 = new long[][] { longArray21, longArray24, longArray27, longArray30, longArray33, longArray36 };
        long[] longArray40 = new long[] { 65535, 1L };
        long[] longArray43 = new long[] { 65535, 1L };
        long[] longArray46 = new long[] { 65535, 1L };
        long[] longArray49 = new long[] { 65535, 1L };
        long[] longArray52 = new long[] { 65535, 1L };
        long[] longArray55 = new long[] { 65535, 1L };
        long[][] longArray56 = new long[][] { longArray40, longArray43, longArray46, longArray49, longArray52, longArray55 };
        long[] longArray59 = new long[] { 65535, 1L };
        long[] longArray62 = new long[] { 65535, 1L };
        long[] longArray65 = new long[] { 65535, 1L };
        long[] longArray68 = new long[] { 65535, 1L };
        long[] longArray71 = new long[] { 65535, 1L };
        long[] longArray74 = new long[] { 65535, 1L };
        long[][] longArray75 = new long[][] { longArray59, longArray62, longArray65, longArray68, longArray71, longArray74 };
        long[] longArray78 = new long[] { 65535, 1L };
        long[] longArray81 = new long[] { 65535, 1L };
        long[] longArray84 = new long[] { 65535, 1L };
        long[] longArray87 = new long[] { 65535, 1L };
        long[] longArray90 = new long[] { 65535, 1L };
        long[] longArray93 = new long[] { 65535, 1L };
        long[][] longArray94 = new long[][] { longArray78, longArray81, longArray84, longArray87, longArray90, longArray93 };
        long[][][] longArray95 = new long[][][] { longArray18, longArray37, longArray56, longArray75, longArray94 };
        java.util.stream.Stream<long[][]> longArrayStream96 = java.util.Arrays.stream(longArray95);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertArrayEquals(longArray55, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertArrayEquals(longArray59, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertArrayEquals(longArray62, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertArrayEquals(longArray65, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertArrayEquals(longArray74, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertArrayEquals(longArray78, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertArrayEquals(longArray81, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertArrayEquals(longArray84, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertArrayEquals(longArray87, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertArrayEquals(longArray90, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertArrayEquals(longArray93, new long[] { 65535L, 1L });
        org.junit.Assert.assertNotNull(longArray94);
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertNotNull(longArrayStream96);
    }
}

