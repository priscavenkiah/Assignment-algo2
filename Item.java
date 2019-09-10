/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Item {
	
	//Static attributes
	private static int TotalItem = 0;
	
	/*********************************/
	//object attributes
	private String itemID;
	private String Name;
	private String Description;
	private String Category;
	private String SupplierName;
	private String SupplierContacts;
	private double Price;
	private int Availablequantity;
	
	/*Constructor*/
	
	/**
	 * Default constructor
	 */
	public Item() {
		this.itemID = null;
		this.Name = null;
		this.Description = null;
		this.Category = null;
		this.SupplierName = null;
		this.SupplierContacts = null;
		this.Price = 0.0;
		this.Availablequantity = 0;
		setTotalItem((TotalItem()+1));
		
	}
	
	/**
	 * 
	 * Overloaded 8 para Constructors
	 * @param itemID
	 * @param Name
	 * @param Description
	 * @param Category
	 * @param SupplierName
	 * @param SupplierContacts
	 * @param Price
	 * @param Availablequantity
	 */
	public Item(String itemID, String Name, String Description, String Category, String SupplierName, String SupplierContacts, double Price, int Availablequantity) {
		this.itemID = itemID;
		this.Name = Name;
		this.Description = Description;
		this.Category = Category;
		this.SupplierName = SupplierName;
		this.SupplierContacts = SupplierContacts;
		this.Price = Price;
		this.Availablequantity = Availablequantity;
		setTotalItem((TotalItem()+1));
		
		
	}
	
	/***Getters***/
	
	/**
	 * Method to return itemID
	 * @return the itemID
	 */
	public String getItemID() {
		return itemID;
	}
	
	/**
	 * Method to return name
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * Method to return description
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	
	/**
	 * Method to return category
	 * @return the category
	 */
	public String getCategory() {
		return Category;
	}
	
	/**
	 * Method to return supplierName
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return SupplierName;
	}
	
	/**
	 * Method to return supplierContacts
	 * @return the supplierContacts
	 */
	public String getSupplierContacts() {
		return SupplierContacts;
	}
	
	/**
	 * Method to return price
	 * @return the price
	 */
	public double getPrice() {
		return Price;
	}
	
	/**
	 * @return the availablequantity
	 */
	public int getAvailablequantity() {
		return Availablequantity;
	}
	
	
	   /*Setters*/

	/**
	 * Method to set itemID
	 * @param itemID the itemID to set
	 */
	public void setItemID(String itemID) {
		this.itemID = itemID;
		TotalItem++;
	}

	/**
	 * Method to set name
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * Method to set description
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * Method to set category
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		Category = category;
	}

	/**
	 * Method to set supplierName
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}

	/**
	 * Method to set supplierContacts
	 * @param supplierContacts the supplierContacts to set
	 */
	public void setSupplierContacts(String supplierContacts) {
		SupplierContacts = supplierContacts;
	}

	/**
	 * Method to set price
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		Price = price;
	}

	/**
	 * Method to set availablequantity
	 * @param availablequantity the availablequantity to set
	 */
	public void setAvailablequantity(int availablequantity) {
		Availablequantity = availablequantity;
	}
	
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", Name=" + Name + ", Description=" + Description + ", Category=" + Category
				+ ", SupplierName=" + SupplierName + ", SupplierContacts=" + SupplierContacts + ", Price=" + Price + ", Availablequantity=" + Availablequantity + "]";
		
	}
	
	public boolean equals(Item I) {
		
		if (this.itemID.equalsIgnoreCase(I.itemID)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	/**
	 * @return the counter
	 */
	public static int TotalItem() {
		return TotalItem;
	}

	/**
	 * @param counter the counter to set
	 */
	public static void setTotalItem(int TotalItem) {
		Item.TotalItem = TotalItem;
	}
	

}
