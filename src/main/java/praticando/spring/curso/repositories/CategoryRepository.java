package praticando.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import praticando.spring.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
