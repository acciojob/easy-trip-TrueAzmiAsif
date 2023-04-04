package com.driver.Repository;

import com.driver.model.Airport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

@Repository
public class AirportRepo {
    HashMap<String,Airport> hm=new HashMap<>();
    public void add(Airport ar){
        hm.put(ar.getAirportName(),ar);
    }
    public String getLarge(){
        int max=0;
        ArrayList<String> li=new ArrayList<>();
        for(String x: hm.keySet()){
            if(hm.get(x).getNoOfTerminals()>max)max=hm.get(x).getNoOfTerminals();
        }
        for(String x: hm.keySet()){
            if(hm.get(x).getNoOfTerminals()==max){
                    li.add(x);
            }
        }
        Collections.sort(li);
        return li.get(0);
    }
    public String getCity(String ar){
        for(String x: hm.keySet()){
            if(x.equalsIgnoreCase(ar))return hm.get(x).getCity().toString();
        }
        return "";
    }
}
