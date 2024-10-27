package model;

public class pasien {
    private String nama;
    private int umur;
    private String noRekamMedis;

    public pasien(String nama, int umur, String noRekamMedis) {
        this.nama = nama;
        this.umur = umur;
        this.noRekamMedis = noRekamMedis;
    }

    public pasien(String string) {

    }

    public String getnama() {
        return this.nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public int getumur() {
        return this.umur;
    }

    public void setumur(int umur) {
        this.umur = umur;
    }

    public String getoRekamMedis() {
        return this.noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public void tampilkaninfopasien() {
        System.out.println("nama: " + nama);
        System.out.println("umur: " + umur);
        System.out.println("No. Rekam Medis: " + noRekamMedis);
    }
}
