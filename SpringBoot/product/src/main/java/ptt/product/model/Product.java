package ptt.product.model;

public class Product {

    private int id;
    private String name;
    private String description;
    private Double price;
    private String quantity;

    public  Product() {

    }
    public Product(int id, String name, String description,Double price,String quantity){
        this.id =id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "Product [id=" +id+ ",name="+name+",description= "+description+",price="+price+",quantity="+quantity+"]";
    }
}

