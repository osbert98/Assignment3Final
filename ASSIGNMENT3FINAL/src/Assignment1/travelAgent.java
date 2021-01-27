package Assignment1;

import java.util.ArrayList;

public class travelAgent extends parentclass {

	public static void main(String[] args) {
		
		System.out.println("THANK YOU FOR CHOOSING OUR TRAVEL AGENCY");
		System.out.println("");
 
		listofpromo obj=new listofpromo();
	        obj.places();
	        
	        System.out.println("Places that are unavailable now");
	        ArrayList<String> place = new ArrayList<String>();
	        place.add("1. China");
	        place.add("2. South Korea");
	        place.add("3. Brazil");
	        
	        for (int i = 0; i < place.size(); i++) {
	          System.out.println(place.get(i));
	        }
		japan j = new japan();
		california c = new california();
		
		
		
		
		c.printPlace();
		c.printSeason();
		c.setPrice("RM3000");
		
		c.date();
		c.printTrans();
		c.money(4500);
		
		
		
		
		
		
		System.out.println("The price for the promo is "+c.getPrice());
		c.display();


		j.checkPromo();
		j.printPlace();
		j.printSeason();
		j.printAvailable("July 2021");
		j.setPrice("RM4500");
		j.printTrans();
		j.money(10000);
		
		
		
		
		System.out.println("The available date for booking is: "+j.getAvailable());
		System.out.println("The price for the promo is "+j.getPrice());
		j.display();

		

		

		
	
	

}
}

