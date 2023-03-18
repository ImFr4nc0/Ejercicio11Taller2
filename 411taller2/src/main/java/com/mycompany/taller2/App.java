/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double n1,n2,n3;
        Scanner ent=new Scanner(System.in);
        System.out.println("encriba el primero numero");
        n1=ent.nextDouble();
        System.out.println("encriba el Segundo numero");
        n2=ent.nextDouble();
        System.out.println("encriba el Tercer numero");
        n3=ent.nextDouble();
        if(n1>n2 && n1>n3){
            System.out.println("El valor mayor entre:"+n1+","+n2+","+n3+",Es:"+n1);
        }
        if(n2>n1 && n2>n3){
            System.out.println("El valor mayor entre:"+n1+","+n2+","+n3+",Es:"+n2);
        }
        if(n3>n2 && n3>n1){
            System.out.println("El valor mayor entre:"+n1+","+n2+","+n3+",Es:"+n3);
        }
    }
}
