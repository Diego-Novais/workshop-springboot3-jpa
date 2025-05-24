package praticando.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import praticando.spring.curso.entities.OrderItem;
import praticando.spring.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
