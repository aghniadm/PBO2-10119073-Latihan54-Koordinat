package pbo2.pkg10119073.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan koordinat
 * dengan konsep pewarisan class
 *
 */

public class PBO210119073Latihan54Koordinat {

    public static void main(String[] args) {
        WarnaKoordinat warna = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warna.getX()+", y : "+warna.getY());
    }
    
}
