package odevcontructor;

public class Main {

	public static void main(String[] args) {
		
        
		Kurs kurs1=new Kurs();
		kurs1.kursAdi="Java & React Kamp";
		kurs1.kursEgitmen="Engin DEM�RO�";
		kurs1.kurs�d=1;
		
		
		uye ogrenci1=new uye(61,"Zeynep AKT�RK");
		
	    uyeManager uyeManager=new uyeManager();
	    uyeManager.uyeKursKayit(ogrenci1, kurs1);
	    uyeManager.uyeYazdir(ogrenci1);
	    KursManager kursManager=new KursManager();
	    kursManager.KursYazdir(kurs1);
	    
	  
	    
	    
	    
		
		
		
	
		
		
		
		
		
		

	}

}
