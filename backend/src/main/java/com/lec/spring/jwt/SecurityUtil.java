package com.lec.spring.jwt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

// SecurityContext 에 유저 정보가 저장되는 시점
// Request 가 들어올 때 JwtFilter 의 doFilter 에서 저장
@Slf4j
public class SecurityUtil {

    private SecurityUtil(){ }


    public static Optional<String> getCurrentUserId(){
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("getCurrentUserId" + authentication);
        if (authentication == null || authentication.getName() == null){
            throw new RuntimeException("Security Context에 인증 정보가 없습니다.");
        }

        String username = null;
        if (authentication.getPrincipal() instanceof UserDetails spring){
            username = spring.getUsername();
        }else if (authentication.getPrincipal() instanceof String){
            username = (String) authentication.getPrincipal();
        }

        return Optional.ofNullable(username);
    }
}