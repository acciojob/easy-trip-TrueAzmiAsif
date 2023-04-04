package com.driver.Services;

import com.driver.Repository.FlightRepo;
import com.driver.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    FlightRepo fr;
    public double shortDuration(City fc, City tc){
        return fr.shortD(fc,tc);
    }
}
