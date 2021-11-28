package br.com.scardofax.scfxcontrolhours.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "t_customers")
public class Customers {

    @Id
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
