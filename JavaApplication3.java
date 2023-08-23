/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
//import java.util.*;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result=0;
        for(int i=100;i<=200;i++)
        {
            if(i%8==0)
                result+=i;
        }
            System.out.println(" the sum of all digits between 100 and 200 is:"+result);
    }
}
