package com.twitter.controller.dto;

public record LoginResponse(String acessToken, Long expiresIn) {
}
