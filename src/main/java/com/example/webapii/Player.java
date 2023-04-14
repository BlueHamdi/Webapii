package com.example.webapii;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

        private String Firstname;
        private String Lastname;
        private String Email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}


