package com.vulinh.identity_service.mapper;

import com.vulinh.identity_service.dto.request.UserCreationRequest;
import com.vulinh.identity_service.dto.request.UserUpdateRequest;
import com.vulinh.identity_service.dto.request.response.UserResponse;
import com.vulinh.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
//define de mapstruct bt no su dung trong spring
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request); // ko co @ -> loi ben service
}
