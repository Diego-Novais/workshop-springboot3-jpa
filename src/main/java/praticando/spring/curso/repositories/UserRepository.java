package praticando.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import praticando.spring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
