package whitecollar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whitecollar.model.Shop;
import whitecollar.service.ShopServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {

    @Autowired
    ShopServiceImpl shopServiceImpl;

    @GetMapping("/shops")
    public List<Shop> all() {
        return shopServiceImpl.listShops();
    }
}