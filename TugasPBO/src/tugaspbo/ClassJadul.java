package tugaspbo;

public class ClassJadul extends ClassManusia {
    String Jenis;
    void Jenis() {
        System.out.print("Anak Jadul (Yes/No) \t: ");
        Jenis = in.next();
        System.out.print("Asal \t:  ");
        Jenis = in.next();
    }

    @Override
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
