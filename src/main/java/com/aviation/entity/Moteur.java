package com.aviation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MOTEURS")
public class Moteur {

    @Id
    @Column(name = "ID_MOTEUR", length = 4, nullable = false)
    private String idMoteur;

    @Column(name = "ID_MOTEURFULL", length = 25, nullable = false)
    private String idMoteurFull;

    @Column(name = "TYPE", length = 15, nullable = false)
    private String type;

    @Column(name = "FABRICANT", length = 30, nullable = false)
    private String fabricant;

    @Column(name = "FAMILLE", length = 10, nullable = false)
    private String famille;

    @Column(name = "SERIE", length = 10)
    private String serie;

    @Column(name = "MODELE", length = 10, nullable = false)
    private String modele;

    @Column(name = "POUSSEE", nullable = false)
    private double poussee;

    @Column(name = "LONGUEUR", nullable = false)
    private int longueur;

    public String getIdMoteur() { return idMoteur; }
    public void setIdMoteur(String idMoteur) { this.idMoteur = idMoteur; }

    public String getIdMoteurFull() { return idMoteurFull; }
    public void setIdMoteurFull(String idMoteurFull) { this.idMoteurFull = idMoteurFull; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getFabricant() { return fabricant; }
    public void setFabricant(String fabricant) { this.fabricant = fabricant; }

    public String getFamille() { return famille; }
    public void setFamille(String famille) { this.famille = famille; }

    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public double getPoussee() { return poussee; }
    public void setPoussee(double poussee) { this.poussee = poussee; }

    public int getLongueur() { return longueur; }
    public void setLongueur(int longueur) { this.longueur = longueur; }
}