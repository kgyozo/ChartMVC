package orders.db;

import java.util.List;

import orders.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

public class OrderRepositoryImpl implements OrderOperations {

	//@Autowired
	private MongoOperations mongo;

	public List<Order> findOrdersByType(String t) {
		String type = t.equals("NET") ? "WEB" : t;
		Criteria where = Criteria.where("type").is(t);
		Query query = Query.query(where);
		return mongo.find(query, Order.class);
	}

}
