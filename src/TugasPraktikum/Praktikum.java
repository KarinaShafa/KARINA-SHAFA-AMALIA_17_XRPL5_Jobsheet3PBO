/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
public class Praktikum {
  private String namaGuru;  
  private String mapel;
  
  public Praktikum(String namaGuru, String mapel){
      this.namaGuru = namaGuru;
      this.mapel = mapel;
  }
  public void data(){
      System.out.println("Nama Guru : "+this.namaGuru);
      System.out.println("Pengajar Mapel : "+this.mapel);
  }
}
