package com.loloof64.wild_code_checkpoint_2.model;

import javax.persistence.*;

@Entity
@Table
public class Weight {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Unit unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
