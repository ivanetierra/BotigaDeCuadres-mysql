package whitecollar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import whitecollar.model.Shop;

public interface IShopRepository extends JpaRepository<Shop, Long> {
}
