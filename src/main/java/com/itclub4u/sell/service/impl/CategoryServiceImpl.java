package com.itclub4u.sell.service.impl;

import com.itclub4u.sell.dataobject.ProductCategory;
import com.itclub4u.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryService productCategoryService;

    /**
     * 查询单个商品类目
     * @param categoryId
     * @return
     */
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategoryService.findOne(categoryId);
    }

    /**
     * 查询所有商品类目
     * @return
     */
    @Override
    public List<ProductCategory> findAll() {
        return productCategoryService.findAll();
    }

    /**
     * 根据商品类目type查询
     * @param categoryTypeList
     * @return
     */
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryService.findByCategoryTypeIn(categoryTypeList);
    }

    /**
     * 保存商品类目
     * @param productCategory
     * @return
     */
    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryService.save(productCategory);
    }
}
