package parts.model;

import javax.persistence.*;

@Entity
@Table(name = "part")
public class Part {
    @Id
    @Column(name = "id_part")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "part_name")
    private String name;

    @Column(name = "part_quantity")
    private int part_quantity;

    @Column(name = "part_need")
    private boolean part_need;

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

    public int getPart_quantity() {
        return part_quantity;
    }

    public void setPart_quantity(int part_quantity) {
        this.part_quantity = part_quantity;
    }

    public boolean isPart_need() {
        return part_need;
    }

    public void setPart_need(boolean part_need) {
        this.part_need = part_need;
    }
}
