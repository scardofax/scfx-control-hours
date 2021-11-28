package br.com.scardofax.scfxcontrolhoursapi.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private BigDecimal hourValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getHourValue() {
        return hourValue;
    }

    public void setHourValue(BigDecimal hourValue) {
        this.hourValue = hourValue;
    }
}
