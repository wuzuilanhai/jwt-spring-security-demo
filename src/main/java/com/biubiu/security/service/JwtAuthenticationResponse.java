package com.biubiu.security.service;

import java.io.Serializable;

/**
 * Created by zhanghaibiao on 2017/10/12.
 */
public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 6289698808935914091L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

}
