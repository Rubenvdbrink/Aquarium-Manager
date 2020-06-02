package nl.hu.bep.webservices;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.bewoners.Garnaal;
import nl.hu.bep.model.bewoners.Kreeft;
import nl.hu.bep.model.bewoners.Slak;
import nl.hu.bep.model.bewoners.Vis;
import nl.hu.bep.model.personen.Beheerder;
import nl.hu.bep.model.personen.Eigenaar;
import nl.hu.bep.model.personen.MyUser;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.AbstractMap;

@Path("/bewoner")
public class BewonerResource {

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addGarnaal")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addGarnaal(@Context SecurityContext context,
                               @FormParam("aquariumnaam") String aquariumnaam,
                               @FormParam("soortnaam") String soortnaam,
                               @FormParam("kleurnaam") String kleurnaam,
                               @FormParam("aantal") int aantal,
                               @FormParam("garnaalgroepsdier") String groepsdier) {
        try {
            if (aquariumnaam == null || soortnaam == null || kleurnaam == null) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();

            boolean groepsdierBool = true;

            if(groepsdier == null) {
                groepsdierBool = false;
            }

            Garnaal g1 = new Garnaal(soortnaam, kleurnaam, aantal, groepsdierBool);

            if (user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                Aquarium a1 = eigenaar.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(g1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }

            else if (user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                Aquarium a1 = beheerder.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(g1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", e.getMessage())).build();
        }
        return Response.status(Response.Status.CONFLICT).entity(
                new AbstractMap.SimpleEntry<>("resultaat", "bewoner niet toegevoegd")).build();
    }

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addKreeft")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addKreeft(@Context SecurityContext context,
                               @FormParam("aquariumnaam") String aquariumnaam,
                               @FormParam("soortnaam") String soortnaam,
                               @FormParam("kleurnaam") String kleurnaam,
                               @FormParam("aantal") int aantal,
                               @FormParam("kreeftgroepsdier") String groepsdier) {
        try {
            if (aquariumnaam == null || soortnaam == null || kleurnaam == null) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();

            boolean groepsdierBool = true;

            if(groepsdier == null) {
                groepsdierBool = false;
            }

            Kreeft k1 = new Kreeft(soortnaam, kleurnaam, aantal, groepsdierBool);

            if (user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                Aquarium a1 = eigenaar.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(k1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }

            else if (user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                Aquarium a1 = beheerder.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(k1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", e.getMessage())).build();
        }
        return Response.status(Response.Status.CONFLICT).entity(
                new AbstractMap.SimpleEntry<>("resultaat", "bewoner niet toegevoegd")).build();
    }

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addSlak")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addSlak(@Context SecurityContext context,
                              @FormParam("aquariumnaam") String aquariumnaam,
                              @FormParam("soortnaam") String soortnaam,
                              @FormParam("kleurnaam") String kleurnaam,
                              @FormParam("aantal") int aantal,
                              @FormParam("slakgroepsdier") String groepsdier,
                              @FormParam("slakkenetend") String slakkenetend) {
        try {
            if (aquariumnaam == null || soortnaam == null || kleurnaam == null) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();

            boolean groepsdierBool = true;
            boolean slakkenetendBool = true;

            if(groepsdier == null) {
                groepsdierBool = false;
            }
            if(slakkenetend == null) {
                slakkenetendBool = false;
            }

            Slak s1 = new Slak(soortnaam, kleurnaam, aantal, groepsdierBool, slakkenetendBool);

            if (user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                Aquarium a1 = eigenaar.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(s1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }

            else if (user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                Aquarium a1 = beheerder.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(s1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", e.getMessage())).build();
        }
        return Response.status(Response.Status.CONFLICT).entity(
                new AbstractMap.SimpleEntry<>("resultaat", "bewoner niet toegevoegd")).build();
    }

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addVis")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addVis(@Context SecurityContext context,
                            @FormParam("aquariumnaam") String aquariumnaam,
                            @FormParam("soortnaam") String soortnaam,
                            @FormParam("kleurnaam") String kleurnaam,
                            @FormParam("aantal") int aantal,
                            @FormParam("visgroepsdier") String groepsdier,
                            @FormParam("algetend") String algetend,
                            @FormParam("speciaalvoer") String speciaalvoer) {
        try {
            if (aquariumnaam == null || soortnaam == null || kleurnaam == null) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();

            boolean groepsdierBool = true;
            boolean algetendBool = true;
            boolean speciaalvoerBool = true;

            if(groepsdier == null) {
                groepsdierBool = false;
            }
            if(algetend == null) {
                algetendBool = false;
            }
            if(speciaalvoer == null) {
                speciaalvoerBool = false;
            }

            Vis v1 = new Vis(soortnaam, kleurnaam, aantal, groepsdierBool, algetendBool, speciaalvoerBool);

            if (user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                Aquarium a1 = eigenaar.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(v1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }

            else if (user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                Aquarium a1 = beheerder.getAquariumByName(aquariumnaam);
                if (a1.addBewoner(v1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "bewoner toegevoegd!")).build();
                }
            }
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", e.getMessage())).build();
        }
        return Response.status(Response.Status.CONFLICT).entity(
                new AbstractMap.SimpleEntry<>("resultaat", "bewoner niet toegevoegd")).build();
    }
}
