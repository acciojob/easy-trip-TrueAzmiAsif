package com.driver.Services;

import com.driver.Repository.AirportRepo;
import com.driver.model.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {
    @Autowired
    AirportRepo obj;
    public void add(Airport ar){
        obj.add(ar);
    }
    public String getLarge(){
      return obj.getLarge();
    }
    public String getCity(String ar){
        return obj.getCity(ar);
    }
}
