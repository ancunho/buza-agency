package io.buza.agency.serivce;

import io.buza.agency.dto.AccountDto;
import io.buza.agency.dto.response.AccountResponseDto;
import io.buza.agency.entity.Account;
import io.buza.agency.repository.AccountRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.function.Function;


@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class AccountService {

    private final AccountRepository accountRepository;

    public boolean existsByAccountUsername(String accountUsername) {
        return accountRepository.existsByAccountUsername(accountUsername);
    }

    public AccountResponseDto saveAccount(AccountDto accountDto) {
        Account saveAccount = accountRepository.save(AccountDto.toEntity(accountDto));
        return AccountResponseDto.fromEntity(saveAccount);
    }

    public Page<AccountDto> getAccountAll(Pageable pageable) {
        return accountRepository.findAll(pageable).map(AccountDto::fromEntitytoDto);
    }









}
