
package sporcukartoyunu;


public class Basketbolcu extends Sporcu{
    private int ikilik;
    private int üclük;
    private int serbestAtis;
    boolean kartKullanildiMi;

    public Basketbolcu(int ikilik, int üclük, int serbestAtis) {
        this.ikilik = ikilik;
        this.üclük = üclük;
        this.serbestAtis = serbestAtis;

    }

    public Basketbolcu() {
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getÜclük() {
        return üclük;
    }

    public void setÜclük(int üclük) {
        this.üclük = üclük;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    @Override
    public void sporcuPuaniGoster() {

    }

    
}
