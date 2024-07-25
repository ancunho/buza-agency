package io.buza.agency.serivce.impl;

import io.buza.agency.dto.AdminAccountDto;
import io.buza.agency.repository.BtAdminAccountRepository;
import io.buza.agency.serivce.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAccountServiceImpl implements AdminAccountService {

    @Autowired
    private BtAdminAccountRepository adminAccountRepository;

    @Override
    public AdminAccountDto findByUsername(String username) {
        return adminAccountRepository.findByUsername(username);
    }
}
