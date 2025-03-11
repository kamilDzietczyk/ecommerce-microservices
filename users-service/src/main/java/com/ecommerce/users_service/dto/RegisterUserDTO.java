package com.ecommerce.users_service.dto;

import com.ecommerce.users_service.model.UserRole;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterUserDTO {
  @NotBlank(message = "First name cannot be empty")
  @Size(min = 2, message = "First name must have at least 2 characters")
  private String firstName;

  @NotBlank(message = "Last name cannot be empty")
  @Size(min = 2, message = "Last name must have at least 2 characters")
  private String lastName;

  @NotBlank(message = "Email cannot be empty")
  @Email(message = "Invalid email format")
  private String email;

  @NotBlank(message = "Password cannot be empty")
  @Size(min = 8, message = "Password must have at least 8 characters")
  private String password;

  @NotNull(message = "User role is required")
  private UserRole role;
}
