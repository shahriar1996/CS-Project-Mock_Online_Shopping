package edu.century.finalproject.shoppingcart.bean;

import java.util.ArrayList;

public class CategoryCollection {

	ArrayList<Category> categoryList = new ArrayList<>();

	public ArrayList<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList<Category> category) {
		this.categoryList = category;
	}

	@Override
	public String toString() {
		return "CategoryCollection [categoryList=" + categoryList + "]";
	}

}
