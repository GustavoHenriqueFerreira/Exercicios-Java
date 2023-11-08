package Vsconnect.senai.controllers;

import Vsconnect.senai.dtos.LoginDto;
import Vsconnect.senai.dtos.UsuarioDto;
import Vsconnect.senai.models.UsuarioModel;
import Vsconnect.senai.repositories.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Annotation para definir controller
@RequestMapping(value = "/login", produces = {"application/json"})
public class LoginController {
    @Autowired //Injeção de dependência (deixar o código desacoplado, classe que utiliza funcionalidades de outras classes)
    AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity<Object> logar(@RequestBody @Valid LoginDto dadosLogin){
        var usernamePassword = new UsernamePasswordAuthenticationToken(dadosLogin.email(), dadosLogin.senha());

        var auth = authenticationManager.authenticate(usernamePassword);

        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
