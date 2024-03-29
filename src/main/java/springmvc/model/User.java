package springmvc.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String name;
    @OneToMany(mappedBy ="user" ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Product> products;
    public User() {
    }

    public User(Integer id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
