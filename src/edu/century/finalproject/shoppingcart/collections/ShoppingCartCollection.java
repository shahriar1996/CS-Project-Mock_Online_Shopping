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

package edu.century.finalproject.shoppingcart.collections;

import edu.century.finalproject.shoppingcart.bean.Catalog;

/**
 * @author Mo This will hold list of catelogue when add to cart is clicked
 *
 */
public class ShoppingCartCollection
{
    private ArrayBag<Catalog> shoppingCartBag = new ArrayBag<>();

    public ArrayBag<Catalog> getShoppingCartBag()
    {
        return shoppingCartBag;
    }

    public void setShoppingCartBag(ArrayBag<Catalog> shoppingCartList)
    {
        this.shoppingCartBag = shoppingCartList;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ShoppingCartCollection [shoppingCartBag=" + shoppingCartBag + "]";
    }

}
