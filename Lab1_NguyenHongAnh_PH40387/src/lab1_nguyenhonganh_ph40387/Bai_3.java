/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_nguyenhonganh_ph40387;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_3 {
    
    public static void main(String[] args) {
        
          System.out.println("LAB 1 - Bai 3");
        
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao canh a= ");
        Double a = sc.nextDouble();
        
        double theTich = Math.pow(a, 3);
        System.out.println("The tich cua khoi lap phuong la: "+ theTich);
        
    }
    
}
