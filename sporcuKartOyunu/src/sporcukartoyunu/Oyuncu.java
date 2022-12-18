
package sporcukartoyunu;

import java.util.ArrayList;


public abstract class Oyuncu {
    
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;
     ArrayList<Basketbolcu> liste1=new ArrayList<Basketbolcu>();
     ArrayList<Futbolcu> liste2=new ArrayList<Futbolcu>();
    

    public Oyuncu(String oyuncuAdi,int oyuncuID ,int skor){
    this.oyuncuAdi=oyuncuAdi;
    this.oyuncuID=oyuncuID;
    this.skor=skor;
    
    }
    public Oyuncu(){
     this.skor=0;
    
    }
    
    public int getOyuncuID() {
        return oyuncuID;
    }
    
    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }
   
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }
  
    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    
    public void puanEkle(){
    this.skor +=10;
    }

       abstract void KartSec1(ArrayList<Basketbolcu> list,int x,int y,int z,int t);
       abstract void KartSec2(ArrayList<Futbolcu> list,int x,int y,int z,int t);
    
}
