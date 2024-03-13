package tugasPraktikum;

import java.util.Scanner;

public class perpustakaan2 {
    public static void main(String[] args) {
        Buku2 buku = new Buku2();
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Pilih kategori buku:");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi");
        
        System.out.print("Masukkan nomor kategori buku yang diinginkan: ");
        int kategori = scn.nextInt();
        
        if (kategori >= 1 && kategori <= 7) {
            switch(kategori) {
                case 1:
                    printBuku(buku.teknologi);
                    hitungJumlahKata(buku.teknologi);
                    break;
                case 2:
                    printBuku(buku.filsafat);
                    hitungJumlahKata(buku.filsafat);
                    break;
                case 3:
                    printBuku(buku.sejarah);
                    hitungJumlahKata(buku.sejarah);
                    break;
                case 4:
                    printBuku(buku.agama);
                    hitungJumlahKata(buku.agama);
                    break;
                case 5:
                    printBuku(buku.psikologi);
                    hitungJumlahKata(buku.psikologi);
                    break;
                case 6:
                    printBuku(buku.politik);
                    hitungJumlahKata(buku.politik);
                    break;
                case 7:
                    printBuku(buku.fiksi);
                    hitungJumlahKata(buku.fiksi);
                    break;
            }
        } else {
            System.out.println("Kategori buku tidak valid.");
        }    
        scn.close();
    }

    public static void printBuku(String[][] kategoriBuku) {
        for (String[] buku : kategoriBuku) {
            System.out.println("Judul: " + buku[0]);
            System.out.println("Penulis: " + buku[1]);
            System.out.println("Tahun Terbit: " + buku[2]);
            System.out.println("Jumlah Halaman: " + buku[3]);
            System.out.println("Sinopsis: " + buku[4]);
            System.out.println();
        }
    }

    public static void hitungJumlahKata(String[][] kategoriBuku) {
        for (String[] buku : kategoriBuku) {
            String sinopsis = buku[4];
            sinopsis = sinopsis.trim();
            String[] kata = sinopsis.split("\\s+");
            System.out.println("Judul: " + buku[0] + " - Jumlah kata pada sinopsis: " + kata.length);
        }
    }

}




