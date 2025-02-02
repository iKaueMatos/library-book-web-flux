package com.libary.book.application.usecase;

import com.libary.book.application.record.UserResponse;
import com.libary.book.application.service.UserService;
import com.libary.book.domain.entities.User;
import com.libary.book.domain.service.impl.UserServiceImpl;
import com.libary.book.infra.mapper.UserMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserUseCase {
    private final UserService userService;

    public UserUseCase(UserServiceImpl userService) {
        this.userService = userService;
    }

    public Mono<UserResponse> createUser(UserResponse userResponse) {
        return userService.createUser(userResponse);
    }

    public Flux<UserResponse> findAllUsers() {
        return userService.findAllUsers();
    }

    public Mono<UserResponse> updateUser(Long userId, UserResponse userResponse) {
        User updatedUser = UserMapper.toEntity(userResponse);
        return userService.updateUser(userId, updatedUser).map(savedUser ->
                new UserResponse(savedUser.id(), savedUser.name(), savedUser.email(), savedUser.phone(), savedUser.address(), "Usuário atualizado com sucesso")
        );
    }
}
