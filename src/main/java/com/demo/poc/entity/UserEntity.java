package com.demo.poc.entity;

import java.io.Serializable;
import java.util.List;
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
public class UserEntity implements Serializable {

  private String password;
  private String username;
  private List<String> passwordsUsed;
  private String fullName;
  private String birthDate;
  private String email;
}
