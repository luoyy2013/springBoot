package com.luoyy.studyspringboot.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SysPermission {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Column(columnDefinition="enum('menu','button')")
    private String resourceType;
    private String url;
    private String permission;
    private Long parentId;
    private String parentIds;
    private Boolean available = Boolean.FALSE;
}
