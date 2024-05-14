package com.temelio.gms.repo;


import com.temelio.gms.entity.NonProfitOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonProfitOrgRepo extends JpaRepository<NonProfitOrg, Integer> {
}
