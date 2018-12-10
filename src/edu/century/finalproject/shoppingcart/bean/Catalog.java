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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Catalog {
	private String name;
	private String description;
	private String imagePath;
	private String color;
	private String size;
	private int quantity;
	private double price;
	public final double PRODUCT_TAX = 0.07;
	private Date availableDate;
	private static SimpleDateFormat formatter=new SimpleDateFormat("MM dd");
	public Catalog(String name, String description, String imagePath, String color, String size, String quantity,
			String price, String availableDate) {
		super();
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.color = color;
		this.size = size;
		this.quantity = Integer.parseInt(quantity);
		this.price = Double.valueOf(price);
		try
        {
            this.availableDate = formatter.parse(availableDate);
        }
        catch (ParseException e)
        {
            this.availableDate = new Date();
        }
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPRODUCT_TAX() {
		return getPrice() * getQuantity() * PRODUCT_TAX;
	}
	
	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

	@Override
	public String toString() {
		return "Catalogue [name=" + name + ", description=" + description + ", imagePath=" + imagePath + ", color="
				+ color + ", size=" + size + ", quantity=" + quantity + ", price=" + price + ", availableDate="
				+ availableDate + "]";
	}

}
