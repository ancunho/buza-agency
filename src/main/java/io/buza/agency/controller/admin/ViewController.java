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
public class ViewController {

    @GetMapping
    public String admin_main(HttpServletRequest request) {
        log.info("Remote address::{}" ,request.getRemoteAddr());
        return "index";
    }

    /**
     * 관리자 로그인 화면
     */
    @GetMapping("/login")
    public String admin_login() {
        return "login";
    }

    /**
     * 회원 리스트 화면
     */
    @GetMapping("/account")
    public String account_list() {
        return "account/list";
    }

    /**
     * 회원 신규 생성 화면
     */
    @GetMapping("/account/create")
    public String account_create() {
        return "account/create";
    }

    /**
     * 포스트 리스트 화면
     */
    @GetMapping("/post")
    public String post_list() {
        return "post/list";
    }

    /**
     * 포스트 신규 생성 화면
     */
    @GetMapping("/post/create")
    public String post_create() {
        return "post/create";
    }

    /**
     * 포스트 편집 화면
     */
    @GetMapping("/post/modify")
    public String post_modify() {
        return "post/modify";
    }

    /**
     * 포스트 - 카테고리 관리
     * 리스트/편집 All in one page
     */
    @GetMapping("/post/category")
    public String post_category_management() {
        return "post/category";
    }

    /**
     * 포스트 - 태그 관리
     * 리스트/편집 All in one page
     */
    @GetMapping("/post/tag")
    public String post_tag_management() {
        return "post/tag";
    }



}
