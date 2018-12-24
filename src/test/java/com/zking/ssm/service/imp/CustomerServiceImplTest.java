package com.zking.ssm.service.imp;

import com.zking.ssm.model.Category;
import com.zking.ssm.model.Customer;
import com.zking.ssm.model.News;
import com.zking.ssm.model.Order;
import com.zking.ssm.service.ICategoryService;
import com.zking.ssm.service.ICustomerService;
import com.zking.ssm.service.INewsService;
import com.zking.ssm.service.IOrderService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerServiceImplTest extends  BaseTestCase{
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IOrderService IOrderService;
    @Autowired
    private INewsService newsService;
    @Autowired
    private ICategoryService ICategoryService;
    @Before
    public void setUp()  {
        super.setUp();
    }

    @Test
    public void queryCustomerLst() {
        List<Customer> customers = customerService.queryCustomerLst();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    @Test
    public void queryOrder() {
        Order order = new Order();
        order.setOrderId(1);
        Order order1 = IOrderService.querySingleOrder(order);
        System.out.println(order1);
    }
    @Test
    public void queryNews() {
        List<News> news = newsService.queryNewsLst();
        for (News news1 : news) {
            System.out.println(news1);
        }
    }
    @Test
    public void queryCategory() {
        List<Category> categories = ICategoryService.queryCategory();
        for (Category category : categories) {
            System.out.println(category);
        }
    }
}