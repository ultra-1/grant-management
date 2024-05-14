package com.temelio.gms.repo;

import com.temelio.gms.entity.Grant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrantRepo extends JpaRepository<Grant, Integer> {
}