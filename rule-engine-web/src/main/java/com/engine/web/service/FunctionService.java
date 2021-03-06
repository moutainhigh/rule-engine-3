package com.engine.web.service;

import com.engine.web.vo.base.request.PageRequest;
import com.engine.web.vo.base.response.PageResult;
import com.engine.web.vo.function.*;
import lombok.SneakyThrows;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author dingqianwen
 * @date 2020/8/27
 * @since 1.0.0
 */
public interface FunctionService {
    PageResult<ListFunctionResponse> list(PageRequest<ListFunctionRequest> pageRequest);

    GetFunctionResponse get(Integer id);

    Boolean add(AddFunction addFunction);

    Class<?> functionTryCompiler(String name, String javaCode);

    Class<?> functionCompiler(String className, String javaCode);

    Boolean update(UpdateFunction updateFunction);

    Object run(RunFunction runFunction);
}
