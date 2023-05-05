package com.example.demo.repository;

import com.example.demo.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepo extends JpaRepository<Grade, Long> {
    @Query(value = "SELECT ID_GRADE_SEQ.NEXTVAL FROM dual", nativeQuery = true)
    Long getNextValVeSeq();
}
