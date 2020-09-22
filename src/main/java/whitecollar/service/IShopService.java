package whitecollar.service;

import whitecollar.model.Collar;
import whitecollar.model.Shop;

import java.util.List;

public interface IShopService {

	//Metodos del CRUD shop
	public List<Shop> listShops(); //Listar All

	public Shop saveShop(Shop shop);	//Guarda un cliente CREATE

	public Shop findShop(Long id); //Leer datos de un cliente READ

	public void deleteShop(Long id);// Elimina el cliente DELETE

	public Collar saveCollar(Collar collar, Long shop_id);	//Guarda un collar CREATE

	public List<Collar> listCollarsByShop(Long shop_id);

	public void deleteCollarsByShop(Long shop_id);

}
