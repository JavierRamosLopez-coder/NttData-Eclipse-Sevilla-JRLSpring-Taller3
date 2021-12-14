package com.nttdata.spring.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NttDataSpringCustomerI extends JpaRepository<NttDataSpringCustomer, Long> {


	
}
