package io.buza.agency.serivce.impl;

import io.buza.agency.repository.BtAccountRepository;
import io.buza.agency.dto.AccountDto;
import io.buza.agency.serivce.AccountService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Getter
@Setter
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private BtAccountRepository accountRepository;

    @Override
    public boolean isExistsByUsername(String accountUsername) {
        return accountRepository.isExistsByUsername(accountUsername);
    }

    @Override
    public List<AccountDto> selectAccountAll() {
        return accountRepository.selectAccountAll();
    }
}
