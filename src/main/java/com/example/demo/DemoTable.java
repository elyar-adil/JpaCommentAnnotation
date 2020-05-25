package com.example.demo;

import com.example.demo.comment.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Comment("Demo table comment")
@Table(name = "demo_table")
public class DemoTable {

    @Id
    @GeneratedValue
    @Comment("ID comment")
    @Column(name = "id")
    private Integer id;

    @Comment("Value comment")
    @Column(name = "value")
    private String value;

}