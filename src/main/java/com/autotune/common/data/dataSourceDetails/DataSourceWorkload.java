package com.autotune.common.data.dataSourceDetails;

import com.google.gson.annotations.SerializedName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;

/**
 * DataSourceWorkload object represents the workload of a namespace, and it's associated containers
 * used to store hashmap of DataSourceContainer objects representing container metadata
 */
public class DataSourceWorkload {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceWorkload.class);
    @SerializedName("workload_name")
    private String workloadName;
    @SerializedName("workload_type")
    private String workloadType;

    /**
     * Key: Container name
     * Value: Associated DataSourceContainer object
     */
    @SerializedName("containers")
    private HashMap<String, DataSourceContainer> containersHashMap;

    public DataSourceWorkload(String workloadName, String workloadType, HashMap<String, DataSourceContainer> containers) {
        this.workloadName = workloadName;
        this.workloadType = workloadType;
        this.containersHashMap = containers;
    }

    public String getDataSourceWorkloadName() {return workloadName;}

    public String getDataSourceWorkloadType() {return workloadType;}

    public HashMap<String, DataSourceContainer> getDataSourceContainerHashMap() {
        return containersHashMap;
    }

    public void setDataSourceContainerHashMap(HashMap<String, DataSourceContainer> containers) {
        if (containers == null) {
            LOGGER.info("No containers found for workload - "+ workloadName);
        }
        this.containersHashMap = containers;
    }

    @Override
    public String toString() {
        return "DataSourceWorkload{" +
                "workload_name ='" + workloadName + '\'' +
                ", workload_type ='" + workloadType + '\'' +
                ", containers ='" + containersHashMap.toString() + '\'' +
                '}';
    }
}
