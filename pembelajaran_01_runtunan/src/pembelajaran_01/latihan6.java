package pembelajaran_01;
import java.util.Scanner;

public class latihan6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama lengkap : ");
        String nama = in.nextLine();

        // semua huruf vokal (besar/kecil) diganti X
        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");
        System.out.println(nama + " => " + hasil);
        in.close();
    }
}


