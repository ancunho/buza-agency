package io.buza.agency.controller.admin;

import io.buza.agency.dto.AccountDto;
import io.buza.agency.dto.response.AccountResponseDto;
import io.buza.agency.dto.response.BaseResponse;
import io.buza.agency.dto.response.ResponseCode;
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
    public BaseResponse account_create_new(@RequestBody AccountDto accountDto) {
        log.info("======> {}", accountDto.toString());
        boolean checkAccountByAccountUsername = accountService.existsByAccountUsername(accountDto.getAccountUsername());

        if (checkAccountByAccountUsername) {
            return BaseResponse.valueOfFailureCodeMessage(ResponseCode.SAVE_ERROR.getCode(), "Username repeat error.");
        }
        AccountResponseDto accountResponseDto = accountService.saveAccount(accountDto);
        return BaseResponse.valueOfSuccess(accountResponseDto);
    }

 }
