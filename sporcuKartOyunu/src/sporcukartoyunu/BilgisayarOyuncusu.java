
package sporcukartoyunu;
import java.util.ArrayList;
import java.util.List;

public class BilgisayarOyuncusu extends Oyuncu {
    private int x=0,y=0,z=0,t=0;
       public List<Sporcu> kartlar = new ArrayList<>();
    
    public BilgisayarOyuncusu(String oyuncuAdi,int oyuncuID,int skor){
        super(oyuncuAdi,oyuncuID,skor);
    
    }
    
    public BilgisayarOyuncusu(){
    }

    @Override
   void KartSec1(ArrayList<Basketbolcu> list,int x ,int y,int z,int t) {
       this.liste1.add(list.get(x));
       this.liste1.add(list.get(y));
       this.liste1.add(list.get(z));
       this.liste1.add(list.get(t));
    }
   void KartSec2(ArrayList<Futbolcu> list,int x ,int y,int z,int t) {
       this.liste2.add(list.get(x));
       this.liste2.add(list.get(y));
       this.liste2.add(list.get(z));
       this.liste2.add(list.get(t));
    }
   
}
