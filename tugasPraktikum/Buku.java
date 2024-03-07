package tugasPraktikum;

public class Buku {
    private String kategoriBuku;
    private String judulBuku;
    private String penulisBuku;
    private String tahunTerbit;

    public void setKategoriBuku(String kategori) {
        kategoriBuku = kategori;
    }

    public void setJudulBuku(String judul) {
        judulBuku = judul;
    }

    public void setPenulisBuku(String penulis) {
        penulisBuku = penulis;
    }

    public void setTahunTerbit(String tahun) {
        tahunTerbit = tahun;
    }

    public String getKategoriBuku() {
        return kategoriBuku;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judulBuku);
        System.out.println("Penulis: " + penulisBuku);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println();
    }
}




