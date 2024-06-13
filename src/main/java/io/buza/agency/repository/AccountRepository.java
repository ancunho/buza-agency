package io.buza.agency.repository;

import io.buza.agency.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    boolean existsByAccountUsername(String accountUsername);

}
