/**
 * Author: Arif Shahriar, Alvin Madison, Mohammed Safwat
 * Instructor: Zakaria Baani 
 * CourseID: 2082.01
 * Due Date: 12/11/18
 * Final Project: Mock Online Shopping Cart
 * 
 * We made a project on mock online shopping cart where user can get in 
 * and buy electronic stuff. We had implemented add method where user
 * can add all the materials they want to buy. There is remove method
 * for deleting stuff from the cart. We had implemented a search method 
 * where user can search for products that we sell.
 */

package edu.century.finalproject.shoppingcart.bean;

import edu.century.finalproject.shoppingcart.collections.ArrayBag;

public class SubCategory {
	// Instace Variables
	private String name;
	private String description;
	private String imagePath;

	private ArrayBag<Catalog> catalogBag = new ArrayBag<>();

	// Overloaded constructor
	public SubCategory(String name, String description, String imagePath) {
		super();
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
	}

	// Getters and setters
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

	public ArrayBag<Catalog> getCatalogBag() {
		return catalogBag;
	}

	public void setCatalogueBag(ArrayBag<Catalog> catalogBag) {
		this.catalogBag = catalogBag;
	}

}
