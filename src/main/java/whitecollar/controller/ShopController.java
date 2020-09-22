package whitecollar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import whitecollar.model.Collar;
import whitecollar.model.Shop;
import whitecollar.service.ShopServiceImpl;

import java.util.List;

@RestController
@RequestMapping
public class ShopController {

    @Autowired
    ShopServiceImpl shopServiceImpl;

    @GetMapping("/shops") //Show all the shops
    public List<Shop> getAllShops() {

        return shopServiceImpl.listShops();
    }

    @GetMapping("/shops/{id}") //show specific shop
    public Shop shopId(@PathVariable(name="id") Long id) {

        return shopServiceImpl.findShop(id);
    }

    @PostMapping("/shops") //add a new shop
    public Shop saveShop(@RequestBody Shop shop) {

        return shopServiceImpl.saveShop(shop);
    }

    @GetMapping("/shops/{shop_id}/collars") //get collars from a shop
     public List<Collar> getCollarsByShop(@PathVariable(name="shop_id")Long shop_id) {

        return shopServiceImpl.listCollarsByShop(shop_id);
    }

    @PostMapping("/shops/{shop_id}/collars") //add collar to a shop
    public Collar saveCollar(@PathVariable(name="shop_id")Long shop_id, @RequestBody Collar collar) {

        return shopServiceImpl.saveCollar(collar, shop_id);
    }

    @DeleteMapping("/shops/{id}") //delete a shop
    public void deleteShop(@PathVariable(name="id")Long id) {

        shopServiceImpl.deleteShop(id);
    }

    @DeleteMapping("/shops/{shop_id}/collars") //delete ALL the collars from a shop
    public void deleteCollarsByShop(@PathVariable(name="shop_id")Long shop_id) {

        shopServiceImpl.deleteCollarsByShop(shop_id);
    }
}