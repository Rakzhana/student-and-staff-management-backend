package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Staff;
import com.example.studentmanagement.repository.StaffRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    @Autowired
    private StaffRepository repo;

    public Staff createStaff(Staff staff){
        return repo.save(staff);
    }

    public List<Staff> getAllStaff(){
        return repo.findAll();
    }

    public Optional<Staff> getStaffById(String id){
        return repo.findById(id);
    }

}
