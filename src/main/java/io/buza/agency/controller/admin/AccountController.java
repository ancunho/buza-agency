package io.buza.agency.controller.admin;

import io.buza.agency.dto.AccountDto;
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

    @PostMapping("/account")
    public ResponseEntity<AccountDto> account_create_new(@RequestBody AccountDto accountDto) {
        log.info("======> {}", accountDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(accountDto);
    }

 }
