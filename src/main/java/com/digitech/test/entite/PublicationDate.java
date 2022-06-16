package com.digitech.test.entite;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Data
@Getter
@Setter
@Entity
@Table(name="publicationdate")
public class PublicationDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "confirmation_date")
    private Date confirmationDate;
}
