package com.leyou.httpdemo;

import com.leyou.httpdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
//运行随机产生一个端口
@SpringBootTest(classes = HttpDemoApplication.class)
public class HttpDemoApplicationTests {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void HttpGet(){

		User user=restTemplate.getForObject("http://localhost/user/1",User.class);
		System.out.println(user);

	}


}
