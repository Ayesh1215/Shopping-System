package com.shopping.ShoppingSystem.Repository;

import com.shopping.ShoppingSystem.Model.Employee;
import com.shopping.ShoppingSystem.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByEmployee(Employee employee);
}