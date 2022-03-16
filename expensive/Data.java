package expensive;

public class Data {
    private String category;
    private String items;
    private String price;

    public Data(String category, String items, String price) {
        this.setCategory(category);
        this.setItems(items);
        this.setPrice(price);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}

