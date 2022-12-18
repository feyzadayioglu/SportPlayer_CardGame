
package sporcukartoyunu;

import java.util.ArrayList;
import java.util.List;

public class InsanOyuncusu extends Oyuncu {
    public List<Sporcu> kartlar = new ArrayList<>();

    public InsanOyuncusu(String oyuncuAdi, int oyuncuID, int skor) {
        super(oyuncuAdi, oyuncuID, skor);
    }

    public InsanOyuncusu() {
    }

    @Override
    void KartSec1(ArrayList<Basketbolcu> list, int x, int y, int z,int t) {
        
    }
    void KartSec2(ArrayList<Futbolcu> list,int x ,int y,int z,int t) {
        
    }
    
}
