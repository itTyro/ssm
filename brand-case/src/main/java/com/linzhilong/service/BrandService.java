package com.linzhilong.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.linzhilong.domain.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BrandService {

    /**
     * 添加数据
     * @param brand
     * @return
     */
    boolean save(Brand brand);

    /**
     * 查询全部数据
     * @return
     */
    List<Brand> selectAll();

    /**
     * 分页查询
     * @param page 当前页码
     * @param size 一次查询多少
     * @return
     */
    IPage<Brand> selectPages(int page, int size);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    boolean deleteIds(List<Integer> ids);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    boolean deleteById(int id);

    /**
     * 修改数据
     * @param brand
     * @return
     */
    boolean updateById(Brand brand);
}
