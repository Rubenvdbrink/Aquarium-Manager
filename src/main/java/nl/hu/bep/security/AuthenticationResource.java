package nl.hu.bep.security;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import nl.hu.bep.model.personen.Eigenaar;
import nl.hu.bep.model.personen.MyUser;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.security.Key;
import java.util.AbstractMap.SimpleEntry;
import java.util.Calendar;

@Path("/authentication")
public class AuthenticationResource {
    final public static Key key = MacProvider.generateKey();

    private String createToken(String username, String role) throws JwtException {
        Calendar expiration = Calendar.getInstance();
        expiration.add(Calendar.MINUTE, 30);

        return Jwts.builder()
                .setSubject(username)
                .setExpiration(expiration.getTime())
                .claim("role", role)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
    }

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response authenticateUserByPassword(@FormParam("username") String username,
                                               @FormParam("password") String password) {
//        System.out.println(username);
//        System.out.println(password);
        try {
            String role = MyUser.validateLogin(username, password);
//            System.out.println(role + "\n");
            if (role == null) {
                throw new IllegalArgumentException();
            }
            String token = createToken(username, role);

            SimpleEntry<String, String> JWT = new SimpleEntry<>("JWT", token);
            return Response.ok(JWT).build();
        } catch (JwtException | IllegalArgumentException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response registerEigenaar(@FormParam("username") String username,
                               @FormParam("password") String password,
                               @FormParam("voornaam") String voornaam,
                               @FormParam("achternaam") String achternaam) {
        try {
            if (username == null || password == null || voornaam == null || achternaam == null) {
                throw new IllegalArgumentException("Voer alle velden in!");
            }
            new Eigenaar(username,password,voornaam,achternaam);
            String role = MyUser.validateLogin(username, password);
            String token = createToken(username, role);
            SimpleEntry<String, String> JWT = new SimpleEntry<>("JWT", token);
            return Response.ok(JWT).build();

        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }
}
