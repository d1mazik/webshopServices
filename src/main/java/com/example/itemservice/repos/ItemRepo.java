package com.example.itemservice.repos;


import com.example.itemservice.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Long> {
}
