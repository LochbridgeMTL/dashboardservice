package com.example.dashboardservice.core;

import com.example.dashboardservice.api.DashBoardServiceDAO;
import com.example.dashboardservice.data.Dataset;
import com.example.dashboardservice.data.LineChartData;
import com.example.dashboardservice.data.PieChartData;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.common.io.Files;

/**
 * Created by kzhao on 2/11/16.
 */
public class DashBoardServiceBO {
    private DashBoardServiceDAO dashBoardServiceDAO;

    public DashBoardServiceBO(){
        dashBoardServiceDAO = new DashBoardServiceDAOMapDBImplementation();
    }

    public void initializeDataStore(){
        File dataDir = new File(getClass().getClassLoader().getResource("data").getFile());
        String[] dataFileNames = dataDir.list();
        for (String dataFileName: dataFileNames){
            try {
                File dataFile = new File(getClass().getClassLoader().getResource("data/"+dataFileName).getFile());
                String fileContent = Files.toString(dataFile, StandardCharsets.UTF_8);
                fileContent = fileContent.replace("\n", "").replace("\r", "");
                dashBoardServiceDAO.putData(dataFileName, fileContent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /*
        List<PieChartData> pieChartDataList = generateSamplePieChartData();
        dashBoardServiceDAO.putPieChartDataList(pieChartDataList);
        */
    }

    public String getPieChartData(){
        return dashBoardServiceDAO.getPieChartData();
    }

    public void putPieChartData(PieChartData pieChartData){
        dashBoardServiceDAO.putPieChartData(pieChartData);
    }

    public void putPieChartDataList(List<PieChartData> pieChartDataList){
        dashBoardServiceDAO.putPieChartDataList(pieChartDataList);
    }

    public void putPieChartData(String data){
        dashBoardServiceDAO.putPieChartData(data);
    }

    public String getLineChartData() {
        return dashBoardServiceDAO.getLineChartData();
    }

    public void putLineChartData(String data) {
        dashBoardServiceDAO.putLineChartData(data);
    }

    private List<PieChartData> generateSamplePieChartData(){
        PieChartData pieChartData1 = new PieChartData(200, "#FF0000", "#FF5A5E", "Firestone");
        PieChartData pieChartData2 = new PieChartData(100, "#00FF00", "#5AD3D1", "Dunlop");
        PieChartData pieChartData3 = new PieChartData(100, "#FFFF00", "#FFC870", "Continental");
        PieChartData pieChartData4 = new PieChartData(135, "Teal", "Teal", "Hancook");

        List<PieChartData> pieChartDataList = new ArrayList<PieChartData>();
        pieChartDataList.add(pieChartData1);
        pieChartDataList.add(pieChartData2);
        pieChartDataList.add(pieChartData3);
        pieChartDataList.add(pieChartData4);

        return pieChartDataList;
    }

    public String getData(String key){return dashBoardServiceDAO.getData(key);}
    public void putData(String key, String value){
        dashBoardServiceDAO.putData(key, value);
    }

}
