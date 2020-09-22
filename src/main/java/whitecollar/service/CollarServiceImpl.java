package whitecollar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whitecollar.model.Collar;
import whitecollar.repository.ICollarRepository;
import whitecollar.repository.IShopRepository;

import java.util.List;

@Service
public class CollarServiceImpl implements ICollarService {

    @Autowired
    ICollarRepository iCollarRepository;

    @Override
    public List<Collar> listCollars() {
        return iCollarRepository.findAll();
    }

}
