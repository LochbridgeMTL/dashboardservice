package com.example.dashboardservice.resources;

import com.example.dashboardservice.core.DashBoardServiceBO;
import com.example.dashboardservice.data.PieChartData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/data/piechartdata.json")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PieChartDataResource {
    DashBoardServiceBO dashBoardServiceBO = new DashBoardServiceBO();

    @GET
    public String getData() {
        return dashBoardServiceBO.getPieChartData();
    }

    @POST
    public Response postData(String body){
        dashBoardServiceBO.putPieChartData(body);
        return Response.status(Response.Status.CREATED).build();
    }
}
