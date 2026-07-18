package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    @Test
    public void testBinaryOR()
    {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");

        Binary result = Binary.or(binary1, binary2);

        assertTrue(result.getValue().equals("1111"));
    }

    @Test
    public void testBinaryOR2()
    {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");

        Binary result = Binary.or(binary1, binary2);

        assertTrue(result.getValue().equals("1011"));
    }

    @Test
    public void testBinaryOR3()
    {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");

        Binary result = Binary.or(binary1, binary2);

        assertTrue(result.getValue().equals("1011"));
    }

    @Test
    public void testBinaryOR4()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1010");

        Binary result = Binary.or(binary1, binary2);

        assertTrue(result.getValue().equals("1010"));
    }

    @Test
    public void testBinaryOR5()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");

        Binary result = Binary.or(binary1, binary2);

        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Tests AND with two binary numbers of the same length.
     */
    @Test
    public void testBinaryAND()
    {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");

        Binary result = Binary.and(binary1, binary2);

        assertTrue(result.getValue().equals("1000"));
    }

    /**
     * Tests AND when the first binary number is longer.
     */
    @Test
    public void testBinaryAND2()
    {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");

        Binary result = Binary.and(binary1, binary2);

        assertTrue(result.getValue().equals("10"));
    }

    /**
     * Tests AND when the second binary number is longer.
     */
    @Test
    public void testBinaryAND3()
    {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");

        Binary result = Binary.and(binary1, binary2);

        assertTrue(result.getValue().equals("10"));
    }

    /**
     * Tests AND with zero.
     */
    @Test
    public void testBinaryAND4()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1010");

        Binary result = Binary.and(binary1, binary2);

        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Tests AND with two zeros.
     */
    @Test
    public void testBinaryAND5()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");

        Binary result = Binary.and(binary1, binary2);

        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Tests multiplication with two binary numbers.
     * 1000 (8) × 1111 (15) = 1111000 (120)
     */
    @Test
    public void testBinaryMultiplication()
    {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");

        Binary result = Binary.multiply(binary1, binary2);

        assertTrue(result.getValue().equals("1111000"));
    }

    /**
     * Tests multiplication when the first number is longer.
     * 1010 (10) × 11 (3) = 11110 (30)
     */
    @Test
    public void testBinaryMultiplication2()
    {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");

        Binary result = Binary.multiply(binary1, binary2);

        assertTrue(result.getValue().equals("11110"));
    }

    /**
     * Tests multiplication when the second number is longer.
     * 11 (3) × 1010 (10) = 11110 (30)
     */
    @Test
    public void testBinaryMultiplication3()
    {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");

        Binary result = Binary.multiply(binary1, binary2);

        assertTrue(result.getValue().equals("11110"));
    }

    /**
     * Tests multiplication by zero.
     */
    @Test
    public void testBinaryMultiplication4()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1010");

        Binary result = Binary.multiply(binary1, binary2);

        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Tests multiplication of two zeros.
     */
    @Test
    public void testBinaryMultiplication5()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");

        Binary result = Binary.multiply(binary1, binary2);

        assertTrue(result.getValue().equals("0"));
    }
}