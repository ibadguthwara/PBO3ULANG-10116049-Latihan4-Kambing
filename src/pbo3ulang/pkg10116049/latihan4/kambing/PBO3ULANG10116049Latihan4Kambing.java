/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan4.kambing;

/**
 *
 * @author ibadguthwara
 * NAMA 	     : M. Ibad Guthwara
 * KELAS	     : PBO 3 ULANG
 * NIM		     : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi program untuk pengaksesan variabel lokal
 */
public class PBO3ULANG10116049Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    public void tambahKambing(){
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO3ULANG10116049Latihan4Kambing kambingJantan = new PBO3ULANG10116049Latihan4Kambing();
        kambingJantan.tambahKambing();
        
    }
    
}
