package Tugas_Inheritance;
import java.time.LocalDate;

public class Manager extends Pekerja{
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, jenisKelamin, nik, menikah);
        this.departemen = departemen;
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * super.getGaji()); 
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen : " + departemen;
    }
}

