package com.l.core.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 结果类
 * @param <T>
 */
@Data
@AllArgsConstructor
public class R<T> {
    private Integer code; // 状态码
    private String msg; // 消息
    private T data; // 返回数据
}
