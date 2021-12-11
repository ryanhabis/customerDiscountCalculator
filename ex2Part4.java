/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ryanh
 */
public class ex2Part4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter item quantity ");
        int item = scanner.nextInt();
        
        System.out.println("Enter cost per item");
        double cost = scanner.nextDouble();
        
        double total = item * cost;
        
        if(total >= 1000)
        {
            System.out.println("Your total is = " + total);
            
            double discount = 0.10 * total;
            
            System.out.println("With your discount =  " + discount);
            
            System.out.println("Final price is = " + (total - discount));
        }
        else
        {
            System.out.println("Your total is = " + total);
        }
    }
}
