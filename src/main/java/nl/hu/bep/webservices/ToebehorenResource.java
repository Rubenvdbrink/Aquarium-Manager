package nl.hu.bep.webservices;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.aquarium.Filter;
import nl.hu.bep.model.aquarium.Thermostaat;
import nl.hu.bep.model.aquarium.Verlichting;
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

@Path("/toebehoren")
public class ToebehorenResource {

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addVerlichting")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addVerlichting(@Context SecurityContext context,
                                    @FormParam("aquariumnaam") String aquariumnaam,
                                    @FormParam("model") String model,
                                    @FormParam("serienummer") int serienummer,
                                    @FormParam("tijdaan") int tijdaan,
                                    @FormParam("tijduit") int tijduit,
                                    @FormParam("isled") String isled) {
        try {
            if (model == null || aquariumnaam == null || serienummer == 0) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();
            boolean isledBool = true;

            if(isled == null) {
                isledBool = false;
            }

            Verlichting v1 = new Verlichting(model, serienummer, isledBool, tijdaan, tijduit);

            if(user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                Aquarium a1 = eigenaar.getAquariumByName(aquariumnaam);
                if(a1.addToebehoren(v1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "toebehoren toegevoegd!")).build();
                }
                return Response.status(Response.Status.CONFLICT).entity(
                        new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
            }

            else if(user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                Aquarium a1 = beheerder.getAquariumByName(aquariumnaam);
                if(a1.addToebehoren(v1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "toebehoren toegevoegd!")).build();
                }
                return Response.status(Response.Status.CONFLICT).entity(
                        new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
            }

        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
        }
        return Response.status(Response.Status.CONFLICT).entity(
                new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
    }

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addThermostaat")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addThermostaat(@Context SecurityContext context,
                                    @FormParam("aquariumnaam") String aquariumnaam,
                                    @FormParam("model") String model,
                                    @FormParam("serienummer") int serienummer,
                                    @FormParam("mintemp") int mintemp,
                                    @FormParam("maxtemp") int maxtemp,
                                    @FormParam("huidigetemp") int huidigetemp) {
        try {
            if (model == null || aquariumnaam == null || serienummer == 0) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();

            Thermostaat t1 = new Thermostaat(model, serienummer, mintemp, maxtemp, huidigetemp);

            if(user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                Aquarium a1 = eigenaar.getAquariumByName(aquariumnaam);
                if(a1.addToebehoren(t1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "toebehoren toegevoegd!")).build();
                }
                return Response.status(Response.Status.CONFLICT).entity(
                        new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
            }

            else if(user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                Aquarium a1 = beheerder.getAquariumByName(aquariumnaam);
                if(a1.addToebehoren(t1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "toebehoren toegevoegd!")).build();
                }
                return Response.status(Response.Status.CONFLICT).entity(
                        new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
            }

        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
        }
        return Response.status(Response.Status.CONFLICT).entity(
                new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
    }

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addFilter")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addFilter(@Context SecurityContext context,
                                   @FormParam("aquariumnaam") String aquariumnaam,
                                   @FormParam("model") String model,
                                   @FormParam("serienummer") int serienummer,
                                   @FormParam("aantalliter") int aantalliter,
                                   @FormParam("isextern") String isextern) {
        try {
            if (model == null || aquariumnaam == null || serienummer == 0 || aantalliter == 0) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();
            boolean isexternBool = true;

            if(isextern == null) {
                isexternBool = false;
            }

            Filter f1 = new Filter(model, serienummer, isexternBool, aantalliter);

            if(user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                Aquarium a1 = eigenaar.getAquariumByName(aquariumnaam);
                if(a1.addToebehoren(f1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "toebehoren toegevoegd!")).build();
                }
                return Response.status(Response.Status.CONFLICT).entity(
                        new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
            }

            else if(user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                Aquarium a1 = beheerder.getAquariumByName(aquariumnaam);
                if(a1.addToebehoren(f1)) {
                    return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "toebehoren toegevoegd!")).build();
                }
                return Response.status(Response.Status.CONFLICT).entity(
                        new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
            }

        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
        }
        return Response.status(Response.Status.CONFLICT).entity(
                new AbstractMap.SimpleEntry<>("resultaat", "toebehoren niet toegevoegd")).build();
    }
}
