package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.AdminProductDao;
import com.itheima.domain.Category;
import com.itheima.domain.Product;

public class AdminProductService {

	public List<Product> findProductList() throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductList();
	}

	public List<Category> readCategoryList() throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.readCategoryList();
	}

	public void addProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.addProduct(product);
	}

	public void delProduct(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.delProduct(pid);
	}

	public Product findProduct(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProduct(pid);
	}

	public void updateProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.updateProduct(product);
	}
	
	

}
