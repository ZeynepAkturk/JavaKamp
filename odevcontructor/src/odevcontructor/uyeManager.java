package odevcontructor;

public class uyeManager {
	
	
	 public void uyeYazdir (uye ogrenci)
	 {   
		 System.out.println("Üye Adı: "+ ogrenci.uyeAdi);
		 System.out.println("Üye Numarasi :"+ ogrenci.uyeİd);
		 System.out.println("Üyenin kayıtlı oldugu kurs: "+ ogrenci.uyekurs.kursAdi);
	 } 
		 
		 
		 public void uyeKursKayit(uye ogrenci,Kurs kurs)
		 {   
			 ogrenci.uyekurs=kurs;
			 System.out.println("Uye,kursa kayıt edildi.");
		 }
		 
		 
		 
		 
	 }


