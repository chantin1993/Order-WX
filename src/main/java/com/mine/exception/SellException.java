package com.mine.exception;

import com.mine.enums.ResultEnum;

/**
 * Created by
 * 2017-06-11 18:55
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
