package com.loloof64.wild_code_checkpoint_2.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    private Long id;

    @Basic
    private String code;

    @Basic
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
