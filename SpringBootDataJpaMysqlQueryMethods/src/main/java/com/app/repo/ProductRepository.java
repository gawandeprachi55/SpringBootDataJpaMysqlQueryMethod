package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
@Query("select p.prodCode from com.app.model.Product p")
public List<String> getCodeOnly();
@Query("select p from com.app.model.Product p")
public List<Product> getMyData();
@Query("select p.prodCost,p.prodCode from com.app.model.Product p")
public List<Object[]> getInfo();
@Query("select p from com.app.model.Product p where p.prodId=:a or p.prodCost=:b")
public List<Product> getMyDataName(Integer a,Double b);

}
