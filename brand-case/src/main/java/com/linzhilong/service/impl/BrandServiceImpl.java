package com.linzhilong.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linzhilong.dao.BrandDao;
import com.linzhilong.domain.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements com.linzhilong.service.BrandService {

    @Autowired
    private BrandDao brandDao;

    @Override
    public boolean save(Brand brand) {
        return brandDao.insert(brand) > 0;
    }

    @Override
    public List<Brand> selectAll() {
        return brandDao.selectList(null);
    }

    @Override
    public IPage<Brand> selectPages(int page, int size) {

        IPage<Brand> pages = new Page<>(page,size);
        brandDao.selectPage(pages, null);
        return pages;
    }

    @Override
    public boolean deleteIds(List<Integer> ids) {
        return brandDao.deleteBatchIds(ids) > 0;
    }

    @Override
    public boolean deleteById(int id) {
        return brandDao.deleteById(id) > 0;
    }

    @Override
    public boolean updateById(Brand brand) {
       return brandDao.updateById(brand) > 0;
    }

}
