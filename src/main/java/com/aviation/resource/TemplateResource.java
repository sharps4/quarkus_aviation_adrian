package com.aviation.resource;

import com.aviation.entity.AvionLigne;
import com.aviation.entity.CompagnieAerienne;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/")
public class TemplateResource {

    @Inject
    EntityManager em;

    @Inject
    Template index;

    @Inject
    Template compagnie;

    @Inject
    Template avion;

    @GET
    @Path("/index.html")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getIndex() {
        List<AvionLigne> avions = em.createQuery("SELECT a FROM AvionLigne a", AvionLigne.class).getResultList();
        return index.data("avions", avions);
    }

    @GET
    @Path("/compagnie.html")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getCompagnie(@QueryParam("id") String id) {
        List<CompagnieAerienne> compagnies = em.createQuery("SELECT c FROM CompagnieAerienne c", CompagnieAerienne.class).getResultList();
        
        List<AvionLigne> modeles = new ArrayList<>();
        List<Object[]> flotte = new ArrayList<>();
        
        if (id != null && !id.isEmpty()) {
            modeles = em.createQuery(
                "SELECT DISTINCT a FROM FlottePassagers f, AvionLigne a WHERE f.idAl = a.idAl AND f.idCompagnie = :id", AvionLigne.class)
                .setParameter("id", id).getResultList();
                
            flotte = em.createQuery(
                "SELECT f.idFpass, a.constructeur, a.modele, f.nombre " +
                "FROM FlottePassagers f, AvionLigne a " +
                "WHERE f.idAl = a.idAl AND f.idCompagnie = :id", Object[].class)
                .setParameter("id", id).getResultList();
        }
        
        return compagnie.data("compagnies", compagnies)
                        .data("selectedId", id)
                        .data("modeles", modeles)
                        .data("nbModeles", modeles.size())
                        .data("flotte", flotte);
    }

    @GET
    @Path("/avion.html")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getAvion(@QueryParam("id") String id) {
        List<AvionLigne> avions = em.createQuery("SELECT a FROM AvionLigne a", AvionLigne.class).getResultList();
        
        AvionLigne selectedAvion = null;
        List<CompagnieAerienne> compagnies = new ArrayList<>();
        
        if (id != null && !id.isEmpty()) {
            selectedAvion = em.find(AvionLigne.class, id);
            compagnies = em.createQuery(
                "SELECT c FROM FlottePassagers f, CompagnieAerienne c WHERE f.idCompagnie = c.idCompagnie AND f.idAl = :id", CompagnieAerienne.class)
                .setParameter("id", id).getResultList();
        }
        
        return avion.data("avions", avions)
                    .data("selectedId", id)
                    .data("selectedAvion", selectedAvion)
                    .data("compagnies", compagnies);
    }
}
