package com.digitech.test.services;

import com.digitech.test.Repository.CalculRecRepository;
import com.digitech.test.entite.CalculatedREC;
import org.springframework.stereotype.Service;

@Service
public class CalculateRecImpl implements  CalculatedRec{

   private CalculRecRepository calculRecRepository;

    @Override
    public double calculrec(CalculatedREC calculatedREC ,double lo) {
        lo =  calculatedREC.getPremiumHt();
               return lo * 0.36;
    }
}
