package tugaspbo;

import java.util.Scanner;   

public class ClassManusia {
    Scanner in = new Scanner(System.in);
    String Nama, Alamat, TempatTanggalLahir, TinggiBadan, BeratBadan, BentukMuka, Hobi;
    void Identitas(){
        System.out.print("Nama \t:   ");
        Nama = in.next();
        System.out.print("Alamat \t:   ");
        Alamat = in.next();
        System.out.print("Tempat Tanggal Lahir \t:   ");
        TempatTanggalLahir = in.next();
        System.out.print("Hobi Sehari-hari \t:   ");
        Hobi = in.next();
    }
    protected void CiriFisik(){
        System.out.print("Tinggi Badan (CM) \t: ");
        TinggiBadan = in.next();
        System.out.print("Berat Badan (KG) \t:  ");
        TinggiBadan = in.next();
        System.out.print("Bentuk Muka \t:  ");
        BentukMuka = in.next();
    } 
}