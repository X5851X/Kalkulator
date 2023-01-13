package BankABC;

public class Bank {
    int saldo;
   
    public Bank (int saldo){
        this.saldo = saldo;
    }      
    public void simpanUang(int value){
        saldo += value;
    }
    public void ambilUang(int value){
        saldo -= value;
    }
    public int getsaldo(){
        return saldo;
    }
}