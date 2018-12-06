package edu.century.finalproject.shoppingcart.bean;

import edu.century.finalproject.shoppingcart.collections.ArrayBag;

public class Category
{

    private String name;
    private String description;
    private String imagePath;
    private ArrayBag<SubCategory> subcategoryBag = new ArrayBag<>();

    public Category(String name, String description, String imagePath)
    {
        super();
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }


    public ArrayBag<SubCategory> getSubcategoryBag()
    {
        return subcategoryBag;
    }

    public void setSubcategoryBag(ArrayBag<SubCategory> subcategoryBag)
    {
        this.subcategoryBag = subcategoryBag;
    }

    @Override
    public String toString()
    {
        return "Category [name=" + name + ", description=" + description + ", imagePath=" + imagePath + ", subcategoryBag="
                + subcategoryBag + "]";
    }

}
