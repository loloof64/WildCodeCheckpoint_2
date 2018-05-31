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

}
