package ie.atu.classtestproductservice;

import jakarta.annotation.PostConstruct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="WarehouseConnect", url="http://localhost:8081")
public interface WarehouseConnection {

    @PostMapping ("/capacity")
    public boolean capacityAvailable();
}
