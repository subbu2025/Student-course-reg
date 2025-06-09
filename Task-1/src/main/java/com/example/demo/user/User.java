package com.example.demo.user;

@Entity
@Table(name = "users") // Avoids conflicts with reserved keywords
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loginId; // Use Long instead of Integer

    
    private String email;

  
    private String passwd;

    // Default constructor (Required for JPA)
    public User() {
    }

    // Parameterized constructor
    public User(Long loginId, String email, String passwd) {
        this.loginId = loginId;
        this.email = email;
        this.passwd = passwd;
    }

    // Getters and Setters
    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
