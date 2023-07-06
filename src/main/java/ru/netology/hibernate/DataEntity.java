package ru.netology.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataEntity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person ivan = Person.builder().contact(Contact.builder()
                        .name("Ivan")
                        .surname("Ivanov")
                        .age(26)
                        .build())
                .phoneNumber("89269021781")
                .cityOfLiving("Moscow")
                .build();

        Person petr = Person.builder().contact(Contact.builder()
                        .name("Petr")
                        .surname("Petrov")
                        .age(37)
                        .build())
                .phoneNumber("89167811445")
                .cityOfLiving("Moscow")
                .build();

        Person aleksandr = Person.builder().contact(Contact.builder()
                        .name("Aleksandr")
                        .surname("Sidorov")
                        .age(24)
                        .build())
                .phoneNumber("89021856532")
                .cityOfLiving("Balashiha")
                .build();

    }
}
