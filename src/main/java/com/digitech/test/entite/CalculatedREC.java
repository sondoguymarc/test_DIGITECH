package com.digitech.test.entite;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name="calculatedrec")
public class CalculatedREC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column( name = "premium_ht")
    private double premiumHt;
    @ManyToOne
    private Branche branche;
    @ManyToOne
    private Cedants cedant;
}
