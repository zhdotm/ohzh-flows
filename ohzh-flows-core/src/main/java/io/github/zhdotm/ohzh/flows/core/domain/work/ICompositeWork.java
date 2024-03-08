package io.github.zhdotm.ohzh.flows.core.domain.work;

import java.util.Collection;

/**
 * 复合工作单元
 *
 * @author zhihao.mao
 */

public interface ICompositeWork extends IWork {

    /**
     * 获取内部工作单元
     *
     * @return 内部工作单元
     */
    Collection<IWork> getInnerWorks();

}
