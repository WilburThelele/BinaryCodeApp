

package binaryencodedapp;


import binaryencodedapp.com.assignment.logic.BinaryEncoder;
import java.util.Scanner;

public class BinaryEncodedApp {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       BinaryEncoder binaryObj = new BinaryEncoder();
       
       
       System.out.println("Please enter Decimal to convert");
       String value = input.nextLine();
       
       try
       {
          byte[] data = binaryObj.encode(value);
          String binaryData = binaryObj.decode(data);
          System.out.println(binaryData);
          System.out.println("What the results is " + data);
       }catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
    
}
