package com.example.dashboardservice.resources;

import com.example.dashboardservice.core.DashBoardServiceBO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/data/linechartdata.json")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LineChartDataResource {
    DashBoardServiceBO dashBoardServiceBO = new DashBoardServiceBO();

    @GET
    public String getData() {
        return dashBoardServiceBO.getLineChartData();
    }

    @POST
    public Response postData(String body){
        dashBoardServiceBO.putLineChartData(body);
        return Response.status(Response.Status.CREATED).build();
    }
}
