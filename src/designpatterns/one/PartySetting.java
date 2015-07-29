package designpatterns.one;

import java.util.Scanner;

class Base {
	// base price variables
	private int baseChairPrice;
	private int basePlaceSettingPrice;
	private int baseCenterPiecePrice;
	
	// constructor setting the base prices
	Base() {
		System.out.println("Base prices for Chair:50, Place-Setting:40, Center-Piece:30");	
		baseChairPrice = 50;
		basePlaceSettingPrice = 40;
		baseCenterPiecePrice = 30;
	}

	public int getBaseChairPrice() {
		return baseChairPrice;
	}

	public void setBaseChairPrice(int baseChairPrice) {
		this.baseChairPrice = baseChairPrice;
	}

	public int getBasePlaceSettingPrice() {
		return basePlaceSettingPrice;
	}

	public void setBasePlaceSettingPrice(int basePlaceSettingPrice) {
		this.basePlaceSettingPrice = basePlaceSettingPrice;
	}

	public int getBaseCenterPiecePrice() {
		return baseCenterPiecePrice;
	}

	public void setBaseCenterPiecePrice(int baseCenterPiecePrice) {
		this.baseCenterPiecePrice = baseCenterPiecePrice;
	}
	
}

class Vintage extends Base {
	// vintage setting price variables
	private int chairPrice;
	private int placeSettingPrice;
	private int centerPiecePrice;
	
	// no of chairs per table
	private int noOfChairs;
	
	// constructor setting the prices for Vintage setting
	Vintage() {
		System.out.println("Vintage prices for Chair:50, Place-Setting:40, Center-Piece:35\n");	
		chairPrice = 50;
		placeSettingPrice = 40;
		centerPiecePrice = 35;
		noOfChairs= 4;
	}
	
	public int getChairPrice() {
		return chairPrice;
	}

	public void setChairPrice(int chairPrice) {
		this.chairPrice = chairPrice;
	}

	public int getPlaceSettingPrice() {
		return placeSettingPrice;
	}

	public void setPlaceSettingPrice(int placeSettingPrice) {
		this.placeSettingPrice = placeSettingPrice;
	}

	public int getCenterPiecePrice() {
		return centerPiecePrice;
	}

	public void setCenterPiecePrice(int centerPiecePrice) {
		this.centerPiecePrice = centerPiecePrice;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}
}

class Contemporary extends Base {
	// contemporary setting price variables
	private int chairPrice;
	private int placeSettingPrice;
	private int centerPiecePrice;
	
	// no of chairs per table
	private int noOfChairs;
	
	// constructor setting the prices for Contemporary setting
	Contemporary() {
		System.out.println("Contemporary prices for Chair:20, Place-Setting:20, Center-Piece:25\n");	
		chairPrice = 20;
		placeSettingPrice = 20;
		centerPiecePrice = 25;
		noOfChairs= 4;
	}

	public int getChairPrice() {
		return chairPrice;
	}

	public void setChairPrice(int chairPrice) {
		this.chairPrice = chairPrice;
	}

	public int getPlaceSettingPrice() {
		return placeSettingPrice;
	}

	public void setPlaceSettingPrice(int placeSettingPrice) {
		this.placeSettingPrice = placeSettingPrice;
	}

	public int getCenterPiecePrice() {
		return centerPiecePrice;
	}

	public void setCenterPiecePrice(int centerPiecePrice) {
		this.centerPiecePrice = centerPiecePrice;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}
}

class Modern extends Base {
	// modern setting price variables
	private int chairPrice;
	private int placeSettingPrice;
	private int centerPiecePrice;
	
	// no of chairs per table
	private int noOfChairs;
	
	// constructor setting the prices for Modern setting
	Modern() {
		System.out.println("Modern prices for Chair:100, Place-Setting:30, Center-Piece:40\n");	
		chairPrice = 100;
		placeSettingPrice = 30;
		centerPiecePrice = 40;
		noOfChairs= 4;
	}

	public int getChairPrice() {
		return chairPrice;
	}

	public void setChairPrice(int chairPrice) {
		this.chairPrice = chairPrice;
	}

	public int getPlaceSettingPrice() {
		return placeSettingPrice;
	}

	public void setPlaceSettingPrice(int placeSettingPrice) {
		this.placeSettingPrice = placeSettingPrice;
	}

	public int getCenterPiecePrice() {
		return centerPiecePrice;
	}

	public void setCenterPiecePrice(int centerPiecePrice) {
		this.centerPiecePrice = centerPiecePrice;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}
}

public class PartySetting {
	private static int noOfTables;
	private static String[] tables;
	private Vintage vintage;
	private Contemporary contemporary;
	private Modern modern;
	
	PartySetting() {
		System.out.println("\nHere is your party setting!!!\n");	
		vintage = new Vintage();
		contemporary = new Contemporary();
		modern = new Modern();
	}
		
	int calculateCost() {
		int totalPrice;
		int totalchairPrice=0;
		int totalplaceSettingPrice=0;
		int totalcenterPrice=0;
		
		// iterating through the tables array and calculating total prices
		for(int j=0; j<noOfTables; j++) {
			switch(tables[j]) {
				case "Vintage":
					totalchairPrice += vintage.getNoOfChairs()*vintage.getBaseChairPrice() + vintage.getNoOfChairs()*vintage.getChairPrice();
					totalplaceSettingPrice += vintage.getNoOfChairs()*vintage.getBasePlaceSettingPrice() + vintage.getNoOfChairs()*vintage.getPlaceSettingPrice();
					totalcenterPrice += vintage.getBaseCenterPiecePrice() + vintage.getCenterPiecePrice();
					break;
				case "Contemporary":
					totalchairPrice += contemporary.getNoOfChairs()*contemporary.getBaseChairPrice() +contemporary.getNoOfChairs()* contemporary.getChairPrice();
					totalplaceSettingPrice += contemporary.getNoOfChairs()*contemporary.getBasePlaceSettingPrice() + contemporary.getNoOfChairs()*contemporary.getPlaceSettingPrice();
					totalcenterPrice += contemporary.getBaseCenterPiecePrice() + contemporary.getCenterPiecePrice();
					break;
				case "Modern":
					totalchairPrice += modern.getNoOfChairs()*modern.getBaseChairPrice() + modern.getNoOfChairs()*modern.getChairPrice();
					totalplaceSettingPrice += modern.getNoOfChairs()*modern.getBasePlaceSettingPrice() + modern.getNoOfChairs()*modern.getPlaceSettingPrice();
					totalcenterPrice += modern.getBaseCenterPiecePrice() + modern.getCenterPiecePrice();
					break;
			}
		}
		
		totalPrice = totalchairPrice + totalplaceSettingPrice + totalcenterPrice; 
		
		return totalPrice;	
	}
	
	void displayPartySetting(){
		// displaying the no of tables
		System.out.println("Total number of tables: " + noOfTables + "\n");
		
		// displaying what each table consists
		for(int k=0;k<noOfTables;k++) {
			System.out.print("Table " + (k+1) + " consists of 1 center-piece,  ");
			if(tables[k] == "Vintage") {
				System.out.print(vintage.getNoOfChairs());
			}
			else if(tables[k] == "Contemporary") {
				System.out.print(vintage.getNoOfChairs());
			}
			else if(tables[k] == "Modern") {
				System.out.print(vintage.getNoOfChairs());
			}
			System.out.println(" chairs, 4 place-settings(plates, silver sets, napkins) of " + tables[k] + " style");
		}
		
	}
	
	public static void main(String[] args) {	
		int i = 0;
		System.out.println("Welcome to Party Orders");
		System.out.println("Type of Settings");
		System.out.println("1. Vintage");
		System.out.println("2. Contemporary");
		System.out.println("3. Modern");
		System.out.println("Enter the no of tables for each table setting in the above order: ");
		Scanner scn = new Scanner(System.in);
		// user input for each of the 3 styles 
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		scn.close();
		
		// calculating total no of tables from user inputs
		noOfTables = num1 + num2 +num3;
		
		// array of table styles
		tables = new String[noOfTables];
		
		// Populating the tables array with the user input of the table settings.
		while(num1>0) {
			tables[i] = "Vintage";
			i++;
			num1--;
		}
		
		while(num2>0) {
			tables[i] = "Contemporary";
			i++;
			num2--;
		}
		
		while(num3>0) {
			tables[i] = "Modern";
			i++;
			num3--;
		}
		
		PartySetting partySetting = new PartySetting();
		
		System.out.println("\nTotal price of your order: " + partySetting.calculateCost());
		partySetting.displayPartySetting();
	}

}
