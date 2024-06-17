package io.buza.agency.controller.admin;

import io.buza.agency.dto.AccountDto;
import io.buza.agency.dto.response.AccountResponseDto;
import io.buza.agency.dto.response.BaseResponse;
import io.buza.agency.dto.response.ResponseCode;
import io.buza.agency.serivce.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    private final AccountService accountService;

//    public BaseResponse<List<AccountResponseDto>> account_list(@PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable) {
//
//    }

    @PostMapping("/account")
    public BaseResponse account_create_new(@RequestBody AccountDto accountDto) {
        boolean isExistAccountUsername = accountService.existsByAccountUsername(accountDto.getAccountUsername());

        if (isExistAccountUsername) {
            return BaseResponse.valueOfFailureCodeMessage(ResponseCode.SAVE_ERROR.getCode(), "Username repeat error.");
        }
        AccountResponseDto accountResponseDto = accountService.saveAccount(accountDto);
        return BaseResponse.valueOfSuccess(accountResponseDto);
    }

    @GetMapping("/account")
    public Page<AccountDto> account_list(@PageableDefault(sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable) {
        return accountService.getAccountAll(pageable);
    }

 }
