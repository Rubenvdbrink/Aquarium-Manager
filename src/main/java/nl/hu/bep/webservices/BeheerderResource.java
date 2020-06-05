package nl.hu.bep.webservices;

import nl.hu.bep.model.personen.Beheerder;
import nl.hu.bep.model.personen.MyUser;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.AbstractMap;

@Path("/beheerder")
public class BeheerderResource {

    @DELETE
    @RolesAllowed("admin")
    @Path("/removeEigenaar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response removeEigenaar(@Context SecurityContext context,
                                   @FormParam("eigenaarnaam") String naam) {
        try {
            if(naam == null) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            var beheerder = (Beheerder) context.getUserPrincipal();

            if (beheerder.removeEigenaar(MyUser.getUserByUsername(naam))) {
                return Response.ok(new AbstractMap.SimpleEntry<>("resultaat", "eigenaar verwijderd!")).build();
            }
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", "eigenaar niet verwijderd")).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).entity(
                    new AbstractMap.SimpleEntry<>("resultaat", e.getMessage())).build();
        }
    }
}
