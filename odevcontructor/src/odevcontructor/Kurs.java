package odevcontructor;

public class Kurs {
	
	int kurs�d;
	String kursAdi;
	String kursEgitmen;
	
	public Kurs()
	{
		System.out.println("Kurs Olu�turuldu.");
		
	}
	public Kurs(String kursad, int kursid, String kursegitmen)
	{   
		this.kursAdi=kursad;
	    this.kursEgitmen=kursegitmen;
	    this.kurs�d=kursid;
	    
	    
		System.out.println("Kurs Olu�turuldu :"+ kursad);
	}
		
		
   
}
