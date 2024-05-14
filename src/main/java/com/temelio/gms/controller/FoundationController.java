package com.temelio.gms.controller;

import com.temelio.gms.dto.FoundationDTO;
import com.temelio.gms.dto.Response;
import com.temelio.gms.service.FoundationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoundationController {

    @Autowired
    private FoundationService foundationService;

    public ResponseEntity<String> createFoundation(FoundationDTO foundationDTO) {
            Response<String> response = foundationService.createFoundation(foundationDTO);
            if(response.isSuccess())
                return new ResponseEntity<>(response.getT(), HttpStatus.OK);
            else {
                return new ResponseEntity<>(response.getT(), HttpStatus.BAD_REQUEST);
            }
    }

   /* public ResponseEntity<Response<String>> updateFoundation(FoundationDTO foundationDTO) {

    }*/

    public ResponseEntity<FoundationDTO> getFoundationData(int foundationId) {
        Response<FoundationDTO> response = foundationService.getFoundation(foundationId);
        if(response.isSuccess())
            return new ResponseEntity<>(response.getT(), HttpStatus.OK);
        else {
            return new ResponseEntity<>(response.getT(), HttpStatus.BAD_REQUEST);
        }

    }

}
