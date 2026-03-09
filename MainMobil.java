import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Mobil m1 = new Mobil();

        System.out.print("Masukkan Manufaktur Mobil: ");
        String manufaktur = input.nextLine();

        System.out.print("Masukkan Nomor Plat: ");
        String noPlat = input.nextLine();

        System.out.print("Masukkan Warna Mobil: ");
        String warna = input.nextLine();

        System.out.print("Masukkan Kecepatan (km/h): ");
        int kecepatan = input.nextInt();

        System.out.print("Masukkan Waktu Tempuh (jam): ");
        double waktu = input.nextDouble();

        m1.setManufaktur(manufaktur);
        m1.setNoPlat(noPlat);
        m1.setWarna(warna);
        m1.setKecepatan(kecepatan);
        m1.setWaktu(waktu);

        System.out.println("====================");
        m1.displayMessage();

    }
}