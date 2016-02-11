package com.example.dashboardservice.resources;

import com.example.dashboardservice.core.DashBoardServiceBO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
    DashBoardServiceBO dashBoardServiceBO = new DashBoardServiceBO();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeting() {
        dashBoardServiceBO.initializeDataStore();
        return "What a wonderful world!";
    }
}
