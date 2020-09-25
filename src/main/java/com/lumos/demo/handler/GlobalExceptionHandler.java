package com.lumos.demo.handler;

import com.lumos.demo.utils.CustomResult;
import com.lumos.demo.utils.CustomResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public CustomResult exception(Exception ex) {

        return CustomResultUtil.exception();
    }
}
