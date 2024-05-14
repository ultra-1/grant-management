package com.temelio.gms.repo;

import com.temelio.gms.entity.Foundation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FoundationRepo extends CrudRepository<Foundation, Integer> {
}
