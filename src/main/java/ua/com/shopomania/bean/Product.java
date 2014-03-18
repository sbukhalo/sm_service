package ua.com.shopomania.bean;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Product {
	
	private int id;
	private String sku;
	private String name;
	private String description;
	private Map<String, String> attribites = new HashMap<String, String>();
	private BigDecimal price;
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSKU() {
		return sku;
	}
	public void setSKU(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setAttribute(String name, String value) {
		attribites.put(name, value);
	}
	public String getAttribute(String name) {
		return attribites.get(name);
	}
	public boolean hasAttribute(String name) {
		return attribites.containsKey(name);
	}
}
