

package sporcukartoyunu;



public class Futbolcu extends Sporcu {
    private int penalti;
    private int kaleciylekarsikarsiya;
    private int serbestVurus;
    boolean kartKullanildiMi;

    public Futbolcu(int penalti, int kaleciylekarsikarsiya, int serbestVurus) {
        this.penalti = penalti;
        this.kaleciylekarsikarsiya = kaleciylekarsikarsiya;
        this.serbestVurus = serbestVurus;

    }
    
    public Futbolcu(){
    }
    ;

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getKaleciylekarsikarsiya() {
        return kaleciylekarsikarsiya;
    }

    public void setKaleciylekarsikarsiya(int kaleciylekarsikarsiya) {
        this.kaleciylekarsikarsiya = kaleciylekarsikarsiya;
    }

    public int getSerbestVurus() {
        return serbestVurus;
    }

    public void setSerbestVurus(int serbestVurus) {
        this.serbestVurus = serbestVurus;
    }
      public Futbolcu(String futbolcuIsim,String futbolcuTakim){
        super(futbolcuIsim,futbolcuTakim);
    }
    
    
    @Override
    public void sporcuPuaniGoster(){
        
    
    }
    
}
