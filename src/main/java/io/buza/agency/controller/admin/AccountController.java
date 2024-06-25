package io.buza.agency.controller.admin;

import com.github.pagehelper.PageHelper;
import io.buza.agency.dto.AccountDto;
import io.buza.agency.dto.request.BaseRequest;
import io.buza.agency.dto.response.BaseResponse;
import io.buza.agency.serivce.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
     * @param baseRequest
     * @return BaseResponse -> new AccountDto();
     */
//    @PostMapping("/account")
//    public BaseResponse account_create_new(BaseRequest baseRequest, @RequestBody AccountDto accountDto) {
//        boolean isExistAccountUsername = accountService.existsByAccountUsername(accountDto.getAccountUsername());
//
//        if (isExistAccountUsername) {
//            return BaseResponse.valueOfFailureCodeMessage(ResponseCode.SAVE_ERROR.getCode(), "Username repeat error.");
//        }
//        AccountResponseDto accountResponseDto = accountService.saveAccount(accountDto);
//        return BaseResponse.valueOfSuccess(accountResponseDto);
//    }
//
    @GetMapping("/account")
    public BaseResponse<AccountDto> account_list(BaseRequest baseRequest) throws Exception {
//        PageHelper.startPage(baseRequest.getPageNum(), baseRequest.getPageSize());
        PageHelper.startPage(baseRequest.getPageNum(), baseRequest.getPageSize());
        List<AccountDto> resultList = accountService.selectAccountAll();
        return BaseResponse.valueOfSuccessListWithPagination(resultList);
    }

 }
