package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Staff;
import com.example.studentmanagement.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/staffmanagement")
@CrossOrigin(origins="*")

public class StaffController {

    @Autowired
    private StaffService service;

    @PostMapping
    public Staff createStaff(@RequestBody Staff staff){
        return service.createStaff(staff);
    }

    @GetMapping
    public List<Staff> getStaff(){
        return service.getAllStaff();
    }

    @GetMapping("/{id}")
    public Optional<Staff> getStaffById(@PathVariable String id){
        return service.getStaffById(id);
    }

}
