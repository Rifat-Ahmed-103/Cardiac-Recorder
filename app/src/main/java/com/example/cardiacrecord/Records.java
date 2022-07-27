package com.example.cardiacrecord;

import java.util.ArrayList;
import java.util.List;


public class Records {
    public static ArrayList<ModelClass> mcl = new ArrayList<>();

    public void addRecord(ModelClass modelClass){
        if(mcl.contains(modelClass)){
            throw new IllegalArgumentException();
        }
        mcl.add(modelClass);
    }
}
