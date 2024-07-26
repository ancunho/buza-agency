package io.buza.agency.controller.admin;

import io.buza.agency.dto.AdminAccountDto;
import io.buza.agency.dto.response.BaseResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@Slf4j
public class AdminAccountController {

    @PostMapping("/admin_login_proc.do")
    public BaseResponse<AdminAccountDto> admin_login_proc(@RequestBody AdminAccountDto adminAccountDto, HttpServletRequest request) {
        System.out.println(">>>>>" + adminAccountDto.getUsername());
        System.out.println(">>>>>" + adminAccountDto.getPassword());
        System.out.println(">>>>>" + request.getParameter("username"));
        System.out.println(">>>>>" + request.getParameter("password"));
        return BaseResponse.valueOfSuccess();
    }

    @PostMapping("/logout.do")
    public BaseResponse<AdminAccountDto> admin_logout(HttpServletRequest request) {
        System.out.println(">>>>>" + request.getParameter("username"));
        System.out.println(">>>>>" + request.getParameter("password"));
        return BaseResponse.valueOfSuccess();
    }

}
