package com.example.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//create database item_service_db ;
// put this in your mysql workbench and run it before you run the application!
/*------------------------------------------------------------
create database item_service_db;
-------------------------------------------------------------- */
@SpringBootApplication
public class ItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApplication.class, args);
    }

}
