package simflow.praycard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import simflow.praycard.domain.Pray;


import java.util.List;

public interface PrayRepository extends JpaRepository<Pray, Long> {

    @Query("SELECT p From Pray p ORDER BY p.id DESC")
    List<Pray> findAllDesc();
}
