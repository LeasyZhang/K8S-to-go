package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class ShowIpController {

    @RequestMapping("/location")
    public ResponseEntity<String> getIpAndHost(HttpServletRequest request) {
        String ipAddr = request.getRemoteAddr();
        String host = request.getRemoteHost();
        StringBuilder builder = new StringBuilder().append(host).append(":").append(ipAddr);
        log.info("Access location api from {}", builder.toString());
        return ResponseEntity.ok(builder.toString());
    }
}
