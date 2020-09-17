package whitecollar.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whitecollar.model.Shop;
import whitecollar.repository.IShopRepository;

import java.util.List;

@Service
public class ShopServiceImpl implements whitecollar.service.IShopService {
	
	//Utilizamos los metodos de la interface IShopRepository, es como si instaciaramos.
	@Autowired
	IShopRepository iShopRepository;
	
	@Override
	public List<Shop> listShops() {
		
		return iShopRepository.findAll();
	}


	/*
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public Cliente clienteXID(Long id) {
		
		return iClienteDAO.findById(id).get();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public void eliminarCliente(Long id) {
		
		iClienteDAO.deleteById(id);
		
	}

	 */

}
