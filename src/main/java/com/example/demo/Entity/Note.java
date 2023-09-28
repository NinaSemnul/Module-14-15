package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Note {
    @Id
    @GeneratedValue

    private long id;
    private String title;
    private String content;

}








