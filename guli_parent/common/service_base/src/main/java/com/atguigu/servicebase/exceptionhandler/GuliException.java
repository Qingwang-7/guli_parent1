package com.atguigu.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor//生成有参构造
@NoArgsConstructor//生成无参构造
public class GuliException extends RuntimeException {

    private  Integer code;
    private String msg;
}
