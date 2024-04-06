package ma.emsi.userrole.repositories;

import ma.emsi.userrole.entities.Role;
import ma.emsi.userrole.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByNom(String nom);
}
