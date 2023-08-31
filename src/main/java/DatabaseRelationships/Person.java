package DatabaseRelationships;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    private String name;
    @Id
    private int id;

//    @OneToOne --> uses regular getters and setters
//    private Laptop laptop;

//    @OneToMany(mappedBy = "person") //TODO sort out why the value of the reference feild in laptop displays a null
//    private List<Laptop> laptop = new ArrayList<>();

    @ManyToMany(mappedBy = "person")
    private List<Laptop> laptop = new ArrayList<>();


    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
