package restaurant;

public class MenuItem {
    // Fields and Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean newItem;

    // Constructors
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not Categorized";
        this.newItem = false;
    }

    public MenuItem(String name, String description, Double price, String category, Boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    // Methods
    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean aNewItem) {
        this.newItem = aNewItem;
    }

    // Other Methods

    public Boolean isNew() {
        return getNewItem();
    }

    @Override
    public String toString() {
        String returnString = "";

        // Print item name
        returnString += "item Name: " + this.name + "\n";

        // Print item description
        returnString += "Item Description: " + this.description + "\n";

        // Print item price
        returnString += "Item Price: " + this.price + "\n";

        // Print item category
        returnString += "Item Category: " + this.category + "\n";

        // Print if item is new
        returnString += "Is item new? " + this.newItem + "\n";

        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        // Check if menuItem is not a MenuItem
        if (!(obj instanceof MenuItem)) { return false; }

        MenuItem menuItem = (MenuItem) obj;
        // If itemName equals menuItem.itemName...
        if (menuItem.name.equals(this.name)
                // and itemDescription equals menuItem.description...
                && menuItem.description.equals(this.description)
                // and itemPrice equals menuItem.price...
                && menuItem.price.equals(this.price)
                // and itemCategory equals menuItem.category...
                && menuItem.category.equals(this.category))
            // then return true.
            return true;

         // Otherwise return false.
         else return false;
    }
}
