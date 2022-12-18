
package sporcukartoyunu;


public class Sporcu {
    private String Sporcuisim;
    private String SporcuTakim;
    public boolean kartKullanildiMi;
     
    public Sporcu(String Sporcuisim,String SporcuTakim){
        this.Sporcuisim=Sporcuisim;
        this.SporcuTakim=SporcuTakim;
        kartKullanildiMi = false;
    }
    public Sporcu(){
    
    }
    ;
   
    public String getSporcuIsim() {
        return Sporcuisim;
    }

   
    public void setSporcuIsim(String SporcuIsim) {
        this.Sporcuisim = SporcuIsim;
    }

    
    public String getSporcuTakim() {
        return SporcuTakim;
    }

    
    public void setSporcuTakim(String SporcuTakim) {
        this.SporcuTakim = SporcuTakim;
    }
    public void kullan()
	{
		this.kartKullanildiMi = true;
	}

   public void sporcuPuaniGoster() {
   }
}
