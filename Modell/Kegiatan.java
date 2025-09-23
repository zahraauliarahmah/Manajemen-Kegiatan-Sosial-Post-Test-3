/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Kegiatan {
    private String nama;
    private String tanggal;
    private String lokasi;
    private String penyelenggara;

    public Kegiatan(String nama, String tanggal, String lokasi, String penyelenggara) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.penyelenggara = penyelenggara;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public String getPenyelenggara() { return penyelenggara; }
    public void setPenyelenggara(String penyelenggara) { this.penyelenggara = penyelenggara; }

    public String getJenisKegiatan() { return "KEGIATAN UMUM"; }
    public String getDeskripsiKhusus() { return "Kegiatan umum"; }

    @Override
    public String toString() {
        return String.format("=== %s ===\nNama: %s\nTanggal: %s\nLokasi: %s\nPenyelenggara: %s\n%s",
                getJenisKegiatan(), nama, tanggal, lokasi, penyelenggara, getDeskripsiKhusus());
    }

    public String getInfoKegiatan() {
        return "Kegiatan " + nama + " di " + lokasi;
    }
}