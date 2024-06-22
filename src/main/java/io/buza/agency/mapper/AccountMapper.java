package io.buza.agency.mapper;

import io.buza.agency.dto.AccountDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {

    List<AccountDto> getAllAccount();

}
