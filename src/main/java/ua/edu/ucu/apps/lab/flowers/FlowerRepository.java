package ua.edu.ucu.apps.lab.flowers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
