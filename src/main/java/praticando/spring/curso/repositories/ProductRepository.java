package praticando.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import praticando.spring.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
