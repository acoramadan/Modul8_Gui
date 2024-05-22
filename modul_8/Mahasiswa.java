/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_8;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    public int id;
    private String nama;
    private long stb;
    private String kelas;
    Mahasiswa(){}
    Mahasiswa(String nama,long stb,String kelas){
        this.nama = nama;
        this.stb = stb;
        this.kelas = kelas;
    }
    public String getNama(){
        return nama;
    }
    public long getStb(){
        return stb;
    }
    public String getKelas(){
        return kelas;
    }
    public int getId(){
        return id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setStb(long stb){
        this.stb = stb;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void setID(int id){
        this.id = id;
    }
    
}
