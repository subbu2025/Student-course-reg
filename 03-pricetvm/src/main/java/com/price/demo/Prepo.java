package com.price.demo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Prepo extends JpaRepository<Pcost, Integer> {

    Optional<Pcost> findByProductid(Integer productid); 

    void deleteByProductid(Integer productid); 

}
