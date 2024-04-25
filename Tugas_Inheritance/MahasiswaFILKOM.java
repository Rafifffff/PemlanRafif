package Tugas_Inheritance;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setIpk(Double ipk){
        this.ipk = ipk;
    }

    public String getNim(){
        return nim;
    }

    public Double getIpk(){
        return ipk;
    }

    public String getStatus() {
        String prodi = "";
        String angkatan = nim.substring(0, 2);
        char prodiCode = nim.charAt(6);
        
        switch (prodiCode) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
        }
        
        return prodi + ", 20" + angkatan;
    }

    public double getBeasiswa(){
        if ( ipk >= 3.0 && ipk <= 3.5){
            return 50.0;
        } else if ( ipk > 3.5 && ipk <= 4.0){
            return 75.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\nNim : " + nim + "\nIpk : " + ipk + "\nStatus : " + getStatus();
    }
    

}
