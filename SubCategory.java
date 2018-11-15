package edu.century.finalproject.shoppingcart.bean;

import java.util.ArrayList;

public class SubCategory {
	private String name;
	private String description;
	private String image;
	private ArrayList<Catalogue> catalogueList = new ArrayList<>();

	public SubCategory(String name, String description, String image) {
		super();
		this.name = name;
		this.description = description;
		this.image = image;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ArrayList<Catalogue> getCatalogueList() {
		return catalogueList;
	}

	public void setCatalogueList(ArrayList<Catalogue> catalogueList) {
		this.catalogueList = catalogueList;
	}

	@Override
	public String toString() {
		return "SubCategory [name=" + name + ", description=" + description + ", image=" + image + ", catalogueList="
				+ catalogueList + "]";
	}

}
