package com.digitech.test.entite;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column( name = "name")
    private String name;
    @OneToMany(mappedBy = "country" , fetch = FetchType.LAZY)
    private List<Cedants> cedants;
}
