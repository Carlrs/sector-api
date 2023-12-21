package dev.carlrs.sectorapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sector {
    @Id
    Long id;
    @Column(name = "code", nullable = false, unique = true)
    Long code;
    @Column(name = "name", nullable = false)
    String name;
}
