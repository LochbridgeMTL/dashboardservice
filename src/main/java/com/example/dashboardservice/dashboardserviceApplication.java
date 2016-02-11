package com.example.dashboardservice;

import com.example.dashboardservice.resources.HelloResource;
import com.example.dashboardservice.resources.PieChartDataResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dashboardserviceApplication extends Application<dashboardserviceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dashboardserviceApplication().run(args);
    }

    @Override
    public String getName() {
        return "dashboardservice";
    }

    @Override
    public void initialize(final Bootstrap<dashboardserviceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dashboardserviceConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HelloResource());
        environment.jersey().register(new PieChartDataResource());

    }

}
