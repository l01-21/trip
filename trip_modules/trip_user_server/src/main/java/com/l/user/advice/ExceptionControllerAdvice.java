package com.l.user.advice;


import com.l.core.exception.BaseException;
import com.l.core.utils.R;
import com.l.core.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * USER 统一异常处理
 */
@Slf4j
@RestControllerAdvice
public class ExceptionControllerAdvice {

    /**
     * 业务异常
     */
    @ExceptionHandler(BaseException.class)
    public R baseExceptionHandler(BaseException ex) {
        log.error("[统一异常处理] 异常信息====>{}", ex.getMessage(), ex);
        return Result.fail(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Exception ex) {
        log.error("[统一异常处理] 异常信息====>{}", ex.getMessage(), ex);
        return Result.serverError();
    }

}
