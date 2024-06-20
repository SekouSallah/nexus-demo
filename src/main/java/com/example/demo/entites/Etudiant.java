package com.example.demo.entites;

public class Etudiant {
    private Long id;
    private String firstName;
    private String lastName;
    private String filiere;

    public Etudiant(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
