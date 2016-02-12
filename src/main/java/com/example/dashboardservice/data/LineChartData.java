
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
    "labels",
    "datasets"
})
public class LineChartData {

    @JsonProperty("labels")
    private List<String> labels = new ArrayList<String>();
    @JsonProperty("datasets")
    private List<Dataset> datasets = new ArrayList<Dataset>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The datasets
     */
    @JsonProperty("datasets")
    public List<Dataset> getDatasets() {
        return datasets;
    }

    /**
     * 
     * @param datasets
     *     The datasets
     */
    @JsonProperty("datasets")
    public void setDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
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
