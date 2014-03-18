package ua.com.shopomania.bean;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProductSearchCriterias {

	private String queryString;
	private Map<String, String> attributes = new HashMap<String, String>();
	private int regionId;
	private int distance;
	private BigDecimal minPrice;
	private BigDecimal maxPrice;
	private boolean inStockOnly;
	private boolean promotionalOnly;
	private boolean newOnly;
	private boolean commentedOnly;
	
	private Order order = Order.PRICE_ASC;
	private int cursorStartPosition;
	private int resultSetLength;
	
	
	public enum Order {
		PRICE_ASC, 
		PRICE_DESC,
		RATING, 
		DISTANCE
		}


	public String getQueryString() {
		return queryString;
	}


	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	
	public Map<String, String> getAllAttributes() {
		return attributes;
	}
	
	public String getAttribute(String name) {
		return attributes.get(name);
	}
	
	public void setAttribute(String name, String value) {
		attributes.put(name, value);
	}
	
	public BigDecimal getMinPrice() {
		return minPrice;
	}


	public BigDecimal getMaxPrice() {
		return maxPrice;
	}
	
	public void setPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
	}
	
	public boolean isPriceRangeEnabled() {
		return minPrice.compareTo(maxPrice) < 0;
	}


	public int getRegionId() {
		return regionId;
	}


	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public boolean isInStockOnly() {
		return inStockOnly;
	}


	public void setInStockOnly(boolean inStockOnly) {
		this.inStockOnly = inStockOnly;
	}


	public boolean isPromotionalOnly() {
		return promotionalOnly;
	}


	public void setPromotionalOnly(boolean promotionalOnly) {
		this.promotionalOnly = promotionalOnly;
	}


	public boolean isNewOnly() {
		return newOnly;
	}


	public void setNewOnly(boolean newOnly) {
		this.newOnly = newOnly;
	}


	public boolean isCommentedOnly() {
		return commentedOnly;
	}


	public void setCommentedOnly(boolean commentedOnly) {
		this.commentedOnly = commentedOnly;
	}

	
	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public int getCursorStartPosition() {
		return cursorStartPosition;
	}


	public int getResultSetLength() {
		return resultSetLength;
	}
	
	public void setResultSetLimit(int cursorStartPosition, int resultSetLength) {
		this.cursorStartPosition = cursorStartPosition;
		this. resultSetLength = resultSetLength;
	}
	
}
