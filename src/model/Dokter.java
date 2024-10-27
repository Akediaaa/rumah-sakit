package model;

public class Dokter {
    private String nama;
    private String spesialis;
    private String jadwal;

    public Dokter(String nama, String spesialis, String jadwal) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.jadwal = jadwal;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getspesialis() {
        return spesialis;
    }

    public void setspesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getjadwal() {
        return jadwal;
    }

    public void setjadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public void tampilkaninfodokter() {
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialis);
        System.out.println("Jadwal: " + jadwal);
    }
}
