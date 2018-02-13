package com.iqmsoft;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
@Stateless
public class HelloWorldEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Hello from WildFly Swarm!").build();
	}
}