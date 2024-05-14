package com.temelio.gms.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class EmailDTO {

    private String fromEmail;

    private String toEmail;

    private String subject;

    private String body;

    private Map<String, String> files;

    private String toName;

}
