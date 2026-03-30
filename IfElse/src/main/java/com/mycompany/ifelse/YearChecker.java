/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifelse;

import java.util.Scanner;

/**
 *
 * @author Keabetswe Masole
 */
public class YearChecker {
    public void main(){
        
        Scanner Scan = new Scanner (System.in);
        System.out.println("Enter A Year");
        
        int year = Scan.nextInt();
        
        if (year %4==0) {
            System.out.println("Leap Year");
            
        }else
            
            System.out.println("Normal Year");
        }
    }
