package com.example.demo;

import com.example.demo.comment.Comment;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table
@Entity
@Comment("Table comment")
public class DemoTable {
    @Id
    @GeneratedValue
    @Column
    @Comment("Identifier comment")
    private Integer id;

    @Column
    @Comment("Field comment")
    private String field;

}