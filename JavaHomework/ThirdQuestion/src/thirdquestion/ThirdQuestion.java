/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thirdquestion;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class ThirdQuestion {

    /**
     * @param args the command line arguments
     */
   static void testInPut(){
        Scanner console = new Scanner(System.in);
        System.out.print("\nBoolean variable: ");
        boolean b = console.nextBoolean();
        System.out.print("\nByte variable: ");
        byte by = console.nextByte();
        System.out.print("\nDouble variable: ");
        double d = console.nextDouble();
        System.out.print("\nFloat variable: ");
        float f = console.nextFloat();
        System.out.print("\nInteger variable: ");
        int i = console.nextInt();
        System.out.print("\nLong variable: ");
        long l = console.nextLong();
        System.out.print("\nShort variable: ");
        short s = console.nextShort();
    }
   static void testInPutValueType(){
       Scanner console = new Scanner(System.in);
        System.out.print("\nBoolean variable: ");
        if(console.hasNextBoolean()){
        boolean b = console.nextBoolean();
            System.out.println("Valid value");
        }
        else
        {
            console.next();
            System.out.println("Not valid value");
        }
        System.out.print("\nByte variable: ");
        if(console.hasNextByte()){
            byte by = console.nextByte();
            System.out.println("Valid value");
        }
        else
        {
            console.next();
            System.out.println("Not valid value");
        }
        System.out.print("\nDouble variable: ");
        if(console.hasNextDouble()){
            double d = console.nextDouble();
            System.out.println("Valid value");
        }
        else
        {
            console.next();
            System.out.println("Not valid value");
        }
        System.out.print("\nFloat variable: ");
        if(console.hasNextFloat()){
            float f = console.nextFloat();
            System.out.println("Valid value");
        }
        else
        {
            console.next();
            System.out.println("Not valid value");
        }
        System.out.print("\nInteger variable: ");
        if(console.hasNextInt()){
            int i = console.nextInt();
            System.out.println("Valid value");
        }
        else
        {
            console.next();
            System.out.println("Not valid value");
        }
        System.out.print("\nLong variable: ");
        if(console.hasNextLong()){
            long l = console.nextLong();
            System.out.println("Valid value");
        }
        else
        {
            console.next();
            System.out.println("Not valid value");
        }
        System.out.print("\nShort variable: ");
        if(console.hasNextShort()){
            short s = console.nextShort();
            System.out.println("Valid value");
        }
        else
        {
            console.next();
            System.out.println("Not valid value");
        }
   }
   static void testShowInputDialog(){
       String s = JOptionPane.showInputDialog("Enter value:");
       int x = Integer.parseInt(s);
   }
    public static void main(String[] args) {
        // TODO code application logic here
        //testInPut();
        //testInPutValueType();
        testShowInputDialog();
        
    }
}