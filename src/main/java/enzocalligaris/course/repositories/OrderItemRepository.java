package enzocalligaris.course.repositories;

import enzocalligaris.course.entities.OrderItem;
import enzocalligaris.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}