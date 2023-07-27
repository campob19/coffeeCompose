package com.coffee.kubernetes.project.firstContainer;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee,Long> {

}
