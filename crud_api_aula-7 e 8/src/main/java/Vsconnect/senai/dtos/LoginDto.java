package Vsconnect.senai.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginDto(
    @NotBlank @Email(message = "O email deve estar no formato válido") String email,

    @NotBlank String senha

) {
}
