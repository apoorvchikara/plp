package com.cg.plp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.plp.model.Product;

public interface IProduct  extends JpaRepository<IProduct, String>
{
	@Query("select p.ProductName from Product p  where p.Category=(:Category) order by p.Category")
	public List<Product> getSimilarProducts(@Param(value="Category") String category);
}
