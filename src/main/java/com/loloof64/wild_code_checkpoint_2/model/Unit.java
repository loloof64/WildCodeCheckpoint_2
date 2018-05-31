package com.loloof64.wild_code_checkpoint_2.model;

import javax.persistence.*;

@Entity
@Table
public class Unit {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String name;

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
}
