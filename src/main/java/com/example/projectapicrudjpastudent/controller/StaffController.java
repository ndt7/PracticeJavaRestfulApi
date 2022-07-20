package com.example.projectapicrudjpastudent.controller;

import com.example.projectapicrudjpastudent.dto.StaffDTO;
import com.example.projectapicrudjpastudent.entity.StaffEntity;
import com.example.projectapicrudjpastudent.services.impl.StaffServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StaffController {

    final StaffServices staffServices;

    public StaffController(StaffServices staffServices) {
        this.staffServices = staffServices;
    }


    @GetMapping("/staff")
    public List<StaffDTO> getStaff() {
        List<StaffDTO> staffDTOs= new ArrayList<>();
        staffDTOs = staffServices.getList();
        return staffDTOs;
    }

    @PutMapping("/staff")
    public StaffDTO putStaff(@RequestBody StaffDTO staffDTO) {
        staffServices.save(staffDTO);
        return staffDTO;
    }

    @PostMapping("/staff")
    public StaffDTO postStaff(@RequestBody StaffDTO staffDTO) {
        staffServices.save(staffDTO);
        return staffDTO;
    }

    @DeleteMapping("/staff/{id}")
    public void deleteStaff(@PathVariable("id") Long id ) {
        staffServices.delete(id);
    }
}
