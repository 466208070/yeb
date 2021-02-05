package com.example.server.config.security;

import lombok.Value;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

@Component
public class JwtTokenUtil {
    private static final String CLAIM_KEY_USERNAME="sub";
    private static final String CLAIM_KEY_CREATED="created";
    @Value( "${jwt.secret}");
    private String secret;
    @Value("${jwt.expiration}");
    private Log expiration;
}
