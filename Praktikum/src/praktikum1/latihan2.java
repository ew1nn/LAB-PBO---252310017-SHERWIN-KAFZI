package praktikum1;

public class latihan2 {
	import java.util.Scanner;

	public class latihan2 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        final long hargaTanah = 5000000; // harga per m^2

	        System.out.print("Masukkan luas tanah (m^2): ");
	        double luas = input.nextDouble();

	        double hargaTotal = hargaTanah * luas;

	        System.out.printf("Harga total tanah: Rp. %.0f%n", hargaTotal);

	        input.close();
	    }
	}
}
