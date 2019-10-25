/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wzy.question3;

import java.util.Scanner;

/**
 *
 * @author uwtsd-student
 */
public class Program {
    
    private static Scanner stdin = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.println("Please enter a currency: ");
        
        String currency = stdin.nextLine();
        
        System.out.println("Please enter an amount: ");
        
        double amount = Double.parseDouble(stdin.nextLine());
        
        double Pounds = 0;
        double Euros = 0;
        double Dollars = 0;
        
        if(currency.equalsIgnoreCase("Pounds")){
            
            Euros = 1.15 * amount;
            Dollars = 1.25 * amount;
            System.out.printf("Euros is "+Euros+", Dollars is "+Dollars);   
            
        }else if(currency.equalsIgnoreCase("Euros")){
            
            Pounds = 1 / 1.15 * amount;
            Dollars = 1.1 * amount;
            System.out.printf("Pounds is "+Pounds+", Dollars is "+Dollars);   
            
        }else if(currency.equalsIgnoreCase("Dollars")){
            
            Pounds = 1 / 1.25 * amount;
            Euros = 1 / 1.10 * amount;
            System.out.printf("Pounds is "+Pounds+", Euros is "+Euros); 
            
        }
    }
}
