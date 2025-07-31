package com.shopping.ShoppingSystem.Repository;

import com.shopping.ShoppingSystem.Service.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {

}

