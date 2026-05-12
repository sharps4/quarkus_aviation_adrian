package com.aviation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "AVIONS_LIGNE")
public class AvionLigne {

    @Id
    @Column(name = "ID_AL", length = 5, nullable = false)
    private String idAl;

    @Column(name = "ID_ALFULL", length = 15, nullable = false)
    private String idAlFull;

    @Column(name = "CONSTRUCTEUR", length = 10, nullable = false)
    private String constructeur;

    @Column(name = "FAMILLE", length = 5, nullable = false)
    private String famille;

    @Column(name = "SERIE", length = 5, nullable = false)
    private String serie;

    @Column(name = "MODELE", length = 10, nullable = false)
    private String modele;

    @Column(name = "NBREMOTEURS", nullable = false)
    private int nbreMoteurs;

    @Column(name = "ID_MOTEUR", length = 20, nullable = false)
    private String idMoteur;

    @Column(name = "ENVERGURE", nullable = false)
    private double envergure;

    @Column(name = "LONGUEUR", nullable = false)
    private double longueur;

    @Column(name = "HAUTEUR", nullable = false)
    private double hauteur;

    @Column(name = "LARGEURFUSELAGE", nullable = false)
    private double largeurFuselage;

    @Column(name = "LARGEURCABINE", nullable = false)
    private double largeurCabine;

    @Column(name = "NBREPASSMIN", nullable = false)
    private int nbrePassMin;

    @Column(name = "NBREPASSMAX", nullable = false)
    private int nbrePassMax;

    @Column(name = "VOLUMECARGO", nullable = false)
    private int volumeCargo;

    @Column(name = "LD3", nullable = false)
    private int ld3;

    @Column(name = "MISEENSERVICE")
    private LocalDate miseEnService;

    public String getIdAl() { return idAl; }
    public void setIdAl(String idAl) { this.idAl = idAl; }

    public String getIdAlFull() { return idAlFull; }
    public void setIdAlFull(String idAlFull) { this.idAlFull = idAlFull; }

    public String getConstructeur() { return constructeur; }
    public void setConstructeur(String constructeur) { this.constructeur = constructeur; }

    public String getFamille() { return famille; }
    public void setFamille(String famille) { this.famille = famille; }

    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public int getNbreMoteurs() { return nbreMoteurs; }
    public void setNbreMoteurs(int nbreMoteurs) { this.nbreMoteurs = nbreMoteurs; }

    public String getIdMoteur() { return idMoteur; }
    public void setIdMoteur(String idMoteur) { this.idMoteur = idMoteur; }

    public double getEnvergure() { return envergure; }
    public void setEnvergure(double envergure) { this.envergure = envergure; }

    public double getLongueur() { return longueur; }
    public void setLongueur(double longueur) { this.longueur = longueur; }

    public double getHauteur() { return hauteur; }
    public void setHauteur(double hauteur) { this.hauteur = hauteur; }

    public double getLargeurFuselage() { return largeurFuselage; }
    public void setLargeurFuselage(double largeurFuselage) { this.largeurFuselage = largeurFuselage; }

    public double getLargeurCabine() { return largeurCabine; }
    public void setLargeurCabine(double largeurCabine) { this.largeurCabine = largeurCabine; }

    public int getNbrePassMin() { return nbrePassMin; }
    public void setNbrePassMin(int nbrePassMin) { this.nbrePassMin = nbrePassMin; }

    public int getNbrePassMax() { return nbrePassMax; }
    public void setNbrePassMax(int nbrePassMax) { this.nbrePassMax = nbrePassMax; }

    public int getVolumeCargo() { return volumeCargo; }
    public void setVolumeCargo(int volumeCargo) { this.volumeCargo = volumeCargo; }

    public int getLd3() { return ld3; }
    public void setLd3(int ld3) { this.ld3 = ld3; }

    public LocalDate getMiseEnService() { return miseEnService; }
    public void setMiseEnService(LocalDate miseEnService) { this.miseEnService = miseEnService; }
}