package entities;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private String name;

    private String breed;

    private int age;

    private String location;
}
