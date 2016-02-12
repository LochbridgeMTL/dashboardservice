package com.example.dashboardservice.data;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonUtility {
    public JsonUtility(){}

    public String getPieChartDataString(Integer value, String color, String highlight, String label)
    {
        String returnValue = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            PieChartData pieChartData = new PieChartData(value, color, highlight, label);
            returnValue = objectMapper.writeValueAsString(pieChartData);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return returnValue;
    }

    public String getPieChartDataString(PieChartData pieChartData)
    {
        String returnValue = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            returnValue = objectMapper.writeValueAsString(pieChartData);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return returnValue;
    }

    public String getListPieChartDataString(List<PieChartData> list){
        String returnValue = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            returnValue = objectMapper.writeValueAsString(list);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return returnValue;
    }

    public PieChartData getPieChartDataFromString(String dataStr) {
        PieChartData pieChartData = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            pieChartData = objectMapper.readValue(dataStr,PieChartData.class);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return pieChartData;

    }


    public String getLineChartDataString(LineChartData lineChartData)
    {
        String returnValue = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            returnValue = objectMapper.writeValueAsString(lineChartData);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return returnValue;
    }
}
