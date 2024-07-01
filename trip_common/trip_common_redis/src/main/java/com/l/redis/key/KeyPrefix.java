package com.l.redis.key;

import java.util.concurrent.TimeUnit;

/**
 * Redis key 通用规范设计
 */
public interface KeyPrefix {
    /**
     * redis key 前缀
     */
    String getPrefix();

    /**
     * redis key 超时时间 -1 表示永不过期
     */
    default Long getTimeout() {return -1L;}

    /**
     * redis key 超时单位
     */
    default TimeUnit getTimeUnit() {return null;}

    /**
     * 获取完整的 key
     */
    default String fullKey(String... suffix) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append(getPrefix());

        // Arrays.stream(suffix).collect(Collectors.joining(":", "", ""));
        for (String str : suffix) {
            sb.append(":").append(str);
        }
        return sb.toString();

    }
}
