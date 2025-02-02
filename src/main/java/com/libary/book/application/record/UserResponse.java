package com.libary.book.application.record;

public record UserResponse(Long id, String name, String email, String phone, String address, String message) {
}
