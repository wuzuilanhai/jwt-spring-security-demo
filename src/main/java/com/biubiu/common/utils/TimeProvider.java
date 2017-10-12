package com.biubiu.common.utils;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhanghaibiao on 2017/10/12.
 */
@Component
public class TimeProvider implements Serializable {

    private static final long serialVersionUID = 2249989681948952516L;

    public Date now() {
        return new Date();
    }
}
