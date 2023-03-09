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
public class Bai_1 {
    
    public static void main(String[] args) {
        
          System.out.println("LAB 1 - Bai 1");
        
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao ho va ten: ");
        String hoTen = sc.nextLine();
        
        System.out.println("Nhap vao diem trung binh: ");
        Double diem = sc.nextDouble();
        
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Diem trung binh: " + diem);
        
    }
    
}
