package io.buza.agency.controller.admin;

import io.buza.agency.dto.AdminAccountDto;
import io.buza.agency.dto.response.BaseResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@Slf4j
public class AdminAccountController {

    @PostMapping("/admin_login_proc.do")
    public BaseResponse<AdminAccountDto> admin_login_proc(HttpServletRequest request) {
        System.out.println(">>>>>" + request.getParameter("username"));
        System.out.println(">>>>>" + request.getParameter("password"));
        return BaseResponse.valueOfSuccess();
    }

}
