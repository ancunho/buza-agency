package io.buza.agency.serivce.impl;

import io.buza.agency.config.AdminUserDetails;
import io.buza.agency.dto.AdminAccountDto;
import io.buza.agency.exception.LoginFailException;
import io.buza.agency.serivce.AdminAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class BuzaUserDetailsService implements UserDetailsService {

    private final AdminAccountService adminAccountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminAccountDto adminAccountDto = adminAccountService.findByUsername(username);
        if (adminAccountDto == null) {
            throw new LoginFailException("아이디가 존재하지않습니다. 다시 확인해주세요.");
        }

        return new AdminUserDetails(adminAccountDto);
    }
}
