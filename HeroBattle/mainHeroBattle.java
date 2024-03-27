package HeroBattle;

import java.util.Scanner;

public class mainHeroBattle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        heroBattle hero1 = new heroBattle(null, 0.0, 0.0, 0.0);

        System.out.println("Permainan adu hero \n" + "Player 1 : Silakan masukkan hero Anda! \n" + "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500! \n" + "===================================");

        System.out.print("Nama hero     : ");
        hero1.setName(scn.nextLine());
        System.out.print("Health Point  : ");
        hero1.setHp(getValidNumber(scn));
        System.out.print("Attack        : ");
        hero1.setAttack(getValidNumber(scn));
        System.out.print("Defense       : ");
        hero1.setDefense(getValidNumber(scn));

        heroBattle hero2 = new heroBattle();

        System.out.println("----------------------------------- \n" + "Player 2 : Silakan masukkan hero Anda! \n" + "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500! \n" + "===================================");

        System.out.print("Nama hero     : "); 
        hero2.setName(scn.nextLine());
        System.out.print("Health Point  : ");
        hero2.setHp(getValidNumber(scn));
        System.out.print("Attack        : ");
        hero2.setAttack(getValidNumber(scn));
        System.out.print("Defense       : ");
        hero2.setDefense(getValidNumber(scn));

        int ronde = 0;
        do {
            ronde++;
            System.out.println("=================================== \n" + "===================================");
            System.out.println("Ronde ke-" + ronde);
            System.out.println(hero1.getName() + " menyerang " + hero2.getName());
            System.out.println();
            
            hero1.attackPower(hero2);
            System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack());
            System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
            System.out.println("Health " + hero2.getName() + " saat ini " + hero2.getHp());
        
            System.out.println("=================================== \n" + "===================================");
        
            if (hero1.getHp() <= 0) {
                System.out.println(hero1.getName() + " telah kalah! \n" + hero2.getName() + " adalah pemenangnya!");;
                break;
            } else if (hero2.getHp() <= 0) {
                System.out.println(hero2.getName() + " telah kalah! \n" + hero1.getName() + " adalah pemenangnya!");
                break;
            }
        
            System.out.println(hero2.getName() + " menyerang " + hero1.getName());
            System.out.println();
        
            hero2.attackPower(hero1);
            System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack());
            System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
            System.out.println("Health " + hero1.getName() + " saat ini " + hero1.getHp());
            System.out.println();
        
            if (hero1.getHp() <= 0) {
                System.out.println("Pertarungan telah usai! \n" + hero1.getName() + " telah kalah! \n" + hero2.getName() + " adalah pemenangnya!");
                break;
            } else if (hero2.getHp() <= 0){
                System.out.println("Pertarungan telah usai! \n" + hero2.getName() + " telah kalah! \n" + hero1.getName() + " adalah pemenangnya!");
                break;
            }
        } while (hero1.getHp() > 0 && hero2.getHp() > 0);
        
        scn.close();
    }

    public static double getValidNumber(Scanner scn) {
        double number;
        while (true) {
            if (scn.hasNextDouble()) {
                number = scn.nextDouble();
                if (number >= 0 && number <= 500) {
                    break;
                } else {
                    System.out.println("Angka harus berada dalam rentang 0 hingga 500. Masukkan angka lagi.");
                    System.out.print("              : ");
                }
            } else {
                System.out.println("Masukkan angka yang valid.");
                System.out.print("              : ");
                scn.nextLine(); 
            }
        }
        scn.nextLine();
        return number;
    }
}
