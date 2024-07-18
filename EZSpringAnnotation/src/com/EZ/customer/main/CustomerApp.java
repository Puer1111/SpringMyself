package com.EZ.customer.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.EZ.customer.domain.CustomerVO;
import com.EZ.customer.service.CustomerService;
import com.EZ.customer.service.impl.CustomerServiceImpl;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "spring-context.xml"; // bean 등록 된 xml
		ApplicationContext ctx = new GenericXmlApplicationContext(resource);
		// bean factory 사용하기 위한 객체
		// CustomerService cService = new CustomerServiceImpl();
//  원래는 CustomerServiceImpl cService = new CustomerServiceImpl();
// 인데 결합도를 낮추기 위해 CustomerService 클래스로 낮춤
		CustomerService cService = (CustomerServiceImpl) ctx.getBean("customerService");
//		getBean 의 내부 값은 bean 의 ID
		List<CustomerVO> cList = cService.selectList();
		if (!cList.isEmpty()) {
			for (CustomerVO customer : cList) {
				System.out.println(customer.toString());
			}
		}
	}

}
