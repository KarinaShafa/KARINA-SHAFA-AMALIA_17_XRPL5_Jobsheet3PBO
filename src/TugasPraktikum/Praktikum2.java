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
public class Praktikum2 extends Praktikum {
    private String walas;
    
    public Praktikum2 (String walas, String namaGuru, String mapel){
        super(namaGuru ,  mapel);
        this.walas = walas;
    }
    public void data(){
        System.out.println("wali Kelas : "+this.walas);
        super.data();
    }
        
    }
