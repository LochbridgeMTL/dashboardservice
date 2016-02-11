package com.example.dashboardservice.api;


import com.example.dashboardservice.data.PieChartData;

import java.util.List;

public interface DashBoardServiceDAO {
    void putPieChartData(PieChartData pieChartData);
    void putPieChartDataList(List<PieChartData> pieChartData);
    void putPieChartData(String pieChartData);
    String getPieChartData();

}
