package com.hui.ssh.web.action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hui.ssh.domain.Customer;
import com.hui.ssh.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * �ͻ������Action��
 * @author ��
 *
 */
public class CustomerAction extends ActionSupport  implements ModelDriven<Customer>{

	//ģ������ʹ�õĶ���
	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	//��action��ע��Service
	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	public String save() {
		//���web��û��ʹ��struts2����ȡҵ������������±�д
//		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		
		System.out.println("Action�е�save����ִ����...........");
		customerService.save(customer);
		
		
		return NONE;
	}
}
