package ua.ithillel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.ithillel.domain.Car;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findAllByManufacturer(String model);

    void deleteCarById(long id);
}
