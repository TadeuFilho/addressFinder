package com.addressFinder.infrastructure.repository;

import com.addressFinder.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
