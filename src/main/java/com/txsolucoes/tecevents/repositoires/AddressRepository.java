package com.txsolucoes.tecevents.repositoires;

import com.txsolucoes.tecevents.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
