package com.EZ.customer.store;

import java.util.List;

import com.EZ.customer.domain.CustomerVO;

public interface CustomerStore {
	/**
	 * 고객 등록 메소드
	 * 
	 * @param customer
	 * @return int
	 */
	public int insertCustomer(CustomerVO customer);

	/**
	 * 고객 정보수정 메소드
	 * 
	 * @param customer
	 * @return int
	 */
	public int modifyCustomer(CustomerVO customer);

	/**
	 * 고객 정보 삭제 메소드
	 * 
	 * @param customerId
	 * @return int
	 */
	public int removeCustomer(String customerId);

	/**
	 * 고객정보 전체 조회 메소드
	 * 
	 * @return
	 */
	public List<CustomerVO> selectList();

	/**
	 * 고객 정보 조회 By Id
	 * 
	 * @param customerId
	 * @return
	 */
	public CustomerVO selectOneById(String customerId);


}
