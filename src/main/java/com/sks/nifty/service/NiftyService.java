package com.sks.nifty.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NiftyService {
    public Float getNiftyPrice(){
        Random random = new Random();
        // Generates a random float between 0 and 1, then scales it to the range 100-1000
        return 250 + random.nextFloat() * (1000 - 300);
    }

    public Float getSenSexPrice(){
        Random random = new Random();
        // Generates a random float between 0 and 1, then scales it to the range 100-1000
        return  200 + random.nextFloat() * (550 - 450);
    }

    public Float getBankNifty(){
        Random random = new Random();
        // Generates a random float between 0 and 1, then scales it to the range 100-1000
        return  450 + random.nextFloat() * (550 - 450);
    }
}
