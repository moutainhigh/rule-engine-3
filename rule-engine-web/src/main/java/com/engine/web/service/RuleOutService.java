package com.engine.web.service;

import com.engine.web.vo.rule.BatchExecuteRuleRequest;
import com.engine.web.vo.rule.ExecuteRuleRequest;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author dingqianwen
 * @date 2020/8/22
 * @since 1.0.0
 */
public interface RuleOutService {

    /**
     * 执行单个规则，获取执行结果
     *
     * @param executeRuleRequest 执行规则入参
     * @return 规则执行结果
     */
    Object executeRule(ExecuteRuleRequest executeRuleRequest);

    /**
     * 批量执行多个规则(一次最多1000个)，获取执行结果
     *
     * @param batchExecuteRuleRequest 执行规则入参
     * @return 规则执行结果
     */
    Object batchExecuteRule(BatchExecuteRuleRequest batchExecuteRuleRequest);

}
