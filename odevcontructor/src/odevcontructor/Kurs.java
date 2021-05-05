package odevcontructor;

public class Kurs {
	
	int kursİd;
	String kursAdi;
	String kursEgitmen;
	
	public Kurs()
	{
		System.out.println("Kurs Oluşturuldu.");
		
	}
	public Kurs(String kursad, int kursid, String kursegitmen)
	{   
		this.kursAdi=kursad;
	    this.kursEgitmen=kursegitmen;
	    this.kursİd=kursid;
	    
	    
		System.out.println("Kurs Oluşturuldu :"+ kursad);
	}
		
		
   
}
