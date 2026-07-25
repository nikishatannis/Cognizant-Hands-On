package jwtdemo.controller;
import jwtdemo.jwt.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    private final JwtUtil jwtUtil;

    public TokenController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/")
    public String home() {
        return "JWT Demo Application";
    }

    @GetMapping("/token")
    public String getToken() {
        return jwtUtil.generateToken("user");
    }
}