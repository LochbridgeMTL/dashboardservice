
package com.example.dashboardservice.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "label",
    "fillColor",
    "strokeColor",
    "pointColor",
    "pointStrokeColor",
    "pointHighlightFill",
    "pointHighlightStroke",
        "data"
})
public class Dataset {

    @JsonProperty("label")
    private String label;
    @JsonProperty("fillColor")
    private String fillColor;
    @JsonProperty("strokeColor")
    private String strokeColor;
    @JsonProperty("pointColor")
    private String pointColor;
    @JsonProperty("pointStrokeColor")
    private String pointStrokeColor;
    @JsonProperty("pointHighlightFill")
    private String pointHighlightFill;
    @JsonProperty("pointHighlightStroke")
    private String pointHighlightStroke;
    @JsonProperty("data")
    private List<Integer> data = new ArrayList<Integer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The fillColor
     */
    @JsonProperty("fillColor")
    public String getFillColor() {
        return fillColor;
    }

    /**
     * 
     * @param fillColor
     *     The fillColor
     */
    @JsonProperty("fillColor")
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    /**
     * 
     * @return
     *     The strokeColor
     */
    @JsonProperty("strokeColor")
    public String getStrokeColor() {
        return strokeColor;
    }

    /**
     * 
     * @param strokeColor
     *     The strokeColor
     */
    @JsonProperty("strokeColor")
    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    /**
     * 
     * @return
     *     The pointColor
     */
    @JsonProperty("pointColor")
    public String getPointColor() {
        return pointColor;
    }

    /**
     * 
     * @param pointColor
     *     The pointColor
     */
    @JsonProperty("pointColor")
    public void setPointColor(String pointColor) {
        this.pointColor = pointColor;
    }

    /**
     * 
     * @return
     *     The pointStrokeColor
     */
    @JsonProperty("pointStrokeColor")
    public String getPointStrokeColor() {
        return pointStrokeColor;
    }

    /**
     * 
     * @param pointStrokeColor
     *     The pointStrokeColor
     */
    @JsonProperty("pointStrokeColor")
    public void setPointStrokeColor(String pointStrokeColor) {
        this.pointStrokeColor = pointStrokeColor;
    }

    /**
     * 
     * @return
     *     The pointHighlightFill
     */
    @JsonProperty("pointHighlightFill")
    public String getPointHighlightFill() {
        return pointHighlightFill;
    }

    /**
     * 
     * @param pointHighlightFill
     *     The pointHighlightFill
     */
    @JsonProperty("pointHighlightFill")
    public void setPointHighlightFill(String pointHighlightFill) {
        this.pointHighlightFill = pointHighlightFill;
    }

    /**
     * 
     * @return
     *     The pointHighlightStroke
     */
    @JsonProperty("pointHighlightStroke")
    public String getPointHighlightStroke() {
        return pointHighlightStroke;
    }

    /**
     * 
     * @param pointHighlightStroke
     *     The pointHighlightStroke
     */
    @JsonProperty("pointHighlightStroke")
    public void setPointHighlightStroke(String pointHighlightStroke) {
        this.pointHighlightStroke = pointHighlightStroke;
    }

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public List<Integer> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(List<Integer> data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
