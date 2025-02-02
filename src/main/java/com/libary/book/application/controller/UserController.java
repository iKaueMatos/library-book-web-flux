package com.libary.book.application.controller;

import com.libary.book.application.record.UserResponse;
import com.libary.book.application.usecase.UserUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserUseCase userUseCase;

    public UserController(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<UserResponse> createUser(@RequestBody UserResponse userResponse) {
        return userUseCase.createUser(userResponse);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<UserResponse> findAll() {
        return userUseCase.findAllUsers();
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<UserResponse> updateUser(@PathVariable Long userId, @RequestBody UserResponse userResponse) {
        return userUseCase.updateUser(userId, userResponse);
    }
}
