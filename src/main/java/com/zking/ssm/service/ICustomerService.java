package com.zking.ssm.service;

import com.zking.ssm.mapper.CustomerMapper;
import com.zking.ssm.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICustomerService {


   List<Customer> queryCustomerLst();
}