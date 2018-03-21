package org.dao;

import java.util.List;

public interface BaseDao<T> {

	List<T> select(String hqlorsql,T t);
	
	void insert(T t);
	
	void update(T t);
	
	void delete(T t);
	
	
	
	
	
}
