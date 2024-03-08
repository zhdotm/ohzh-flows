package io.github.zhdotm.ohzh.flows.core.domain.workflow;

import java.util.Collection;

/**
 * 复合工作单元流
 *
 * @author zhihao.mao
 */

public interface ICompositeWorkFlow extends IWorkFlow {

    /**
     * 获取内部工作单元流
     *
     * @return 内部工作单元流
     */
    Collection<IWorkFlow> getInnerWorkFlows();

}
