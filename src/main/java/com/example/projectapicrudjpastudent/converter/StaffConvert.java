package com.example.projectapicrudjpastudent.converter;

import com.example.projectapicrudjpastudent.dto.StaffDTO;
import com.example.projectapicrudjpastudent.entity.StaffEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StaffConvert {
    ModelMapper modelMap = new ModelMapper();

    public StaffEntity toStaffEntity(StaffDTO staffDTO) {

        StaffEntity staffEntity = modelMap.map(staffDTO, StaffEntity.class);
//        StaffEntity staffEntity = new StaffEntity();
//        staffEntity.setIdStaff(staffDTO.getIdStaff());
//        staffEntity.setCompany(staffDTO.getCompany());
        return staffEntity;
    }

    public StaffEntity toStaffEntity(StaffDTO staffDTO, StaffEntity staffEntity) {
        staffEntity = modelMap.map(staffDTO, StaffEntity.class);
        return staffEntity;
    }

    public StaffDTO toStaffDTO(StaffEntity staffEntity) {
        StaffDTO staffDTO = new StaffDTO();

        staffDTO.setIdStaff(staffEntity.getIdStaff());
        staffDTO.setCompany(staffEntity.getCompany());
        return staffDTO;
    }

    public List<StaffDTO> toStaffDTO(List<StaffEntity> listStaffEntity) {
        List<StaffDTO> listStaffDTO = new ArrayList<>();
        for (StaffEntity entity : listStaffEntity) {
            StaffDTO staffDTO = new StaffDTO();

            staffDTO.setIdStaff(entity.getIdStaff());
            staffDTO.setCompany(entity.getCompany());
            staffDTO.setAddress(entity.getAddress());
            staffDTO.setUniversity(entity.getUniversity());
            staffDTO.setFullName(entity.getFullName());
            staffDTO.setYearBorn(entity.getYearBorn());
            listStaffDTO.add(staffDTO);
        }
        return listStaffDTO;
    }
}
