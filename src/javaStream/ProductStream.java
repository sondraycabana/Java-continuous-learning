//package javaStream;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProductStream {
//
//    public static  void main(String...args) {
//
//        List<Product> productList = new ArrayList<Product>();
//
//        productList.add(new Product(1, "Eva water", 1200));
//        productList.add(new Product(2, "Cabana water", 2000));
//        productList.add(new Product(3, "Ray water", 1500));
//        productList.add(new Product(4, "Boku water", 1700));
//
//        List<Float> productPriceList = new ArrayList<Float>();
//
//        for(Product product: productList){
//            if(product.productPrice < 1700){
//                productPriceList.add(product.productPrice);
//            }
//        }
//        System.out.println(productPriceList);
//    }
//}







package javaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductStream {

    public static  void main(String...args) {

       List<Product> productList = new ArrayList<>();

       productList.add(new Product(1, "Shola bread", 1200));
        productList.add(new Product(2, "Laide bread", 1500));
        productList.add(new Product(1, "Bola bread", 2000));
        productList.add(new Product(1, "Cabana bread", 5000));


        List<Float> productPrice = productList.stream().filter( x -> x.productPrice > 1500)
                .map(x -> x.productPrice).collect(Collectors.toList());

        System.out.println(productPrice);

    }
}






