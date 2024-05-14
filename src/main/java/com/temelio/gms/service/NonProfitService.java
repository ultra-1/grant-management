package com.temelio.gms.service;

import com.temelio.gms.dto.NonProfitDTO;
import com.temelio.gms.dto.Response;
import com.temelio.gms.entity.NonProfitOrg;
import com.temelio.gms.repo.NonProfitOrgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NonProfitService {

    @Autowired
    private NonProfitOrgRepo nonProfitOrgRepo;

    public Response<String> createNonProfitService(NonProfitDTO nonProfitDTO) {
        NonProfitOrg nonProfitOrg = NonProfitOrg.builder().name(nonProfitDTO.getName()).email(nonProfitDTO.getEmail()).address(nonProfitDTO.getAddress()).build();
        try {
            nonProfitOrgRepo.save(nonProfitOrg);
            return new Response<>("Success", true);
        }
        catch (Exception e) {
            return new Response<>("Failed, retry", false);
        }
    }

}
