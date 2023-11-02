/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.estudio_tpcolechash;

import java.util.HashSet;
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
            Scanner scStr = new Scanner(System.in);
            HashSet<String> lista = new HashSet<String>();
            
            lista.add(scStr.nextLine());
            lista.add(scStr.nextLine());
            lista.add(scStr.nextLine());
            lista.add(scStr.nextLine());
            
            for (String o : lista){
                System.out.println(o);
            }

    }

}
