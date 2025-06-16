package ru.javamentor.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    public User() {}

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {        return id;    }
    public void setId(long id) {        this.id = id;    }
    public String getFirstname() {        return firstname;    }
    public void setFirstname(String firstname) {        this.firstname = firstname;    }
    public String getLastname() {        return lastname;    }
    public void setLastname(String lastname) {        this.lastname = lastname;    }


    @Override
    public String toString() {
        return "Пользователь [" +
                "id=" + id +
                ", Имя = " + firstname + '\'' +
                ", Фамилия = " + lastname + "]";
    }
}
