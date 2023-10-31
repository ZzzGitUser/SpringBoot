package com.example.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtils {
    private static String signKey = "signKey";    //签名密钥
    private static Long expire = 1000 * 60 * 60L; //有效时间（1小时）

    /**
     * 生产JWT令牌
     *
     * @param claims：JWT第二部分payload中存储的内容
     * @return
     */
    public static String genJwt(Map<String, Object> claims) {
        String jwt = Jwts.builder()
                .addClaims(claims)  //自定义信息（有效载荷）
                .signWith(SignatureAlgorithm.HS256, signKey)    //签名算法
                .setExpiration(new Date(System.currentTimeMillis() + expire))  //过期时间
                .compact();
        return jwt;
    }

    /**
     * 解析JWT令牌
     *
     * @param jwt
     * @return
     */
    public static Claims parseJwt(String jwt) {
        Claims claims = Jwts.parser()
                .setSigningKey(signKey) //指定签名密钥
                .parseClaimsJws(jwt)    //指定令牌Token
                .getBody();
        return claims;
    }
}
