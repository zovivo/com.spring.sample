package com.spring.sample.dao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.springframework.data.domain.Page;

import com.spring.sample.util.SearchQueryTemplate;

/**
 * @author ducda referenced from CaveatEmptor project tm JBoss Hibernate version
 */
public interface GenericDAO<E, Id extends Serializable> {

	public E find(Id id) throws Exception;

	public E find(Id id, boolean lock) throws Exception;

	public List<E> findAll() throws Exception;

	public List<E> findByExample(E exampleInstance) throws Exception;

	public List<E> findByExample(E exampleInstance, String[] excludeProperty) throws Exception;

	public int count(E exampleInstance, String[] excludeProperty, boolean isLike) throws Exception;

	public int count() throws Exception;

	public int count(Criterion... criterion) throws Exception;

	public E makePersistent(E entity) throws Exception;

	public void makeTransient(E entity) throws Exception;

	public List<E> findByCriteria(Criterion... criterion) throws Exception;

	public Timestamp getSystemTimestamp() throws Exception;

	public Page<E> find(final SearchQueryTemplate searchQueryTemplate) throws Exception;

}
