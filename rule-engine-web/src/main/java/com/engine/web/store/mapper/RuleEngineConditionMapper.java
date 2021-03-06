package com.engine.web.store.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.engine.core.annotation.Param;
import com.engine.web.store.entity.RuleEngineCondition;
import com.engine.web.store.entity.RuleEngineRule;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dqw
 * @since 2020-07-14
 */
public interface RuleEngineConditionMapper extends BaseMapper<RuleEngineCondition> {

    /**
     * 统计此条件用到的所有规则
     *
     * @param conditionId 条件id
     * @return list
     */
    List<RuleEngineRule> countRule(@Param("conditionId") Integer conditionId);

}
