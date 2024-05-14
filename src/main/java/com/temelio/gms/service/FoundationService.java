package com.temelio.gms.service;

import com.temelio.gms.dto.FoundationDTO;
import com.temelio.gms.dto.NonProfitDTO;
import com.temelio.gms.dto.Response;
import com.temelio.gms.entity.Foundation;
import com.temelio.gms.entity.NonProfitOrg;
import com.temelio.gms.repo.FoundationRepo;
import com.temelio.gms.repo.NonProfitOrgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoundationService {

    @Autowired
    private FoundationRepo foundationRepo;

    public Response<String> createFoundation(FoundationDTO foundationDTO) {
        Foundation foundation = Foundation.builder().name(foundationDTO.getName()).email(foundationDTO.getEmail()).build();
        try {
            foundationRepo.save(foundation);
            return new Response<String>("Success", true);
        }
        catch (Exception e) {
            return new Response<String>("Failed to add data, please retry", false);
        }
    }

    public Response<FoundationDTO> getFoundation(int foundationId) {
        Foundation foundation = foundationRepo.findById(foundationId).get();
        if(foundation == null) return new Response<>(null, false);
        FoundationDTO foundationDTO = FoundationDTO.builder().name(foundation.getName()).email(foundation.getEmail()).build();
        return new Response<FoundationDTO>(foundationDTO, true);
    }
}
