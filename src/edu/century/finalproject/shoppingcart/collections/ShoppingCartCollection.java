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
