package com.hui.ssh.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.hui.ssh.dao.CustomerDao;
import com.hui.ssh.domain.Customer;
import com.hui.ssh.service.CustomerService;

@Transactional
public class CustomerServiceImpl implements CustomerService {

	//ע��dao
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("CustomerServiceImpl�е�Save����ִ���ˡ���������");
		customerDao.save(customer);
		
	}

}
