package com.EZ.customer.service.impl;

import java.util.List;

import com.EZ.customer.domain.CustomerVO;
import com.EZ.customer.service.CustomerService;
import com.EZ.customer.store.CustomerStore;

public class CustomerServiceImpl implements CustomerService {
		private CustomerStore cStore;

//		setter 메소드를 이용하여 의존성을 주입한다.
		public void setStore(CustomerStore cStore) {
			this.cStore = cStore;
		}

		public CustomerServiceImpl() {
//			cStore = new CustomerStoreImpl();
//			원래는 이렇게 작성해야하는데 이제는 spring-context 에 bean 으로 담았기 떄문에 안써도됨
			// spring-context에 property 태그로 추가 후 setStore 하는거
		}

//		public CustomerServiceImpl(CustomerStore cStore) {
//			this.cStore = cStore;
////		 생성자를 통해서 의존성 주입
//		}

		@Override
		public int insertCustomer(CustomerVO customer) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int modifyCustomer(CustomerVO customer) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int removeCustomer(String customerId) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<CustomerVO> selectList() {
			List<CustomerVO> cList = cStore.selectList();
			return cList;
		}

		@Override
		public CustomerVO selectOneById(String customerId) {
			// TODO Auto-generated method stub
			return null;
		}

}
