package com.example.projectapicrudjpastudent.repository;

import com.example.projectapicrudjpastudent.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffEntity, Long> {
    StaffEntity findOneByIdStaff(Long id);

    StaffEntity findAllByIdStaff(Long id);

    StaffEntity findAllBy();
    StaffEntity removeStaffEntityByIdStaff(Long id);

}


// len thao tac voi Entity