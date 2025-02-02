package com.libary.book.domain.service.impl;

import com.libary.book.application.record.UserResponse;
import com.libary.book.application.service.UserService;
import com.libary.book.domain.entities.User;
import com.libary.book.infra.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<UserResponse> createUser(UserResponse userResponse) {
        User user = new User(null, userResponse.name(), userResponse.email(), userResponse.phone(), userResponse.address());

        return userRepository.save(user).map(savedUser ->
                new UserResponse(savedUser.getUserId(), savedUser.getName(), savedUser.getEmail(), savedUser.getPhone(), savedUser.getAddress(), "Usuário criado com sucesso")
        );
    }

    public Flux<UserResponse> findAllUsers() {
        return userRepository.findAll().map(user ->
                new UserResponse(user.getUserId(), user.getName(), user.getEmail(), user.getPhone(), user.getAddress(), null)
        );
    }

    public Mono<UserResponse> updateUser(Long userId, User updatedUser) {
        return userRepository.findById(userId)
                .flatMap(existingUser -> {
                    existingUser.setName(updatedUser.getName());
                    existingUser.setEmail(updatedUser.getEmail());
                    existingUser.setPhone(updatedUser.getPhone());
                    existingUser.setAddress(updatedUser.getAddress());

                    return userRepository.save(existingUser)
                            .map(savedUser -> new UserResponse(
                                    savedUser.getUserId(),
                                    savedUser.getName(),
                                    savedUser.getEmail(),
                                    savedUser.getPhone(),
                                    savedUser.getAddress(),
                                    "Usuário atualizado com sucesso"
                            ));
                })
                .switchIfEmpty(Mono.error(new RuntimeException("Usuário não encontrado")));
    }
}
