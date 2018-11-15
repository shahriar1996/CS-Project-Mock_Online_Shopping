package edu.century.finalproject.shoppingcart.bean;

import java.util.ArrayList;

public class Category {

	private String name;
	private String description;
	private String imagePath;
	private ArrayList<SubCategory> subcategoryList = new ArrayList<>();

	public Category(String name, String description, String imagePath) {
		super();
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public ArrayList<SubCategory> getSubcategoryList() {
		return subcategoryList;
	}

	public void setSubcategoryList(ArrayList<SubCategory> subcategoryList) {
		this.subcategoryList = subcategoryList;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", description=" + description + ", imagePath=" + imagePath
				+ ", subcategoryList=" + subcategoryList + "]";
	}

}
