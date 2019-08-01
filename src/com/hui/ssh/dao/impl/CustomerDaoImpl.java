package com.hui.ssh.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.hui.ssh.dao.CustomerDao;
import com.hui.ssh.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub 
		this.getHibernateTemplate().save(customer);
		System.out.println("CustomerDaoImpl中的Save方法执行了。。。。。");
	}

	 
}
