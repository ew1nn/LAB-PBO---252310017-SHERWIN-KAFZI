package quiz1;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BukuDiagram {
    public static void main(String[] args) {
        ArrayList<String> daftarBuku = new ArrayList<>();
        String[] menu = {"Input Buku", "Hapus Buku", "Lihat Semua Buku", "Keluar"};
        boolean jalan = true;
        
        

        while (jalan) {
            int pilihan = JOptionPane.showOptionDialog(
                    null,
                    "Pilih menu:",
                    "Data Buku",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    menu,
                    menu[0]);
        }

            switch () {
                case 0: 
                    String judul = JOptionPane.showInputDialog(null,
                            "Masukkan judul buku yang ingin di-input:",
                            "Input Buku", JOptionPane.QUESTION_MESSAGE);
                    if (judul != null && !judul.trim().isEmpty()) {
                        daftarBuku.add(judul.trim());
                        JOptionPane.showMessageDialog(null,
                                "Buku \"" + judul.trim() + "\" berhasil disimpan.");
                    } else if (judul != null) {
                        JOptionPane.showMessageDialog(null,
                                "Judul tidak boleh kosong!", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
            }
            
        }
		
	}