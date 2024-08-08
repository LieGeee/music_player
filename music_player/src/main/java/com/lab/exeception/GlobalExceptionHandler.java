package com.lab.exeception;

import com.lab.pojo.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        //控制台输出异常信息
            e.printStackTrace();
            //检测是否有封装好的值,这个注意头文件
            return Result.error(StringUtils.hasLength(e.getMessage())?e.getMessage():"操作失败");

    }

}
