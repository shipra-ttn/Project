package com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name= "USERS")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long userId;
    @Email(message = "{com.Project.notnull.email.message}")
    private String emailId;

    @NotNull(message = "{com.Project.notnull.username.message}")
    private String name;

    @NotNull(message = "{com.Project.notnull.password.message}")
    private String password;

    private Boolean isDeleted;
    private Boolean isExpired;
    private Boolean isLocked;
    private int invalidAttemptCount;
    private Date passwordUpdateDate;

    @OneToOne()
    @JoinColumn(name = "role_role_id")
    private Role role;

    public User(String name, String password, String emailId, Boolean isDeleted, Boolean isExpired, Boolean isLocked, int invalidAttemptCount, Date passwordUpdateDate) {
        this.name = name;
        this.password = password;
        this.emailId = emailId;
        this.isDeleted = isDeleted;
        this.isExpired = isExpired;
        this.isLocked = isLocked;
        this.invalidAttemptCount = invalidAttemptCount;
        this.passwordUpdateDate = passwordUpdateDate;
    }


}

