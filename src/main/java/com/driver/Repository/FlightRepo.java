package com.driver.Repository;

import com.driver.model.City;
import com.driver.model.Flight;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class FlightRepo {
    HashMap<Integer, Flight> hm=new HashMap<>();
    public double shortD(City fc, City tc){
        double dura= Double.MAX_VALUE;
        int flag=0;
        for(int x: hm.keySet()){
            if(hm.get(x).getFromCity().equals(fc) && hm.get(x).getToCity().equals(tc)){
                flag=1;
                if(dura>hm.get(x).getDuration())dura=hm.get(x).getDuration();
            }
        }
        if(flag!=0)return dura;
        else return 0.0;
    }
}
