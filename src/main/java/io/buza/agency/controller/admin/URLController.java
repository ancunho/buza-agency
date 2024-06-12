package io.buza.agency.controller.admin;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/admin")
public class URLController {

    @GetMapping
    public String admin_main(HttpServletRequest request) {
        log.info("Remote address::{}" ,request.getRemoteAddr());
        return "index";
    }

    @GetMapping("/login")
    public String admin_login() {
        return "login";
    }

    @GetMapping("/account")
    public String account_list() {
        return "account/list";
    }

    @GetMapping("/account/create_new")
    public String account_create_new() {
        return "account/create_new";
    }



}
