package com.hui.ssh.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.hui.ssh.dao.CustomerDao;
import com.hui.ssh.domain.Customer;
import com.hui.ssh.service.CustomerService;

@Transactional
public class CustomerServiceImpl implements CustomerService {

	//注入dao
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("CustomerServiceImpl中的Save方法执行了。。。。。");
		customerDao.save(customer);
		
	}

}
