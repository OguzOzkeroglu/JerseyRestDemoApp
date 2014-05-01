package tr.com.oguzo.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * @author Oguz
 * @since 2014.5.1
 * 
 */

@Path("/helloREST")
public class HelloREST {
	@GET
	@Path("/{param}")
	public Response responseMessage(@PathParam("param") String param, 
			@DefaultValue("Nothin' to say") @QueryParam("value") String value) {
		String output = "Greetings from " + param + " : " + value;

		return Response.status(200).entity(output).build();
	}
}