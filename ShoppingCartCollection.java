package edu.century.finalproject.shoppingcart.bean;

import java.util.ArrayList;

/**
 * @author Mo
 * This will hold list of catelogue when add to cart is clicked
 *
 */
public class ShoppingCartCollection {
private ArrayList<Catalogue> shoppingCartList = new ArrayList<>();

public ArrayList<Catalogue> getShoppingCartList() {
	return shoppingCartList;
}

public void setShoppingCartList(ArrayList<Catalogue> shoppingCartList) {
	this.shoppingCartList = shoppingCartList;
}


}
