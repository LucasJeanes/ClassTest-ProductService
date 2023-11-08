package ie.atu.classtestproductservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private WarehouseConnection warehouseConnection;

    @Autowired
    public ProductController(WarehouseConnection warehouseConnection) {
        this.warehouseConnection = warehouseConnection;
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Products products) {
        if(warehouseConnection.capacityAvailable() == true) {
            String confirmMsg = "Product Added";
            return confirmMsg;
        }
        else {
            String errorMsg = "No space available to add Product";
            return errorMsg;
        }
    }

    @PostMapping("/getProductById")
    public Products retrieveProduct(@RequestBody Products products) {
        return ProductService.getProductById(products.getProductId());
    }
}