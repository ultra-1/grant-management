package com.temelio.gms.repo;

import com.temelio.gms.entity.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepo extends CrudRepository<Integer, Email> {

    public List<Email> getEmailByFoundationIdAndNonProfitOrgIdAndEvent(int foundationId, String event);
}
