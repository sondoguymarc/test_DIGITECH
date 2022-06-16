package com.digitech.test.entite;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name="cedants")
public class Cedants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column( name = "name")
    private String name;
    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "cedant", fetch = FetchType.LAZY)

    private List<ValidationStatus> validations;

}
