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
public class Bai_5 {
    
    public static void main(String[] args) {
        
        System.out.println("LAB 1 - Bai 5");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao diem mon Van: ");
        Double diemVan = sc.nextDouble();
        
        System.out.println("Nhap vao diem mon Toan: ");
        Double diemToan = sc.nextDouble();
        
        System.out.println("Nhap vao diem mon Anh: ");
        Double diemAnh = sc.nextDouble();
        
        System.out.println("---------------- Ket qua-------------");
        
        System.out.println("Diem Van la: "+ diemVan);
        System.out.println("Diem Toan la: "+ diemToan);
        System.out.println("Diem Anh la: "+diemAnh);
        
        Double diemTB = (((diemVan + diemToan)*2) + diemAnh) / 5;
        System.out.println("Diem trung binh la: "+ diemTB);
        
        if (diemTB >= 8) {
            
            System.out.println("Gioi");
            
        }
        
        else if (diemTB >= 6.5) {
            
            System.out.println("Kha");    
        
        }
        
        else if(diemTB >=5){
            
            System.out.println("TB");
        
        }
        
        else {
            System.out.println("Yeu");
        }
    }
    
}
