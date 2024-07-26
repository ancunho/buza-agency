package io.buza.agency.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//@EnableWebSecurity
//@EnableMethodSecurity
@Configuration
//@RequiredArgsConstructor
public class SecurityConfig {


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
        http.authorizeHttpRequests( (requests) ->
                        requests.requestMatchers("/**").authenticated()
                                .requestMatchers("/admin/login","/admin/account").permitAll() )
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http.httpBasic(config -> config.disable());
//        http.csrf(csrf -> csrf.disable());
//        http.cors(cors -> cors.disable());
//        http.authorizeHttpRequests(auth -> {
//            auth.requestMatchers("/error/**").permitAll();
//            auth.requestMatchers("/admin/login").permitAll();
//            auth.requestMatchers("/admin/logout").permitAll();
//            auth.requestMatchers("/api/admin/admin_login_proc.do").permitAll();
//            auth.anyRequest().authenticated();
//        });
//        http.formLogin(login -> {
//            login
//                    .loginPage("/admin/login")
//                    .defaultSuccessUrl("/admin")
//                    .failureForwardUrl("/admin/login")
//                    .usernameParameter("username")
//                    .passwordParameter("password")
//                    .permitAll();
//        });
//        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//
////        http.userDetailsService(buzaUserDetailsService);
//
//
//
//
//
////        http
////                .csrf(csrf -> csrf.disable())
////                .cors(cors -> cors.disable())
////                .authorizeHttpRequests(auth -> {
////                    auth.requestMatchers("/error/**").permitAll();
////                    auth.requestMatchers("/admin/login").permitAll();
////                    auth.requestMatchers("/admin/logout").permitAll();
////                    auth.anyRequest().authenticated();
////
////                })
////                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
////                .formLogin(login -> login
////                        .defaultSuccessUrl("/admin", true)
////                        .loginPage("/admin/login")
////                        .loginProcessingUrl("/api/admin/admin_login_proc.do")
////                        .usernameParameter("username")
////                        .passwordParameter("password")
////                        .permitAll()
////                )
////                .logout(Customizer.withDefaults());
//
//        return http.build();
//
//    }

}
