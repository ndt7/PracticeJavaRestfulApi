package com.example.projectapicrudjpastudent.services.impl;

import com.example.projectapicrudjpastudent.converter.StaffConvert;
import com.example.projectapicrudjpastudent.dto.StaffDTO;
import com.example.projectapicrudjpastudent.entity.StaffEntity;
import com.example.projectapicrudjpastudent.repository.StaffRepository;
import com.example.projectapicrudjpastudent.services.IStaffService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServices implements IStaffService {

    final StaffRepository staffRepository;

    final StaffConvert staffConvert;

    public StaffServices(StaffRepository staffRepository, StaffConvert staffConvert) {
        this.staffRepository = staffRepository;
        this.staffConvert = staffConvert;
    }


    @Override
    public StaffDTO save(StaffDTO staffDTO) {
        StaffEntity staffEntity;
        if (staffDTO.getIdStaff() != null) {   // da co roi
            StaffEntity oldStaffEntity = staffRepository.findOneByIdStaff(staffDTO.getIdStaff());  // tim trong csdl
            staffEntity = staffConvert.toStaffEntity(staffDTO, oldStaffEntity); // update
        } else {    // neu chua co
            staffEntity = staffConvert.toStaffEntity(staffDTO);  // tao moi
        }
        staffEntity = staffRepository.save(staffEntity);  // luu Entity
        return staffConvert.toStaffDTO(staffEntity);
    }

    @Override
    public void delete(Long id) {
        staffRepository.removeStaffEntityByIdStaff(id);
    }

    @Override
    public void update(StaffDTO staffDTO) {

    }

    @Override
    public List<StaffDTO> getList() {
        List<StaffEntity> staffEntity = staffRepository.findAll();
        List<StaffDTO> staffDTOS = staffConvert.toStaffDTO(staffEntity);
        return staffDTOS;
    }


}
/// chi thao tac voi DTO