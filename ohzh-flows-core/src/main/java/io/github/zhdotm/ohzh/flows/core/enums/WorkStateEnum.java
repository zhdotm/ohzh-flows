package io.github.zhdotm.ohzh.flows.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 工作状态
 *
 * @author zhihao.mao
 */

@AllArgsConstructor
public enum WorkStateEnum {

    /**
     * 工作状态
     */
    SUCCESS("success", "成功"),
    FAIL("fail", "失败"),
    ;

    /**
     * 编码
     */
    @Getter
    private final String code;

    /**
     * 描述
     */
    @Getter
    private final String description;
}
