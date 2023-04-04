package com.driver.Services;

import com.driver.Repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PassengerService {
    @Autowired
    PassengerRepo pr;

    public int getCount(String city, Date d){
        return pr.getCount(city,d);
    }
}
