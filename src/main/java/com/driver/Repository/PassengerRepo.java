package com.driver.Repository;

import com.driver.model.Passenger;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;

@Repository
public class PassengerRepo {
    HashMap<Integer, Passenger> hm=new HashMap<>();
    public int getCount(String city, Date d){
        int count=0;
        for(int x: hm.keySet()){
            if((hm.get(x).getFromCity().equals(city) || hm.get(x).getToCity().equals(city)) && d.equals(hm.get(x).getFlightDate())){
                count++;
            }
        }
        return count;
    }
}
