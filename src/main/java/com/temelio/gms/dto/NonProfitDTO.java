package com.temelio.gms.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NonProfitDTO {

    
    private String name;

    
    private String email;

    
    private String accountId;

    
    private String address;

}
