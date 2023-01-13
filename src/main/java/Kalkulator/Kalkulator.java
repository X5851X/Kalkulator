package Kalkulator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R
 */
public class Kalkulator {
    double Operan1, Operan2;
    public void isiOperan1 (int a){
       this.Operan1 = a;        
    }
    public void isiOperan2 (int b){
      this.Operan2 = b;        
    }
    public double tambah (){
        return (Operan1+Operan2);
    }
    public double kurang (){
        return (Operan1-Operan2);
    }
    public double bagi (){
        return (Operan1/Operan2);
    }   
    public double kali (){
        return (Operan1*Operan2);
    }
    public double pangkat (){
        return Math.pow(Operan1,Operan2);
    }
}
