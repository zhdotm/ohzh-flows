package io.github.zhdotm.ohzh.flows.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 工作单元流状态
 *
 * @author zhihao.mao
 */

@AllArgsConstructor
public enum WorkFlowStateEnum {

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
