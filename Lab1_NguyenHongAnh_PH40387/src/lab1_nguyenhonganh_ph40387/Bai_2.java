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
public class Bai_2 {

    public static void main(String[] args) {
        
          System.out.println("LAB 1 - Bai 2");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao lenght= ");
        int lenght = sc.nextInt();

        System.out.println("Nhap vao width= ");
        int width = sc.nextInt();
        
        int chuVi = (lenght + width)*2;
        System.out.println("Chu vi hinh chu nhat la: "+ chuVi);
        
        int dienTich = lenght * width;
        System.out.println("Dien tich hinh chu nhat la: "+ dienTich);
        
        int canhNho = Math.min(lenght, width);
        System.out.println("Canh nho nhat cua hinh chu nhat la: "+ canhNho);

    }

}
