package tugaspbo;

import java.util.Scanner;

public class TugasPBO {
   
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);   
      ClassMillenial kini = new ClassMillenial();
      ClassJadul dulu = new ClassJadul();
      String kelas;
        System.out.println("Masukkan Class Anda : ");
        kelas = in.next();
        switch (kelas){
            case "Millenial":
            kini.Identitas();
            kini.CiriFisik();
            kini.Jenis(); 
      break;
            case "Jadul":
            dulu.Identitas();
            dulu.CiriFisik();
            dulu.Jenis();
      break;
            default:
                System.out.println("Salah !!! ");
        }
    }
    
}
