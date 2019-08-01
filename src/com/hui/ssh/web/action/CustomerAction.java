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
 * 客户管理的Action类
 * @author 辉
 *
 */
public class CustomerAction extends ActionSupport  implements ModelDriven<Customer>{

	//模型驱动使用的对象
	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	//在action中注入Service
	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	public String save() {
		//如果web层没有使用struts2，获取业务层的类必须如下编写
//		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		
		System.out.println("Action中的save方法执行了...........");
		customerService.save(customer);
		
		
		return NONE;
	}
}
