package com.libary.book.infra.mapper;

import com.libary.book.application.record.UserRequest;
import com.libary.book.application.record.UserResponse;
import com.libary.book.domain.entities.User;

public class UserMapper {
    public static User toEntity(UserResponse userResponse) {
        return new User(
                userResponse.id(),
                userResponse.name(),
                userResponse.email(),
                userResponse.phone(),
                userResponse.address()
        );
    }

    public static User toEntity(UserRequest userRequest) {
        return new User(
                null,
                userRequest.name(),
                userRequest.email(),
                userRequest.phone(),
                userRequest.address()
        );
    }

    public static UserResponse toResponse(User user) {
        return new UserResponse(
                user.getUserId(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getAddress(),
                null
        );
    }
}
