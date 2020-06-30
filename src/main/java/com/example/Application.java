package com.example;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;
import org.hibernate.dialect.PostgreSQL95Dialect;
import org.hibernate.id.UUIDGenerator;
import org.hibernate.internal.SessionFactoryImpl;

@TypeHint(value = {
        PostgreSQL95Dialect.class,
        SessionFactoryImpl.class,
        org.postgresql.PGProperty.class,
        UUIDGenerator.class
}, accessType = {TypeHint.AccessType.ALL_PUBLIC})
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
