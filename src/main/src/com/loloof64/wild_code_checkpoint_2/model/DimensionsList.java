package com.loloof64.wild_code_checkpoint_2.model;

import javax.persistence.*;

@Entity
@Table(name="dimensions_list")
public class DimensionsList {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private Double value;

}
