package com.libary.book.application.service;

import com.libary.book.application.record.UserResponse;
import com.libary.book.domain.entities.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<UserResponse> createUser(UserResponse userResponse);
    Flux<UserResponse> findAllUsers();
    Mono<UserResponse> updateUser(Long userId, User userResponse);
}
