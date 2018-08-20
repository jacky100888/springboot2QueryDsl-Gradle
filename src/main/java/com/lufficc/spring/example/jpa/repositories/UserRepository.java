package com.lufficc.spring.example.jpa.repositories;

import com.lufficc.spring.example.jpa.models.QUser;
import com.lufficc.spring.example.jpa.models.User;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long>, QuerydslBinderCustomizer<QUser> {
    default void customize(QuerydslBindings bindings, QUser user) {
    }
}
