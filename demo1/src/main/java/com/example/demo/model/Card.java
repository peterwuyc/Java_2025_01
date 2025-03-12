package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "card")
@Entity
@Data
public class Card {
    @Id
    private Integer id;
    @Column
    private Integer balance;
    @OneToOne(mappedBy = "card")
    @JsonIgnore
    private Student student;
}
