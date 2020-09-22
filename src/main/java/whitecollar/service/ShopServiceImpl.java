package whitecollar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whitecollar.exceptions.ShopNotFoundException;
import whitecollar.model.Collar;
import whitecollar.model.Shop;
import whitecollar.repository.ICollarRepository;
import whitecollar.repository.IShopRepository;

import java.util.Date;
import java.util.List;


@Service
public class ShopServiceImpl implements IShopService  {
	
	//Utilizo los metodos de la interface IShopRepository/ICollarRepository
	//es como si instanciase
	@Autowired
	IShopRepository iShopRepository;
	@Autowired
	ICollarRepository iCollarRepository;


	@Override
	public List<Shop> listShops() {
		return iShopRepository.findAll();
	}


	@Override
	public Shop saveShop(Shop shop) {
		return iShopRepository.save(shop);
	}


	@Override
	public Shop findShop(Long id) {
		return iShopRepository.findById(id).orElseThrow(() -> new ShopNotFoundException(id));
	}

	@Override
	public List<Collar> listCollarsByShop(Long shop_id) {

		Shop myShop = iShopRepository.findById(shop_id).get();

		return iCollarRepository.findByShop(myShop);
	}

	@Override
	public Collar saveCollar(Collar collar, Long shop_id) {

		Shop myShop = iShopRepository.findById(shop_id).get();

		collar.setShop(myShop);
		collar.setDate(new Date());
		return iCollarRepository.save(collar) ;
	}

	@Override
	public void deleteShop(Long id) {
		iShopRepository.deleteById(id);
	}

	@Override
	public void deleteCollarsByShop(Long shop_id) {

		Shop myShop = iShopRepository.findById(shop_id).get();

		iCollarRepository.deleteByShop(myShop);
	}
}
