package io.buza.agency.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.buza.agency.dto.AccountDto;
import io.buza.agency.dto.request.BaseRequest;
import io.buza.agency.dto.response.AccountResponseDto;
import io.buza.agency.dto.response.BaseResponse;
import io.buza.agency.dto.response.ResponseCode;
import io.buza.agency.serivce.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * Create new account
     * @param accountDto
     * @return BaseResponse -> new AccountDto();
     */
    @PostMapping("/account")
    public BaseResponse account_create_new(BaseRequest baseRequest, @RequestBody AccountDto accountDto) {
        boolean isExistAccountUsername = accountService.existsByAccountUsername(accountDto.getAccountUsername());

        if (isExistAccountUsername) {
            return BaseResponse.valueOfFailureCodeMessage(ResponseCode.SAVE_ERROR.getCode(), "Username repeat error.");
        }
        AccountResponseDto accountResponseDto = accountService.saveAccount(accountDto);
        return BaseResponse.valueOfSuccess(accountResponseDto);
    }

    @GetMapping("/account")
    public ResponseEntity<Object> account_list(BaseRequest baseRequest, @PageableDefault(value = 10) Pageable page) {
        PageHelper.startPage(1, 5);
        List<AccountDto> resultList1 = accountService.getAllAccount(baseRequest);
        Page<AccountDto> resultList = accountService.list(page);
        return ResponseEntity.ok().body(resultList);
    }

 }
