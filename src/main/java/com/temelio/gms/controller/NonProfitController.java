package com.temelio.gms.controller;

import com.temelio.gms.dto.FoundationDTO;
import com.temelio.gms.dto.NonProfitDTO;
import com.temelio.gms.dto.Response;
import com.temelio.gms.service.NonProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NonProfitController {

    @Autowired
    private NonProfitService nonProfitService;


    @PostMapping("/nonprofit")
    public ResponseEntity<String> createNonProfit(NonProfitDTO nonProfitDTO) {
        Response<String> response = nonProfitService.createNonProfitService(nonProfitDTO);
        if(response.isSuccess())
            return new ResponseEntity<>(response.getT(), HttpStatus.OK);
        else {
            return new ResponseEntity<>(response.getT(), HttpStatus.BAD_REQUEST);
        }
    }

   /* public ResponseEntity<Response<String>> updateFoundation(FoundationDTO foundationDTO) {

    }*/

 /*   public ResponseEntity<NonProfitDTO> getNonProfit(int nonProfitId) {
        Response<FoundationDTO> response = nonProfitService.(foundationId);
        if(response.isSuccess())
            return new ResponseEntity<>(response.getT(), HttpStatus.OK);
        else {
            return new ResponseEntity<>(response.getT(), HttpStatus.BAD_REQUEST);
        }

    }*/

}
