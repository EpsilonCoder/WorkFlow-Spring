package sn.gainde2000.demo.security.dto;

import javax.validation.constraints.NotEmpty;

public class LoginRequest {
    @NotEmpty(message = "{login_username_not_empty}")
    private String username;

    @NotEmpty(message = "{login_password_not_empty}")
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
                                                                                                                                                                                                                                                                                                                                                         package sn.gainde2000.demo.security.dto;

import javax.validation.constraints.NotEmpty;

public class LoginRequest {
    @NotEmpty(message = "{login_username_not_empty}")
    private String username;

    @NotEmpty(message = "{login_password_not_empty}")
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
