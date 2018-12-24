package com.zking.ssm.service;

import com.zking.ssm.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryService {
    List<Category> queryCategory();
}