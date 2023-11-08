package Vsconnect.senai.services;

import Vsconnect.senai.models.UsuarioModel;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String secret;

    private final Algorithm algoritmo = Algorithm.HMAC256(secret);

    public String gerarToken(UsuarioModel usuario) {
        try {
            String token = JWT.create()
                    .withIssuer("api-vsconnect")
                    .withSubject(usuario.getEmail())
                    .withExpiresAt(gerarValidadeToken())
                    .sign(algoritmo);

            return token;

        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro ao criar o token");
        }
    };

    private Instant gerarValidadeToken() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    };
}
