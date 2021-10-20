//   w/cansu çelik


package week4;

import java.util.*;
public class Product  {
    String name;
    String desc;
    double price;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    double discountedPrice;
    String category;
    String subCategory;

    Product (String name, String desc, double price, double discountedPrice, String category, String subCategory){
        this.name=name;
        this.desc=desc;
        this.price=price;
        this.discountedPrice=discountedPrice;
        this.category=category;
        this.subCategory=subCategory;
    }

}
