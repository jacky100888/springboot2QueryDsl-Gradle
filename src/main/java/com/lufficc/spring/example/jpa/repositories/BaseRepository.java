package com.lufficc.spring.example.jpa.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * Convenience interface for {@link QueryDslPredicateExecutor} with
 * {@link JpaRepository}. Returns {@link List} instead of {@link Iterable}.
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable>
		extends JpaRepository<T, ID>, QuerydslPredicateExecutor<T> {
	@Override
	List<T> findAll(OrderSpecifier<?>... orders);

	@Override
	List<T> findAll(Predicate predicate);

	@Override
	List<T> findAll(Predicate predicate, OrderSpecifier<?>... orders);

	@Override
	List<T> findAll(Predicate predicate, Sort sort);
}
