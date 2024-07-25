package io.buza.agency.serivce;

import io.buza.agency.dto.AdminAccountDto;

public interface AdminAccountService {

    AdminAccountDto findByUsername(String username);

}
