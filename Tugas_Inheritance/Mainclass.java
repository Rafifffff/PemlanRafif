package Tugas_Inheritance;
import java.time.LocalDate;

public class Mainclass {

    public static void main(String[] args) {
        Manusia lakilakiMenikah = new Manusia("Budi", true, "123456", true);
        System.out.println(lakilakiMenikah);
        System.out.println();

        Manusia perempuanMenikah = new Manusia("nisa", false, "654321", true);
        System.out.println(perempuanMenikah);
        System.out.println();

        Manusia belummenikah = new Manusia("amira", false, "377326", false);
        System.out.println(belummenikah);
        System.out.println();

        MahasiswaFILKOM sitiFilkom = new MahasiswaFILKOM("244444422433444", 2.9, "Siti", "3335463", false, false);
        System.out.println(sitiFilkom);
        System.out.println();

        MahasiswaFILKOM budiFilkom = new MahasiswaFILKOM("2444444444", 3.43, "Budi", "3248876", true, false);
        System.out.println(budiFilkom);
        System.out.println();

        MahasiswaFILKOM rafifFilkom = new MahasiswaFILKOM("235150401111038", 3.64, "Rafif", "324", true, false);
        System.out.println(rafifFilkom);
        System.out.println();

        Pekerja duaTahun = new Pekerja(5000, LocalDate.of(2022, 1, 1), 2, "rendi", true, "1234567890123456", true);
        System.out.println(duaTahun);
        System.out.println();

        Pekerja sembilanTahun = new Pekerja(5000, LocalDate.of(2015, 1, 1), 0, "mawar", false, "1866856", true);
        System.out.println(sembilanTahun);
        System.out.println();

        Pekerja duapuluhTahun = new Pekerja(5000, LocalDate.of(2004, 1, 1), 10, "asep", true, "1239809346", true);
        System.out.println(duapuluhTahun);
        System.out.println();

        Manager mimin = new Manager("HRD", 7500, LocalDate.of(2009, 1, 1), 3, "mimin", "111", false, true);
        System.out.println(mimin);
        System.out.println();
        
    }
}
