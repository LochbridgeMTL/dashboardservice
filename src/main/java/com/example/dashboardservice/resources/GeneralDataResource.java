package com.example.dashboardservice.resources;

import com.example.dashboardservice.core.DashBoardServiceBO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/data/{key}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GeneralDataResource {
    DashBoardServiceBO dashBoardServiceBO = new DashBoardServiceBO();

    @GET
    public String getData(@PathParam("key") String key) {
        return dashBoardServiceBO.getData(key);
    }

    @POST
    public Response postData(@PathParam("key") String key, String body){
        dashBoardServiceBO.putData(key, body);
        return Response.status(Response.Status.CREATED).build();
    }
}
