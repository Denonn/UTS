package sesi6.bangun_ruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("MENGHITUNG VOLUME BANGUN RUANG");
                System.out.println("1. KERUCUT");
                System.out.println("2. BALOK");
                System.out.println("3. KELUAR");

                System.out.print("PILIH : ");
                int pilih = input.nextInt();

                if (pilih == 1) {
                    System.out.println("\nMENGHITUNG VOLUME KERUCUT");
                    System.out.print("\nMasukan jari-jari : ");
                    double jari2 = input.nextDouble();

                    System.out.print("Masukan tinggi : ");
                    double tinggi = input.nextDouble();

                    Kerucut k1 = new Kerucut();
                    k1.setJari2(jari2);
                    k1.setTinggi(tinggi);
                    System.out.println("\nVOLUMENYA ADALAH : "+ k1.getVolume());
                } else if (pilih == 2) {
                    System.out.println("\nmenghitung volume balok".toUpperCase());
                    System.out.print("\nMasukan Panjang : ");
                    int Panjang = input.nextInt();

                    System.out.print("Masukan Lebar : ");
                    int Lebar = input.nextInt();

                    System.out.print("Masukan Tinggi : ");
                    int Tinggi = input.nextInt();

                    Balok b1 = new Balok();
                    b1.setPanjang(Panjang);
                    b1.setLebar(Lebar);
                    b1.setTinggi(Tinggi);
                    System.out.println("\nVOLUMENYA ADALAH : " + b1.getVolume());
                } else if (pilih == 3) {
                    System.out.println("\nANDA BERHASIL KELUAR\n");
                    break;
                } else {
                    System.out.println("\nangka yg anda masukan salah\n".toUpperCase());
                }
            }
        }
    }
}
