
package binaryencodedapp.com.assignment.logic;

import java.io.*;

public class BinaryEncoder {
    
    
    public BinaryEncoder()
    {
        
    }
    
    public byte[] encode(String decimalNumber) throws Exception
    {
        String binaryArray = "";
        String tempBinary = "";
        int byteArrayLength = (decimalNumber.length());
        
        // We need to add a prefix of 0 if, the length of the string is not even.
        if(byteArrayLength % 2 != 0)
        {
            decimalNumber = "0" + decimalNumber;
        }
        
        //We do not need to pair up the numbers as they are being stored into an array
        byte [] byteData = new byte[byteArrayLength];
             for(int i = 0; i < byteArrayLength; i ++)
            {
                int no = (int)decimalNumber.charAt(i);
                 while(no != 0)
                {
                   int remainder = (int)no % 2;
                   tempBinary = remainder + tempBinary;
                   no = no/2;
                }
                byteData[i] = Byte.parseByte(tempBinary.substring(tempBinary.length() -4));
                tempBinary = "";
                System.out.println(byteData[i]);
            }      
        
        return byteData; 
    }
    
    public String  decode(byte[] bcdData) throws Exception
    {
        StringBuilder binaryData = new StringBuilder();
         
        
        for(int i = 0; i < bcdData.length; i++)
            
        {
            int value = bcdData[i];
            String binary = String.valueOf(value);
            //Because the byte removes the leading zeroes, we need to append the zero when we add to the string.
            if(binary.length() < 4)
            {
                for(int j = 0; j < 4 - binary.length(); j ++)
                {
                   binaryData.append("0");
                }
                binaryData.append(bcdData[i]);
            }
            else
            {
                binaryData.append(bcdData[i]);
            }
            
        }
        
        return binaryData.toString();
    }
    
  
}
