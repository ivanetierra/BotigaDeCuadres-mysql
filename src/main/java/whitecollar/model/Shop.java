package whitecollar.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id_shop")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private int maxCapacity;

    @OneToMany
    @JoinColumn(name="id")
    private List<Collar> collars;

    //CONSTRUCTORS

    public Shop() {
    }

    public Shop(Long id, String name, int maxCapacity) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    // GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Collar")
    public List<Collar> getCollars() {
        return collars;
    }


    public void setCollars(List<Collar> collars) {
        this.collars = collars;
    }

}




