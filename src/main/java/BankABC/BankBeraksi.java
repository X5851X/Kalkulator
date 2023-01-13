package BankABC;

import java.util.Scanner;
public class BankBeraksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bankpbo = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankpbo.getsaldo());
        System.out.println("Simpan Uang: Rp. " );
            int simpan = input.nextInt();
            bankpbo.simpanUang(simpan);
        System.out.println("Saldo saat ini: Rp. " + bankpbo.getsaldo());
        System.out.println("Ambil Uang: Rp." );
            int ambil = input.nextInt();
            bankpbo.ambilUang(ambil);
        System.out.println("Saldo saat ini: Rp. " + bankpbo.getsaldo());
    }
    
}