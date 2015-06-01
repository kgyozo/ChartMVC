package orders.db;

import java.util.List;

import orders.Order;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String>, OrderOperations {
	List<Order> findByCustomer(String c);
	List<Order> findByCustomerLike(String c);
	List<Order> findByCustomerAndType(String c, String t);
	List<Order> findByCustomerLikeAndType(String c, String t);
}
