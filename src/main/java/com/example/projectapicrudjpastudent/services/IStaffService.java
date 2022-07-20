package com.example.projectapicrudjpastudent.services;

import com.example.projectapicrudjpastudent.dto.StaffDTO;

import java.util.List;

public interface IStaffService {
    public StaffDTO save(StaffDTO staffDTO);
    public void delete(Long id);

    public void update(StaffDTO staffDTO);

    public List<StaffDTO> getList();
}
