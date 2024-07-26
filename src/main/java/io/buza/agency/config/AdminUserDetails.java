package io.buza.agency.config;

import io.buza.agency.dto.AdminAccountDto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class AdminUserDetails implements UserDetails {

    private final AdminAccountDto adminAccountDto;

    public AdminUserDetails(AdminAccountDto adminAccountDto) {
        this.adminAccountDto = adminAccountDto;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }

    @Override
    public String getPassword() {
        return adminAccountDto.getPassword();
    }

    @Override
    public String getUsername() {
        return adminAccountDto.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
//        return adminAccountDto.getIsEnable();
    }
}
