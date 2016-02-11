package com.example.dashboardservice.data;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PieChartData {
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("color")
    private String color;
    @JsonProperty("highlight")
    private String highlight;
    @JsonProperty("label")
    private String label;

    public PieChartData(Integer value, String color, String highlight, String label) {
        this.value = value;
        this.color = color;
        this.highlight = highlight;
        this.label = label;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
