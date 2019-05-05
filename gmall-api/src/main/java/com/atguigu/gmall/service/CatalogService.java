package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseCatalog1;
import com.atguigu.gmall.bean.BaseCatalog2;
import com.atguigu.gmall.bean.BaseCatalog3;

import java.util.List;

/**
 * @author 潇
 * @create 2019-05-01 20:28
 */
public interface CatalogService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);

    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);
}
