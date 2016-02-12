package com.example.dashboardservice.api;


import com.example.dashboardservice.data.LineChartData;
import com.example.dashboardservice.data.PieChartData;

import java.util.List;

public interface DashBoardServiceDAO {
    void putPieChartData(PieChartData pieChartData);
    void putPieChartDataList(List<PieChartData> pieChartData);
    void putPieChartData(String pieChartData);
    String getPieChartData();

    String getLineChartData();
    void putLineChartData(String lineChartData);

    String getData(String key);
    void putData(String key, String value);

}
