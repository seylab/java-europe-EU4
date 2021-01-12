package day_48_collection_part_3;

import day_46_collection_part_1.Product;

import java.util.*;

public class HashSetOfProducts {

    public static void main(String[] args) {

        Set<Product> prodSet = new HashSet<>();


        prodSet.add(new Product("book", 25.99));
        prodSet.add(new Product("book", 17.99));
        prodSet.add(new Product("magazine", 7.99));

        System.out.println(prodSet.toString());

        //print each product by using for each loop
        for (Product p : prodSet) {
            System.out.println(p.getPrice());
        }

        //print each product by using forEach loop
        prodSet.forEach(p -> System.out.println(p.getName()));




    }
}
