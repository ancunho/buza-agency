package io.buza.agency.controller.admin;

import io.buza.agency.dto.AccountDto;
import io.buza.agency.dto.response.AccountResponseDto;
import io.buza.agency.entity.Account;
import io.buza.agency.serivce.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/account")
    public ResponseEntity<AccountResponseDto> account_create_new(@RequestBody AccountDto accountDto) {
        log.info("======> {}", accountDto.toString());
        AccountResponseDto saveAccount = accountService.saveAccount(accountDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveAccount);
    }

 }
