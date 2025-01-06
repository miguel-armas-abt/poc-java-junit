package com.demo.poc.mapper;

import com.demo.poc.dto.UserProfileResponseDTO;
import com.demo.poc.entity.UserEntity;
import com.demo.poc.utils.DateFormatter;
import com.demo.poc.utils.FieldObfuscator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserProfileMapper {

  public UserProfileResponseDTO toResponseDTO(UserEntity user) {
    return UserProfileResponseDTO.builder()
        .username(user.getUsername())
        .fullName(user.getFullName().toUpperCase())
        .email(FieldObfuscator.partiallyObfuscate(user.getEmail()))
        .birthDate(DateFormatter.retrieveDateDescription(user.getBirthDate()))
        .build();
  }
}