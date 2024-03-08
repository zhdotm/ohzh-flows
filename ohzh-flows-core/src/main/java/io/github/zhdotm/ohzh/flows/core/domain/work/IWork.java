package io.github.zhdotm.ohzh.flows.core.domain.work;

import io.github.zhdotm.ohzh.flows.core.enums.WorkStateEnum;
import org.jeasy.flows.work.Work;

/**
 * 工作单元
 *
 * @author zhihao.mao
 */

public interface IWork extends Work {

    /**
     * 获取工作状态
     *
     * @return 工作状态
     */
    WorkStateEnum getState();
}
