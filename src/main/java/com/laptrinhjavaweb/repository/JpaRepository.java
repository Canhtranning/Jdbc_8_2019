package com.laptrinhjavaweb.repository;

import java.util.List;

public interface JpaRepository<T> {
List<T> findAll(int offset,int limmit,Object...objects);
}
