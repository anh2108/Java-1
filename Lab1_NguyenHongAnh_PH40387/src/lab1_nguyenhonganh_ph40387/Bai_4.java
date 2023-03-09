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
public class Bai_4 {

    public static void main(String[] args) {
        
        System.out.println("LAB 1 - Bai 4");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao he so a= ");
        int a = sc.nextInt();
        
        System.out.println("Nhap vao he so b= ");
        int b = sc.nextInt();
        
        System.out.println("Nhap  vao he so c= ");
        int c = sc.nextInt();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("delta= "+ delta);
    }
    
}
