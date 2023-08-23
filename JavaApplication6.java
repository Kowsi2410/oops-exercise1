/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author kowsi
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.print("enter unit price:");
        double unitprice=scanner.nextDouble();
        System.out.print("\nenter quantity:");
        int quantity=scanner.nextInt();
        double revenue=unitprice*quantity;
        double discountrate = 0;
        if(quantity>=100&&quantity<=120)
        {
            discountrate=0.1;
        }
        else if(quantity>120)
        {
            discountrate=0.15;
        }
            double discountamount;
            discountamount=revenue*discountrate;
            double discountedrevenue=revenue-discountamount;
            System.out.println("\nthe revenue from sale: "+discountedrevenue);
            System.out.println("\nafter discount:"+discountamount+"("+(discountrate*100)+"%)");
            scanner.close();
        }
    }
    

