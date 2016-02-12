package com.example.dashboardservice.core;

import com.example.dashboardservice.api.DashBoardServiceDAO;
import com.example.dashboardservice.com.example.dashboardservice.common.Constants;
import com.example.dashboardservice.data.JsonUtility;
import com.example.dashboardservice.data.LineChartData;
import com.example.dashboardservice.data.PieChartData;
import com.example.dashboardservice.db.MapDBManager;

import java.util.List;


public class DashBoardServiceDAOMapDBImplementation implements DashBoardServiceDAO {
    private JsonUtility jsonUtility = new JsonUtility();

    public DashBoardServiceDAOMapDBImplementation(){
        MapDBManager.INSTANCE.initialize();
    }

    @Override
    public void putPieChartData(PieChartData pieChartData) {
        String data = jsonUtility.getPieChartDataString(pieChartData);
        MapDBManager.INSTANCE.put(Constants.MAPDB_KEY_PIECHARTDATA, data);
    }

    @Override
    public void putPieChartDataList(List<PieChartData> listPieChartData) {
        String data = jsonUtility.getListPieChartDataString(listPieChartData);
        MapDBManager.INSTANCE.put(Constants.MAPDB_KEY_PIECHARTDATA, data);
    }

    @Override
    public void putPieChartData(String dataStr) {
        if (dataStr != null ){
            MapDBManager.INSTANCE.put(Constants.MAPDB_KEY_PIECHARTDATA, dataStr);
        }
    }

    @Override
    public String getPieChartData() {
        return MapDBManager.INSTANCE.get(Constants.MAPDB_KEY_PIECHARTDATA);
    }

    @Override
    public String getLineChartData() {
        return MapDBManager.INSTANCE.get(Constants.MAPDB_KEY_LINECHARTDATA);
    }

    @Override
    public void putLineChartData(String lineChartData) {
        if (lineChartData != null ){
            MapDBManager.INSTANCE.put(Constants.MAPDB_KEY_LINECHARTDATA, lineChartData);
        }
    }

    @Override
    public String getData(String key) {
        return MapDBManager.INSTANCE.get(key);
    }

    @Override
    public void putData(String key, String value) {
        MapDBManager.INSTANCE.put(key, value);
    }
}
