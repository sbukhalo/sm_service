package ua.com.shopomania.service;

import java.util.List;

import ua.com.shopomania.bean.Product;
import ua.com.shopomania.bean.ProductSearchCriterias;

//TODO: add methods
public interface ProductService {
	
	public Product getProductById(int id);

	public List<Product> searchProduct(ProductSearchCriterias criterias);
	
}
