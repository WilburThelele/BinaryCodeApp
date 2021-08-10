/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryencodedapp.com.assignment.logic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pale
 */
public class BinaryEncoderTest {
    
    public BinaryEncoderTest() {
    }

    /**
     * Test of encode method, of class BinaryEncoder.
     */
    @Test
    public void testEncode() throws Exception {
        System.out.println("encode");
        String decimalNumber = "054321";
        BinaryEncoder instance = new BinaryEncoder();
        //The byte array will only remove leading zeroes as the byte acts the same way as an int in java which does not allow a leading 0. Hence the byte array difference.
        byte[] expResult = new byte[]{0,101,100,11,10,1};
        byte[] result = instance.encode(decimalNumber);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of decode method, of class BinaryEncoder.
     */
    @Test
    public void testDecode() throws Exception {
        System.out.println("decode");
        //The byte array will only remove leading zeroes as the byte acts the same way as an int in java which does not allow a leading 0. Hence the byte array difference.
        byte[] bcdData = new byte[]{0,101,100,11,10,1};
        BinaryEncoder instance = new BinaryEncoder();
        String expResult = "000001010100001100100001";
        String result = instance.decode(bcdData);
        assertEquals(expResult, result);
    }
    
}
