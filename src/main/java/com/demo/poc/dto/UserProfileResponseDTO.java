package com.demo.poc.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileResponseDTO implements Serializable {

  private String username;
  private String fullName;
  private String email;
  private String birthDate;
}