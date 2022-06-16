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
@Table(name="branche")
public class Branche {
            @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;
            @Column( name = "name")
            private String name;
            @OneToMany(mappedBy = "branche" , fetch = FetchType.LAZY)
            private List<CalculatedREC> calculatedrec;
}
