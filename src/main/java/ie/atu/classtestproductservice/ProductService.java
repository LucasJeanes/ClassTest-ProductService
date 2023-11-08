package ie.atu.classtestproductservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ProductService {
    private static ArrayList productList;
    private WarehouseConnection warehouseConnection;

    public ProductService(WarehouseConnection warehouseConnection) {
        this.warehouseConnection = warehouseConnection;
    }

    public static Products addProduct(Products products) {
        productList.add(products);
        //System.out.println(products);
        return products;
    }

    public static Products getProductById(int productId) {
        return productList.stream().filter(productItem -> productItem.getProductId() == productId)
                .findFirst()
                .orElse(null);
    }
}