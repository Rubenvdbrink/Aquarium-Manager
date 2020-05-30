package nl.hu.bep.webservices;

import nl.hu.bep.model.personen.Eigenaar;
import nl.hu.bep.model.personen.MyUser;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
        MyUser user = (Eigenaar) context.getUserPrincipal();
//        System.out.println(user.getEigenaar().getVoornaam() + user.getEigenaar().getAchternaam());
        return Response.ok(user.getEigenaar().getEigenAquaria()).build();
    }
}
