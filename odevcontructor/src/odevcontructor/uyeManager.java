package odevcontructor;

public class uyeManager {
	
	
	 public void uyeYazdir (uye ogrenci)
	 {   
		 System.out.println("�ye Ad�: "+ ogrenci.uyeAdi);
		 System.out.println("�ye Numarasi :"+ ogrenci.uye�d);
		 System.out.println("�yenin kay�tl� oldugu kurs: "+ ogrenci.uyekurs.kursAdi);
	 } 
		 
		 
		 public void uyeKursKayit(uye ogrenci,Kurs kurs)
		 {   
			 ogrenci.uyekurs=kurs;
			 System.out.println("Uye,kursa kay�t edildi.");
		 }
		 
		 
		 
		 
	 }


