package main;

import model.Dokter;
import model.pasien;

public class App {
    public static void main(String[] args) {
        pasien pasien1 = new pasien("Sandy", 19, "A001");
        System.out.println("Informasi Pasien: ");
        pasien1.tampilkaninfopasien();

        Dokter dokter1 = new Dokter("Ari", "Kaki", "Senin");
        System.out.println("Informasi Dokter: ");
        dokter1.tampilkaninfodokter();
    }
}