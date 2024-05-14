package com.temelio.gms.service;

import com.temelio.gms.constants.EmailFormats;
import com.temelio.gms.dto.EmailDTO;
import com.temelio.gms.entity.Email;
import com.temelio.gms.entity.File;
import com.temelio.gms.repo.EmailRepo;
import com.temelio.gms.repo.GrantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {

    @Autowired
    private GrantRepo grantRepo;

    @Autowired
    private EmailRepo emailRepo;

    public List<EmailDTO> getEmailInfo(int foundationId, EmailFormats.EmailEvent event, String startDate, String endDate) {
            List<Email> emails = emailRepo.getEmailByFoundationIdAndNonProfitOrgIdAndEvent(foundationId, event.name());
            return null;
    }


    public String sendEmail(int foundationId,int nonProfitId, int grantId, EmailFormats.EmailEvent event, boolean resend) {
        //checkif already sent
        //get grant info, np info, foundation info
        //trigger email api
        //password?

        return null;
    }




    public String sendEmail(String fromEmail, String toEmail, String subject, String body) {
        return "";
    }

    public String sendReply(String threadId, String fromEmail, List<String> toEmails, String body) {
        return "";
    }
}
