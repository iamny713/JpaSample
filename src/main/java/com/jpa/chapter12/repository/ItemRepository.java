package com.jpa.chapter12.repository;

import com.jpa.chapter11.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
