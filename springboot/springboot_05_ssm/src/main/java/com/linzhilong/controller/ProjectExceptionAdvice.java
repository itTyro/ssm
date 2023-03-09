package com.linzhilong.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员, e对象发送给开发人员

        return new Result(null,e.getCode(),e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        return new Result(null,e.getCode(),e.getMessage());
    }

    //除了自定义异常之外,保留异常类Exception的处理,用于处理非预期异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        System.out.println("异常在这里");
        return new Result(666,null,"出现异常咯");
    }
}
