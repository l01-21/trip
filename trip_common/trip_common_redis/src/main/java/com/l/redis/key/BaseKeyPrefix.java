package com.l.redis.key;

import lombok.Setter;

import java.util.concurrent.TimeUnit;

/**
 * Redis key 基础前缀类
 */
@Setter
public abstract class BaseKeyPrefix implements KeyPrefix{

    protected String prefix; // 前缀
    protected Long timeout; // 超时时间
    protected TimeUnit timeUnit; // 时间单位

    protected BaseKeyPrefix(String prefix) {
        this(prefix, -1L, null);
    }
    protected BaseKeyPrefix(String prefix, Long timeout, TimeUnit timeUnit) {
        this.prefix = prefix;
        this.timeout = timeout;
        this.timeUnit = timeUnit;
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public Long getTimeout() {
        return timeout;
    }

    @Override
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }
}
