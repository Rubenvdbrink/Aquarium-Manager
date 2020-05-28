package nl.hu.bep.webservices;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/aquarium")
public class AquariumResource {

    @GET
    @RolesAllowed("admin")
    @Path("/alleAquaria")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAlleAquaria() {
        return Response.ok().build();
    }
}
