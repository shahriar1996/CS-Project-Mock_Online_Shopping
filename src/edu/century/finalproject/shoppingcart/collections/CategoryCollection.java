package edu.century.finalproject.shoppingcart.collections;

import edu.century.finalproject.shoppingcart.bean.Category;

public class CategoryCollection {

	ArrayBag<Category> categoryBag = new ArrayBag<>();

	/**
	 * @return the categoryBag
	 */
	public ArrayBag<Category> getCategoryBag() {
		return categoryBag;
	}

	/**
	 * @param categoryBag the categoryBag to set
	 */
	public void setCategoryBag(ArrayBag<Category> categoryBag) {
		this.categoryBag = categoryBag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CategoryCollection [categoryBag=" + categoryBag + "]";
	}

}
