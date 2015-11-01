package dp.two;

import java.util.ArrayList;
import java.util.Scanner;

// Product Interface
interface TableSetting {
	// Factory methods
	public Chair makeChair();
	public PlaceSetting makePlaceSetting();
	public CenterPiece makeCenterPiece();
	
	// Total price of a single table setting
	public int getTotalPrice();
	
	// No of chairs
	public int getNoOfChairs();
}

// Product class implementing the Product interface
class VintageStyle implements TableSetting {
	
	// no of chairs per table
	private int noOfChairs;
	
	// constructor displaying the prices and setting the no of chairs
	VintageStyle() {
		System.out.println("Base prices for Chair:50, Place-Setting:20, Center-Piece:30");
		System.out.println("Vintage prices for Chair:50, Place-Setting:40, Center-Piece:35\n");	
		noOfChairs= 4;
	}
	
	// Factory methods implemented returning its objects
	public Chair makeChair() {
		return new VintageChair();
	}

	public PlaceSetting makePlaceSetting() {
		return new VintagePlaceSetting();
	}

	public CenterPiece makeCenterPiece() {
		return new VintageCenterPiece();
	}
	
	// setter and getter for noOfChairs
	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}
	
	public int getNoOfChairs() {
		return this.noOfChairs;
	}
	
	// Total price of a single table setting of Vintage style
	public int getTotalPrice() {
		int totalChairPrice = noOfChairs*makeChair().getBasePrice() + noOfChairs*makeChair().getPrice();
		int totalPlaceSettingPrice = noOfChairs*makePlaceSetting().getBasePrice() + noOfChairs*makePlaceSetting().getPrice();
		int totalCenterPiecePrice = makeCenterPiece().getBasePrice() + makeCenterPiece().getPrice();
		
		return (totalChairPrice + totalPlaceSettingPrice + totalCenterPiecePrice);
	}
}

//Product class implementing the Product interface
class ContemporaryStyle implements TableSetting {
	
	// no of chairs per table
	private int noOfChairs;
	
	// constructor displaying the prices and setting the no of chairs
	ContemporaryStyle() {
		System.out.println("Base prices for Chair:50, Place-Setting:20, Center-Piece:30");
		System.out.println("Contemporary prices for Chair:20, Place-Setting:20, Center-Piece:25\n");	
		noOfChairs= 4;
	}
	
	// Factory methods implemented returning its objects
	public Chair makeChair() {
		return new ContemporaryChair();
	}

	public PlaceSetting makePlaceSetting() {
		return new ContemporaryPlaceSetting();
	}

	public CenterPiece makeCenterPiece() {
		return new ContemporaryCenterPiece();
	}
	
	// setter and getter for noOfChairs
	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}
	public int getNoOfChairs() {
		return this.noOfChairs;
	}
	
	// Total price of a single table setting of Contemporary style
	public int getTotalPrice() {
		int totalChairPrice = noOfChairs*makeChair().getBasePrice() + noOfChairs*makeChair().getPrice();
		int totalPlaceSettingPrice = noOfChairs*makePlaceSetting().getBasePrice() + noOfChairs*makePlaceSetting().getPrice();
		int totalCenterPiecePrice = makeCenterPiece().getBasePrice() + makeCenterPiece().getPrice();
		
		return (totalChairPrice + totalPlaceSettingPrice + totalCenterPiecePrice);
	}
}

//Product class implementing the Product interface
class ModernStyle implements TableSetting {
	
	// no of chairs per table
	private int noOfChairs;
	
	// constructor displaying the prices and setting the no of chairs
	ModernStyle() {
		System.out.println("Base prices for Chair:50, Place-Setting:20, Center-Piece:30");
		System.out.println("Modern prices for Chair:100, Place-Setting:30, Center-Piece:40\n");	
		noOfChairs= 4;
	}

	// Factory methods implemented returning its objects
	public Chair makeChair() {
		return new ModernChair();
	}

	public PlaceSetting makePlaceSetting() {
		return new ModernPlaceSetting();
	}

	public CenterPiece makeCenterPiece() {
		return new ModernCenterPiece();
	}

	// setter and getter for noOfChairs
	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}
	public int getNoOfChairs() {
		return this.noOfChairs;
	}
	
	// Total price of a single table setting of Modern style
	public int getTotalPrice() {
		int totalChairPrice = noOfChairs*makeChair().getBasePrice() + noOfChairs*makeChair().getPrice();
		int totalPlaceSettingPrice = noOfChairs*makePlaceSetting().getBasePrice() + noOfChairs*makePlaceSetting().getPrice();
		int totalCenterPiecePrice = makeCenterPiece().getBasePrice() + makeCenterPiece().getPrice();
		
		return (totalChairPrice + totalPlaceSettingPrice + totalCenterPiecePrice);
	}
}

// Chair Product 
class Chair {
	private int baseChairPrice;
	private int chairPrice;
	
	// setter and getters for baseChairPrice
	public void setBasePrice(int baseChairPrice) {
		this.baseChairPrice = baseChairPrice;
	}
	public int getBasePrice() {
		return this.baseChairPrice;
	}
	
	// setter and getters for chairPrice
	public void setPrice(int chairPrice) {
		this.chairPrice = chairPrice;
	}
	public int getPrice() {
		return this.chairPrice;
	}
}

// Concrete Chair Product
class BaseChair extends Chair {
	BaseChair() {
		setBasePrice(50);
	}
}

// Concrete VintageChair Product
class VintageChair extends BaseChair {
	VintageChair() {
		setPrice(50);
	}
}

// Concrete ContemporaryChair Product
class ContemporaryChair extends BaseChair {
	ContemporaryChair() {
		setPrice(20);
	}	
}

// Concrete ModernChair Product
class ModernChair extends BaseChair {
	ModernChair() {
		setPrice(100);
	}
}

// PlaceSetting Product
class PlaceSetting {
	private int basePlaceSettingPrice;
	private int placeSettingPrice;
	
	// setter and getters for baseplaceSettingPrice
	public void setBasePrice(int basePlaceSettingPrice) {
		this.basePlaceSettingPrice = basePlaceSettingPrice;
	}
	public int getBasePrice() {
		return this.basePlaceSettingPrice;
	}
	
	// setter and getters for placeSettingPrice
	public void setPrice(int placeSettingPrice) {
		this.placeSettingPrice = placeSettingPrice;
	}
	public int getPrice() {
		return this.placeSettingPrice;
	}
}

// Concrete PlaceSetting Product
class BasePlaceSetting extends PlaceSetting {
	BasePlaceSetting() {
		setBasePrice(20);
	}
}

//Concrete PlaceSetting Product
class VintagePlaceSetting extends BasePlaceSetting {
	VintagePlaceSetting() {
		setPrice(40);
	}
}

//Concrete ContemporaryPlaceSetting Product
class ContemporaryPlaceSetting extends BasePlaceSetting  {
	ContemporaryPlaceSetting() {
		setPrice(20);
	}
}

//Concrete ModernPlaceSetting Product
class ModernPlaceSetting extends BasePlaceSetting  {
	ModernPlaceSetting() {
		setPrice(30);
	}
}

// CenterPiece Product
class CenterPiece {
	private int baseCenterPiecePrice;
	private int centerPiecePrice;
	
	// setter and getters for basecenterPiecePrice
	public void setBasePrice(int baseCenterPiecePrice) {
		this.baseCenterPiecePrice = baseCenterPiecePrice;
	}
	public int getBasePrice() {
		return this.baseCenterPiecePrice;
	}
	
	// setter and getters for centerPiecePrice
	public void setPrice(int centerPiecePrice) {
		this.centerPiecePrice = centerPiecePrice;
	}
	public int getPrice() {
		return this.centerPiecePrice;
	}
}

// Concrete CenterPiece Product
class BaseCenterPiece extends CenterPiece {
	BaseCenterPiece() {
		setBasePrice(30);
	}
}

//Concrete VintageCenterPiece Product
class VintageCenterPiece extends BaseCenterPiece {
	VintageCenterPiece() {
		setPrice(35);
	}
}

//Concrete ContemporaryCenterPiece Product
class ContemporaryCenterPiece extends BaseCenterPiece {
	ContemporaryCenterPiece() {
		setPrice(25);
	}
}

//Concrete ModernCenterPiece Product
class ModernCenterPiece extends BaseCenterPiece {
	ModernCenterPiece() {
		setPrice(40);
	}
}

//Builder Interface
interface TableSettingBuilder {
	public void buildChair();
	public void buildPlaceSetting();
	public void buildCenterPiece();
	public TableSetting getTableSetting();
}

// Concrete Builder class
class VintageSettingBuilder implements TableSettingBuilder {
	private VintageStyle tableSetting;
	
	VintageSettingBuilder() { 
		tableSetting = new VintageStyle(); 
	}
	public void buildChair() {
		tableSetting.makeChair();
	}
	public void buildPlaceSetting() {
		tableSetting.makePlaceSetting();
	}
	public void buildCenterPiece() {
		tableSetting.makeCenterPiece();
	}
	public TableSetting getTableSetting() {
		return tableSetting;
	}
}

//Concrete Builder class
class ContemporarySettingBuilder implements TableSettingBuilder {
	private TableSetting tableSetting;
	
	ContemporarySettingBuilder() { 
		tableSetting = new ContemporaryStyle(); 
	}
	public void buildChair() {
		tableSetting.makeChair();
	}
	public void buildPlaceSetting() {
		tableSetting.makePlaceSetting();
	}
	public void buildCenterPiece() {
		tableSetting.makeCenterPiece();
	}
	public TableSetting getTableSetting() {
		return tableSetting;
	}
}

//Concrete Builder class
class ModernSettingBuilder implements TableSettingBuilder {
	private TableSetting tableSetting;
	
	ModernSettingBuilder() { 
		tableSetting = new ModernStyle(); 
	}
	public void buildChair() {
		tableSetting.makeChair();
	}
	public void buildPlaceSetting() {
		tableSetting.makePlaceSetting();
	}
	public void buildCenterPiece() {
		tableSetting.makeCenterPiece();
	}
	public TableSetting getTableSetting() {
		return tableSetting;
	}
}

//Director class
class TableSettingDirector {
	private TableSettingBuilder tableSettingBuilder = null;
	
	TableSettingDirector(TableSettingBuilder tableSettingBuilder) {
		this.tableSettingBuilder = tableSettingBuilder;
	}
	
	public void constructTableSetting() {
		tableSettingBuilder.buildChair();
		tableSettingBuilder.buildPlaceSetting();
		tableSettingBuilder.buildCenterPiece();
	}
	
	public TableSetting getTableSetting() {
		return tableSettingBuilder.getTableSetting(); 
	}	
}

// Client class 
public class PartySetting {
	
	// Total no of tables
	int noOfTables;
	
	// Array of table settings
	ArrayList<TableSetting> tables = new ArrayList<TableSetting>();
	
	// Array of styles table numbers
	ArrayList<Integer> noOfTableStyles;
	
	TableSettingDirector tableSettingDirector;
	
	// Constructor
	PartySetting(ArrayList<Integer> noOfTableStyles) {
		for(int n:noOfTableStyles) {
			this.noOfTables += n;
		}
		this.noOfTableStyles = noOfTableStyles;
		
		// Builders building the TableSetting and storing in the array
		TableSettingBuilder tableSettingBuilder = new VintageSettingBuilder();
		tableSettingDirector = new TableSettingDirector(tableSettingBuilder);
		tableSettingDirector.constructTableSetting(); 
		TableSetting tablesetting = tableSettingDirector.getTableSetting();
		tables.add(tablesetting);
		
		tableSettingBuilder = new ContemporarySettingBuilder();
		tableSettingDirector = new TableSettingDirector(tableSettingBuilder);
		tableSettingDirector.constructTableSetting(); 
		tablesetting = tableSettingDirector.getTableSetting();
		tables.add(tablesetting);
		
		tableSettingBuilder = new ModernSettingBuilder();
		tableSettingDirector = new TableSettingDirector(tableSettingBuilder);
		tableSettingDirector.constructTableSetting(); 
		tablesetting = tableSettingDirector.getTableSetting();
		tables.add(tablesetting);
	}
	
	// Method to calculate total price of the order
	public int calculateCost() {
		int i = 0;
		Integer totalPrice = 0;
		
		for(TableSetting tableSetting: tables) {
			totalPrice += noOfTableStyles.get(i) * tableSetting.getTotalPrice();
			i++;
		}
		
		return totalPrice;	
	}
	
	// Method to display the order details
	public void displayPartySetting(){
		
		// displaying the no of tables
		System.out.println("\nTotal number of tables = " + noOfTables);
		
		// displaying the no of tables of each style
		System.out.println("Number of tables of Vintage Style = " + noOfTableStyles.get(0));
		System.out.println("Each of these consists of: " + tables.get(0).getNoOfChairs() + " chairs, " + tables.get(0).getNoOfChairs() + " place-settings(plates, silver sets, napkins) and one center-piece");
		
		System.out.println("Number of tables of Contemporary Style = " + noOfTableStyles.get(1));
		System.out.println("Each of these consists of: " + tables.get(0).getNoOfChairs() + " chairs, " + tables.get(0).getNoOfChairs() + " place-settings(plates, silver sets, napkins) and one center-piece");
		
		System.out.println("Number of tables of Modern Style = " + noOfTableStyles.get(2));
		System.out.println("Each of these consists of: " + tables.get(0).getNoOfChairs() + " chairs, " + tables.get(0).getNoOfChairs() + " place-settings(plates, silver sets, napkins) and one center-piece");	
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> noOfTableStyles = new ArrayList<Integer>();
		
		System.out.println("Welcome to Party Orders");
		System.out.println("Type of Settings");
		System.out.println("1. Vintage");
		System.out.println("2. Contemporary");
		System.out.println("3. Modern");
		System.out.println("Enter the no of tables for each table setting in the above order: ");
		Scanner scn = new Scanner(System.in);
		
		// user input for no of tables for each of the 3 styles and storing in the array
		int noOfVintageTables = scn.nextInt();
		noOfTableStyles.add(noOfVintageTables);
		int noOfContemporaryTables = scn.nextInt();
		noOfTableStyles.add(noOfContemporaryTables);
		int noOfModernTables = scn.nextInt();
		noOfTableStyles.add(noOfModernTables);
		scn.close();
		
		// instance of PartySetting
		PartySetting partySetting= new PartySetting(noOfTableStyles);	
		
		System.out.println("\nTotal price of your order: " + partySetting.calculateCost());
		partySetting.displayPartySetting();
		}
	
}
