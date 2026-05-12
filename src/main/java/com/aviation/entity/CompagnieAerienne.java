package com.aviation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPAGNIES_AERIENNES")
public class CompagnieAerienne {

    @Id
    @Column(name = "ID_COMPAGNIE", length = 2, nullable = false)
    private String idCompagnie;

    @Column(name = "NOM", length = 20, nullable = false)
    private String nom;

    public String getIdCompagnie() { return idCompagnie; }
    public void setIdCompagnie(String idCompagnie) { this.idCompagnie = idCompagnie; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
}