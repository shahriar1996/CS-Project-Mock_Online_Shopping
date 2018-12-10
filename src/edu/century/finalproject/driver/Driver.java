package edu.century.finalproject.driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import edu.century.finalproject.shoppingcart.bean.Catalog;
import edu.century.finalproject.shoppingcart.bean.Category;
import edu.century.finalproject.shoppingcart.bean.SubCategory;
import edu.century.finalproject.shoppingcart.collections.CategoryCollection;
import edu.century.finalproject.shoppingcart.gui.CSCIShoppingCartGui;

public class Driver
{
    // Inside the main method
    public static void main(String[] args) throws IOException
    {
        // Below will read category.csv to ready categories into category collection.
        CategoryCollection categoryCollection = new CategoryCollection();
        try (BufferedReader br = new BufferedReader(new FileReader("Category.csv")))
        {
            String sCurrentLine;
            sCurrentLine = br.readLine();
            while ((sCurrentLine = br.readLine()) != null)
            {
                // split will split line in csv into string array.
                String[] categoryArray = sCurrentLine.split(",");
                Category category = new Category(categoryArray[0], categoryArray[1], categoryArray[2]);
                categoryCollection.getCategoryBag().add(category);
            }
        }
        // Reading subcategory csv into subcategory object and add it to category in category collection.
        try (BufferedReader br = new BufferedReader(new FileReader("SubCategory.csv")))
        {
            String sCurrentLine;
            sCurrentLine = br.readLine();
            while ((sCurrentLine = br.readLine()) != null)
            {
                // split will split line in csv into string array.
                String[] subcategoryArray = sCurrentLine.split(",");
                SubCategory subcategory = new SubCategory(subcategoryArray[0], subcategoryArray[1], subcategoryArray[2]);
                for (int i = 0; i < categoryCollection.getCategoryBag().size(); i++)
                {
                    Category category = categoryCollection.getCategoryBag().get(i);
                    if (category.getName().equals(subcategoryArray[3]))
                    {
                        category.getSubcategoryBag().add(subcategory);
                    }
                }
            }
        }

        // Reading subcategory csv into subcategory object and add it to category in category collection.
        try (BufferedReader br = new BufferedReader(new FileReader("Catalog.csv")))
        {
            String sCurrentLine;
            sCurrentLine = br.readLine();
            while ((sCurrentLine = br.readLine()) != null)
            {
                // split will split line in csv into string array.
                String[] catalogArray = sCurrentLine.split(",");
                Catalog catalog = new Catalog(catalogArray[0], catalogArray[1], catalogArray[2], catalogArray[3], catalogArray[4],
                        catalogArray[5], catalogArray[6], catalogArray[7]);
                for (int i = 0; i < categoryCollection.getCategoryBag().size(); i++)
                {
                    Category category = categoryCollection.getCategoryBag().get(i);
                    for (int j = 0; j < category.getSubcategoryBag().size(); j++)
                    {
                        SubCategory subCategory = category.getSubcategoryBag().get(j);
                        if (subCategory.getName().equals(catalogArray[8]))
                        {
                            subCategory.getCatalogBag().add(catalog);
                        }
                    }
                }
            }
        }
        CSCIShoppingCartGui cSCIShoppingCartGui = new CSCIShoppingCartGui("CSCI Mock Online Shopping", categoryCollection);
        cSCIShoppingCartGui.showGui();
    }
}
