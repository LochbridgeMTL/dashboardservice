1. To build:
    mvn clean package

2. to run:
    java -jar target/dashboardservice-1.0-SNAPSHOT.jar server config.yml

3. to access the service
    http://localhost:9000/hello
                        hit this url first to initialize test data

    http://localhost:9000/data/piechartdata.json
                        GET: return the pie chart data
                        POST: set the pie chart data.


