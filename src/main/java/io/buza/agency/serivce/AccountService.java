package io.buza.agency.serivce;


import io.buza.agency.dto.AccountDto;

import java.util.List;

public interface AccountService {

    boolean isExistsByUsername(String accountUsername);

    List<AccountDto> selectAccountAll();
}
