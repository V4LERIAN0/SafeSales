package sv.edu.catolica.safesales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.safesales.entities.ProductoEntity;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity,Long> {

}
