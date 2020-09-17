/*
package whitecollar.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="collar")
public class Collar {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String name;
    private Role role;  //las faenas son fijas
    private int salary;

    Collar() {}

    public Collar(String name, Role role) {

        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Role getRole() {
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) { this.role = role; }

    //setter y getter de salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return role.getSalaryByRole();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Collar))
            return false;
        Collar employee = (Collar) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "iddddd=" + this.id + ", name=" + this.name + '\''
                + ", role=" + this.role + '\'' + ", salary=" + this.salary + '}';
    }
}
*/