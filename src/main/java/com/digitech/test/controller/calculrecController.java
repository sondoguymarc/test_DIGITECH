package com.digitech.test.controller;

import com.digitech.test.entite.CalculatedREC;
import com.digitech.test.services.CalculatedRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculrecController {

    @GetMapping(path = "/rec")
    public double calculrec(CalculatedREC calculatedREC ,double lo) {
        lo =  calculatedREC.getPremiumHt();
        return lo * 0.36;
    }
}

