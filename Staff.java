package com.example.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Document(collection = "staff")

    public class Staff {

        @Id
        private String id;

        private String name;
        private String department;
        private String staffId;
        private String designation;
        private String experience;

    }

