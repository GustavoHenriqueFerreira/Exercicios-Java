package Vsconnect.senai.repositories;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import Vsconnect.senai.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository //annotation do repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
    UserDetails findByEmail(String email);
}
