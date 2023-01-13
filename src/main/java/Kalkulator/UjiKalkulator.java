package Kalkulator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Risvandiani
 */
public class UjiKalkulator {
    public static void main(String[] args) {
        Kalkulator c = new Kalkulator();
        c.isiOperan1 (7);
        c.isiOperan2 (5);
        System.out.println("Uji Coba Kalkulator");
        System.out.println("Tambah      : " + c.tambah());       
        System.out.println("Kurang      : " + c.kurang());       
        System.out.println("Bagi        : " + c.bagi());          
        System.out.println("Kali        : " + c.kali());        
        System.out.println("Pangkat     : " + c.pangkat());        
    }
}