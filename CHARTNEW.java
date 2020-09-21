/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
import java.util.Scanner;
public class CHARTNEW {
    
    public static void main(String[] args){
      
        Scanner Keyboard = new Scanner ( System.in );
        double sales=0;
        double soldout1;
        double soldout2;
        double soldout3;
        double soldout4;
        double soldout5;
        System.out.println("Enter the sales@1 value:");
        soldout1 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales@2 value:");
        soldout2 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales@3 value:");
        soldout3 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales@4 value:");
        soldout4 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales@5 value:");
        soldout5 = Keyboard.nextDouble();
        Keyboard.nextLine();
      /*  if(sales >=100 || sales <=200)
        {
            System.out.println("asterix");
        }*/
        for( int i=1;i<=soldout1/100;i++ )
     {
         
     System.out.print("*");
     }
        System.out.println();
        for( int i=1;i<=soldout2/100;i++ )
        {
            System.out.print("*");
        }
        System.out.println();
        for ( int i=1;i<=soldout3/100;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for( int i=1;i<=soldout4/100;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for( int i=1;i<=soldout5/100;i++)
        {
            System.out.print("*");
        }
        }
        
            
        }    

