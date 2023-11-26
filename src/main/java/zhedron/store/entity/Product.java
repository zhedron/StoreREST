package zhedron.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    @JsonIgnore
    private int id;

    @Column (name = "title")
    private String title;

    @Column (name = "description")
    private String description;

    @Column (name = "price")
    private int price;

    @Column (name = "amount")
    private int amount;

    public Product () {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
