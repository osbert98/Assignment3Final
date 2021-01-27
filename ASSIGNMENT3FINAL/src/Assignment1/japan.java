package Assignment1;

import java.util.Scanner;



public class japan extends parentclass {
	
	public void display() {
	    //polymorphism
	  }
	
	
	
		
		String placename,	season;
	    String price;
	    private String available;
	    
	    japan(){
	        this.placename="Japan";
	        this.season="Cherry Blossom Season";
	     
	    }
	 
	    public void printPlace(){
	    	
	        japan a = new japan();
	        System.out.println("");
	        System.out.println("Amazing place we have in promo: "+a.placename);
	    }
	    public void printSeason(){
	    	japan a = new japan();
	        System.out.println("Season of the month is : "+a.season);
	    }

	    
	    public void printAvailable(String date){
	        available=date;
	    }
	    public String getAvailable(){
	        return available;
	    }
	    public void setPrice(String newPrice){
	        price=newPrice;
	    }
	    public String getPrice(){
	        return price;
	    }
	    

					
			    
	    public void checkPromo(){
	        Scanner scan1=new Scanner(System.in);
	        try{
	            System.out.println("Type to check Promo place availability: ");
	            String place=scan1.next();
	            System.out.println("Choosen promo places: "+place);
	            System.out.println("");
	            
	        } catch(Exception e){
	            System.out.println("Something went wrong! place is not available");
	        }
	       
	        
	    }
	   
	    static void money(int money) {
		    if (money < 4500) {
		      throw new ArithmeticException("You cannot afford this package.");
		    }
		    else {
			      System.out.println("You can continue to purchase this package");
		    }
		  }

	}



