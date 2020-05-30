package nl.hu.bep.webservices;

import nl.hu.bep.model.aquarium.Aquarium;
import nl.hu.bep.model.personen.Beheerder;
import nl.hu.bep.model.personen.Eigenaar;
import nl.hu.bep.model.personen.MyUser;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/aquarium")
public class AquariumResource {

    @GET
    @RolesAllowed({"user", "admin"})
    @Path("/alleAquaria")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAlleAquaria(@Context SecurityContext context) {
        var user = (MyUser) context.getUserPrincipal();

        if (user instanceof Eigenaar) {
            var eigenaar = (Eigenaar) user;
            return Response.ok(eigenaar.getEigenAquaria()).build();
        }
        else if (user instanceof Beheerder) {
            var beheerder = (Beheerder) user;
            return Response.ok(beheerder.getEigenAquaria()).build();
        }
        return Response.status(Response.Status.CONFLICT).build();
//        System.out.println(user.getEigenaar().getVoornaam() + user.getEigenaar().getAchternaam());
    }

    @POST
    @RolesAllowed({"user","admin"})
    @Path("/addAquarium")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addAquarium(@Context SecurityContext context,
                                @FormParam("naam") String naam,
                                @FormParam("lengte") int lengte,
                                @FormParam("breedte") int breedte,
                                @FormParam("hoogte") int hoogte,
                                @FormParam("bodemsoort") String bodemsoort,
                                @FormParam("watersoort") String watersoort) {
        try {
            if (naam == null || lengte == 0 || breedte == 0 || hoogte == 0 || bodemsoort == null || watersoort == null) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var user = (MyUser) context.getUserPrincipal();
            Aquarium a1 = new Aquarium(naam, lengte, breedte, hoogte, bodemsoort, watersoort);
            if (user instanceof Eigenaar) {
                var eigenaar = (Eigenaar) user;
                if(eigenaar.addAquarium(a1)) {
                    Response.ok().build();
                }
                return Response.status(Response.Status.CONFLICT).build();
            }

            if (user instanceof Beheerder) {
                var beheerder = (Beheerder) user;
                if(beheerder.addAquarium(a1)) {
                    Response.ok().build();
                }
                return Response.status(Response.Status.CONFLICT).build();
            }
        } catch(IllegalArgumentException e){
            return Response.status(Response.Status.CONFLICT).build();
        }
        return Response.status(Response.Status.CONFLICT).build();
    }

    @DELETE
    @RolesAllowed({"user","admin"})
    @Path("/removeAquarium")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response removeAquarium(@Context SecurityContext context,
                                   @FormParam("naam") String naam) {
        try {
        if(naam == null) {
            throw new IllegalArgumentException("Voer alle velden in!");
        }
            var user = (MyUser) context.getUserPrincipal();

        if (user instanceof Eigenaar) {
            var eigenaar = (Eigenaar) user;
            eigenaar.removeAquarium(eigenaar.getAquariumByName(naam));
            return Response.ok().build();
        }

        if (user instanceof Beheerder) {
            var beheerder = (Beheerder) user;
            beheerder.removeAquarium(beheerder.getAquariumByName(naam));
            return Response.ok().build();
        }

        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).build();
        }
        return Response.status(Response.Status.CONFLICT).build();
    }
}
