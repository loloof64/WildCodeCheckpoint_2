package com.loloof64.wild_code_checkpoint_2.model;

import javax.persistence.*;

@Entity
@Table(name = "dimension")
public class Dimension {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Unit unit;

    @Basic
    private Double dimension_1;

    @Basic
    private Double dimension_2;

    @Basic
    private Double dimension_3;

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

    public Double getDimension_1() {
        return dimension_1;
    }

    public void setDimension_1(Double dimension_1) {
        this.dimension_1 = dimension_1;
    }

    public Double getDimension_2() {
        return dimension_2;
    }

    public void setDimension_2(Double dimension_2) {
        this.dimension_2 = dimension_2;
    }

    public Double getDimension_3() {
        return dimension_3;
    }

    public void setDimension_3(Double dimension_3) {
        this.dimension_3 = dimension_3;
    }
}
