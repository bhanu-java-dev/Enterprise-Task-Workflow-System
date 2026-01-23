package com.bhanu.workflow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status; // e.g., "Pending", "In Progress", "Done"

    @Enumerated(EnumType.STRING)
    private Role roleRequired; // Who can access/edit this task

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Role getRoleRequired() { return roleRequired; }
    public void setRoleRequired(Role roleRequired) { this.roleRequired = roleRequired; }
}
