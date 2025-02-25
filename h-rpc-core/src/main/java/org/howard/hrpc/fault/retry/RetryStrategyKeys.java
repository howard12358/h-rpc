package org.howard.hrpc.fault.retry;

/**
 * 重试策略键名常量
 *
 * @Author <a href="https://github.com/howard12358">HowardLiu</a>
 */
public interface RetryStrategyKeys {
    /**
     * 不重试
     */
    String NO = "no";

    /**
     * 固定时间间隔
     */
    String FIXED_INTERVAL = "fixedInterval";
}
