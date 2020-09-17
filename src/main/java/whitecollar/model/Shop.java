package whitecollar.model;


import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shop")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private int maxCapacity;

    //Constructors

    public Shop() {
    }

    public Shop(Long id, String name, int maxCapacity) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }
}




