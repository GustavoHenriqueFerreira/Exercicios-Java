package Vsconnect.senai.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.io.Serial;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel implements Serializable, UserDetails {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private UUID id;

    private String nome;
    private String email;
    @JsonIgnore
    private String senha;
    private String endereco;
    private String cep;

    private TipoModel tipo_usuario; // utilizando a classe do tipo de usuário

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Comparação das roles e os tipos de autorização
        switch (this.tipo_usuario) {
            case ADMIN:
                return List.of(
                        new SimpleGrantedAuthority("ROLE_ADMIN"),
                        new SimpleGrantedAuthority("ROLE_DESENVOLVEDOR"),
                        new SimpleGrantedAuthority("ROLE_CLIENTE")
                );
            case DESENVOLVEDOR:
                return List.of(
                        new SimpleGrantedAuthority("ROLE_DESENVOLVEDOR")
                );
            case CLIENTE:
                return List.of(
                        new SimpleGrantedAuthority("ROLE_CLIENTE")
                );
            default:
                return null;
        }
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override //Usado para fazer login por isso o email
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}