package com.linzhilong.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.linzhilong.domain.Brand;
import com.linzhilong.domain.PageBean;
import com.linzhilong.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.linzhilong.controller.Code;
import com.linzhilong.controller.Result;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping
    public Result save(@RequestBody Brand brand) {
        System.out.println(brand);
        boolean flag = brandService.save(brand);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @GetMapping
    public Result selectAll() {
        List<Brand> brands = brandService.selectAll();
        Integer code = brands != null ? Code.GET_OK : Code.GET_ERR;

        String msg = brands != null ? "" : "查询失败,请重试!";
        return new Result(brands, code, msg);
    }

    @GetMapping("/{page}/{size}")
    public Result selectPages(@PathVariable int page, @PathVariable int size) {
        //获取IPage分页方法
        IPage<Brand> data = brandService.selectPages(page, size);
        //获取当前页数据
        List<Brand> brands = data.getRecords();
        //获取总条数
        long total = data.getTotal();

        PageBean<Brand> pb = new PageBean<Brand>(total,brands);
        Integer code = brands != null ? Code.GET_OK : Code.GET_ERR;

        String msg = brands != null ? "" : "查询失败,请重试!";
        return new Result(pb, code, msg);
    }

    @DeleteMapping("/data")
    public Result deleteIds(@RequestParam("ids") List<Integer> ids) {
        boolean flag = brandService.deleteIds(ids);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable int id) {
        boolean flag = brandService.deleteById(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @PutMapping
    public Result updateById(@RequestBody Brand brand) {
        boolean flag = brandService.updateById(brand);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

}
