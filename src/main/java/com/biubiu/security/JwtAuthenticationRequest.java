package com.biubiu.security;

import java.io.Serializable;

/**
 * Created by zhanghaibiao on 2017/10/12.
 */
public class JwtAuthenticationRequest implements Serializable {

    private static final long serialVersionUID = -4784900750587837297L;

    private String username;
    private String password;

    public JwtAuthenticationRequest() {
        super();
    }

    public JwtAuthenticationRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
