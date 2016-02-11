package com.example.dashboardservice.core;

import com.example.dashboardservice.api.DashBoardServiceDAO;
import com.example.dashboardservice.data.PieChartData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kzhao on 2/11/16.
 */
public class DashBoardServiceBO {
    private DashBoardServiceDAO dashBoardServiceDAO;

    public DashBoardServiceBO(){
        dashBoardServiceDAO = new DashBoardServiceDAOMapDBImplementation();
    }

    public void initializeDataStore(){
        List<PieChartData> pieChartDataList = generateSamplePieChartData();
        dashBoardServiceDAO.putPieChartDataList(pieChartDataList);
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
}
