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

}
