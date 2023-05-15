package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query(value = "SELECT calc_masse_salariale_u(:pIdUser) FROM dual", nativeQuery = true)
    Double getMasseSalarialeUser(@Param("pIdUser") Long idUser);

    @Query(value = "SELECT pyramide_age() FROM dual", nativeQuery = true)
    Double getPyramideAge();

    @Query(value = "SELECT salaire_moyen() FROM dual", nativeQuery = true)
    Double getSalaireMoyenne();

    @Query(value = "SELECT sum_masse_salariale() FROM dual",nativeQuery = true)
    Double getSumSalaireMoy();
}
