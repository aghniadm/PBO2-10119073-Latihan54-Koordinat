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

public class WarnaKoordinat extends Koordinat {
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
        super(x, y);
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna(){
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
}
