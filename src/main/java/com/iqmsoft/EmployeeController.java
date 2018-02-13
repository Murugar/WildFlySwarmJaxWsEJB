package com.iqmsoft;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/employee")
@Stateless
public class EmployeeController {

    @PersistenceContext
    EntityManager em;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list")
    public Response list() {

        List<Employee> employees = em.createNamedQuery("Employee.findAll", Employee.class).getResultList();

        return Response.ok(employees).build();

        //return employees;
    }
}
