package com.example.dashboardservice.db;

import org.mapdb.DB;
import org.mapdb.DBMaker;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentNavigableMap;

public enum MapDBManager {
    INSTANCE;

    private static ConcurrentNavigableMap<String,String> dataMap;

    private MapDBManager(){}

    public void initialize(){
        if (dataMap == null){
            DB db = DBMaker.newMemoryDB().transactionDisable().closeOnJvmShutdown().make();
            dataMap = db.getTreeMap("testMap");
        }
    }

    public void put(String key, String value){
        dataMap.put(key, value);
    }

    public String get(String key){
        return dataMap.get(key);
    }

    public void remove(String key, String value){
        dataMap.remove(key, value);
    }

}
