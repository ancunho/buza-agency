package io.buza.agency.config;

import io.buza.agency.serivce.impl.BuzaUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;

@EnableWebSecurity
@EnableMethodSecurity
@Configuration
@RequiredArgsConstructor
public class SecurityConfig {

    private final BuzaUserDetailsService buzaUserDetailsService;

    @Bean
    public static BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
                .requestMatchers("/fonts");
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        CsrfTokenRequestAttributeHandler requestAttributeHandler = new CsrfTokenRequestAttributeHandler();
//        requestAttributeHandler.setCsrfRequestAttributeName("_csrf");


//        http.csrf(csrf -> csrf
//                .csrfTokenRequestHandler(requestAttributeHandler)
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//                .ignoringRequestMatchers("/","/admin/login/**", "/admin/logout", "/api/admin/admin_login_proc.do")
//        );
        http.csrf(csrf -> csrf.disable());
        http.cors(cors -> cors.disable());
        http.authorizeHttpRequests(auth -> {
            auth.requestMatchers("/error/**").permitAll();
            auth.requestMatchers("/admin/login").permitAll();
            auth.requestMatchers("/admin/logout").permitAll();
            auth.requestMatchers("/api/admin/admin_login_proc.do").permitAll();
            auth.anyRequest().authenticated();
        });
        http.formLogin(login -> {
            login.loginPage("/admin/login").permitAll();
            login.usernameParameter("username");
            login.passwordParameter("password");
        });
//        http.userDetailsService(buzaUserDetailsService);





//        http
//                .csrf(csrf -> csrf.disable())
//                .cors(cors -> cors.disable())
//                .authorizeHttpRequests(auth -> {
//                    auth.requestMatchers("/error/**").permitAll();
//                    auth.requestMatchers("/admin/login").permitAll();
//                    auth.requestMatchers("/admin/logout").permitAll();
//                    auth.anyRequest().authenticated();
//
//                })
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .formLogin(login -> login
//                        .defaultSuccessUrl("/admin", true)
//                        .loginPage("/admin/login")
//                        .loginProcessingUrl("/api/admin/admin_login_proc.do")
//                        .usernameParameter("username")
//                        .passwordParameter("password")
//                        .permitAll()
//                )
//                .logout(Customizer.withDefaults());

        return http.build();

    }

}
