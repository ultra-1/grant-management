package com.temelio.gms.controller;

import com.temelio.gms.constants.EmailFormats;
import com.temelio.gms.dto.EmailDTO;
import com.temelio.gms.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailController {

    @PostMapping("")


    public ResponseEntity<String> sendMail(@RequestHeader(name = "foundationId") int foundationId, @RequestHeader(name = "nonProfitId") int nonProfitId, List<Integer> grantIds, EmailFormats.EmailEvent emailEvent) {
        // send email to list of nonprofitsreturn null

        return null;
    }



    @GetMapping("")
    public ResponseEntity<List<EmailDTO>> getMail(int foundationId, int nonProfitId) {
        //get mail by foundationid-nonProfitId
        //get all mails sent to nonprofits
        return null;
    }

}
