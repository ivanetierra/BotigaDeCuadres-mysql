package whitecollar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import whitecollar.model.Collar;
import whitecollar.model.Shop;

import java.util.List;

public interface ICollarRepository extends JpaRepository<Collar, Long> {
    List<Collar> findByShop(Shop shop);

    @Transactional
    void deleteByShop(Shop shop);
}


