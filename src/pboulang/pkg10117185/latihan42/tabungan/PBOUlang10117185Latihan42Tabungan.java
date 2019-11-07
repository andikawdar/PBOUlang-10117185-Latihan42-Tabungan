/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan42.tabungan;
import java.util.Scanner;

/**
 *
 * @author user
 * Nama : Andhyka Widariyanto
 * NIM  : 10117185
 * Kelas: PBO-Ulang
 * Tugas: Menghitung sisa pengambilan saldo
 */
public class PBOUlang10117185Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner inputer = new Scanner(System.in);
        

        System.out.println("====Program Penarikan Uang====");
        
        System.out.print("Masukan Saldo Awal : " );
        
        int jmh_tabungan = inputer.nextInt();
        
        Tabungan tabungan = new Tabungan(jmh_tabungan);
                
        System.out.print("Jumlah uang yang diambil : ");
       
        int jmlh_diambil = inputer.nextInt();
        
        tabungan.ambilUang(jmlh_diambil);
        tabungan.cekSaldo();
    }
    
}
