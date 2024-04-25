package Tugas_Inheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }

    public String getNama(){
        return nama;
    }

    public boolean getJenisKelamin(){
        return jenisKelamin;
    }

    public String getNik(){
        return nik;
    }

    public Boolean getMenikah(){
        return menikah;
    }

    public double getTunjangan(){
        if ( menikah == true && jenisKelamin == true ){
            return 25.0;
        } else if ( menikah == true && jenisKelamin == false ){
            return 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "Nama : " + nama + "\nNik : " + nik + "\nJenisKelamin : " + 
               (jenisKelamin ? "Laki-laki" : "Perempuan") + 
               "\nPendapatan : " + getPendapatan();
    }
}

    
