/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author kowsi
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int givenNumber=9987209;
        int search=5;
        if(containNumber(givenNumber,search))
        {
            System.out.println("the given number is found");
        }
        else
        {
            System.out.println("the given number is not present");
            
        }
    }
    public static boolean
            containNumber(int number,int searchn)
            {
                while(number>0)
                {
                    int digit=number%10;
                    if(digit==searchn)
                    {
                        return true;
                    }
                    number/=10;
                }
                return false;
            }
}
