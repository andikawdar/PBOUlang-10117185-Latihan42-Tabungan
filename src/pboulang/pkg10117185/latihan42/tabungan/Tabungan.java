/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan42.tabungan;

/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Menghitung sisa pengambilan saldo
 */
public class Tabungan {
    //Atribute
    int saldo;
    
    //Function
    
    Tabungan(int adaSaldo){
       saldo = adaSaldo;
    }
    void cekSaldo (){
        
        System.out.println("Saldo Anda Sekarang : "+ saldo);
    }
    int ambilUang(int jumlah){
        saldo = saldo - jumlah;
    return saldo;
    
    }
}
