package com.leyou.httpdemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leyou.httpdemo.pojo.User;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestJson {

    //把对象转成json格式字符串
    @Test
    public void testObj2Json() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User();
        user.setId(1L);
        user.setAge(10);
        user.setName("tom");
        user.setUserName("tom1");

        //对象转化字符串
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);


    }

    //json格式字符串变成对象
    @Test
    public void testJson2Obj() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User();
        user.setId(1L);
        user.setAge(10);
        user.setName("tom");
        user.setUserName("tom1");

        //对象转化字符串
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);

        //字符串变成对象
        User  o = objectMapper.readValue(s, new TypeReference<User>() {
        });
        System.out.println("---"+o);


    }

    @Test
    public void testJson2ObjHard() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User();
        user.setId(1L);
        user.setAge(10);
        user.setName("tom");
        user.setUserName("tom1");

        //对象转json字符串（数组）
        String s = objectMapper.writeValueAsString(Arrays.asList(user, user, user));
        System.out.println(s);

        //json字符串（数组）变成list<User>
        List<User> o = objectMapper.readValue(s, new TypeReference<List<User>>(){});
        for(User u:o){
            System.out.println("--");
            System.out.println(u);

        }


    }
}
