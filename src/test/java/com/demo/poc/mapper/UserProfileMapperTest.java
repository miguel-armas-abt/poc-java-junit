package com.demo.poc.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.demo.poc.JsonFileReader;
import com.demo.poc.dto.UserProfileResponseDTO;
import com.demo.poc.entity.UserEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserProfileMapperTest {

  private static UserProfileMapper mapper;
  private static ObjectMapper objectMapper;

  @BeforeAll
  public static void init() {
    mapper = new UserProfileMapper();
    objectMapper = new ObjectMapper();
  }

  @Test
  @DisplayName("Given UserEntity, when mapping it, then returns UserProfileResponseDTO")
  public void givenUserEntity_WhenMappingIt_ThenReturnsUserProfileResponseDTO() throws JsonProcessingException {
    // Arrange
    UserEntity userEntity = JsonFileReader.readObjectFromFile("mocks/UserEntity.json", new TypeReference<>() {});

    UserProfileResponseDTO expectedProfileResponse = JsonFileReader.readObjectFromFile("mocks/UserProfileResponseDTO.json", new TypeReference<>() {});
    String expected = objectMapper.writeValueAsString(expectedProfileResponse);

    //Act
    UserProfileResponseDTO actualProfileResponse = mapper.toResponseDTO(userEntity);
    String actual = objectMapper.writeValueAsString(actualProfileResponse);

    //Assert
    assertEquals(expected, actual);

  }

}