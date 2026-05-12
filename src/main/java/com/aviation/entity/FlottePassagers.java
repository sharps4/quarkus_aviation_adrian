package com.aviation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FLOTTES_PASSAGERS")
public class FlottePassagers {

    @Id
    @Column(name = "ID_FPASS", length = 5, nullable = false)
    private String idFpass;

    @Column(name = "ID_COMPAGNIE", length = 2, nullable = false)
    private String idCompagnie;

    @Column(name = "ID_AL", length = 5, nullable = false)
    private String idAl;

    @Column(name = "NOMBRE", nullable = false)
    private int nombre;

    public String getIdFpass() { return idFpass; }
    public void setIdFpass(String idFpass) { this.idFpass = idFpass; }

    public String getIdCompagnie() { return idCompagnie; }
    public void setIdCompagnie(String idCompagnie) { this.idCompagnie = idCompagnie; }

    public String getIdAl() { return idAl; }
    public void setIdAl(String idAl) { this.idAl = idAl; }

    public int getNombre() { return nombre; }
    public void setNombre(int nombre) { this.nombre = nombre; }
}