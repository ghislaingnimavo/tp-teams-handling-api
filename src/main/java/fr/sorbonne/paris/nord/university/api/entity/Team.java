package fr.sorbonne.paris.nord.university.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="team")

public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String slogan;
    // getters and setters
}

