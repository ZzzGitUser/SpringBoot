package com.example.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.example.pojo.Result;
import com.example.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求头中的令牌（token）
        String token = request.getHeader("token");
        log.info("请求头中的令牌：{}", token);

        //判断令牌是否存在，若不存在，返回错误结果（未登录）
        if (!StringUtils.hasLength(token)) {
            log.info("token不存在");

            //创建响应结果对象
            Result respResult1 = Result.error("NOT_LOGIN");
            String json = JSONObject.toJSONString(respResult1);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(json);

            return false;   //不放行
        }

        //解析token，若解析失败，返回错误结果（未登录）
        try {
            JwtUtils.parseJwt(token);
        } catch (Exception ex) {
            log.info("令牌解析失败");

            //创建响应结果对象
            Result respResult2 = Result.error("NOT_LOGIN");
            String json2 = JSONObject.toJSONString(respResult2);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(json2);

            return false;
        }
        return true;
    }
}
