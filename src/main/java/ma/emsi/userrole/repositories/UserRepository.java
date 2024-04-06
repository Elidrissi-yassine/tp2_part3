package ma.emsi.userrole.repositories;

import ma.emsi.userrole.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByNom(String nom);
}
