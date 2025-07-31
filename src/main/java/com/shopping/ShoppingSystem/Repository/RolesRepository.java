package com.shopping.ShoppingSystem.Repository;

import com.shopping.ShoppingSystem.Model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Long> {
    Roles findByName(String name);

}