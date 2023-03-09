package com.linzhilong;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.linzhilong.domain.Brand;
import com.linzhilong.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BrandCaseApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        System.out.println(brandService.selectAll());
    }

    @Test
    void testSave() {
        Brand brand = new Brand();
        brand.setBrandName("111");
        brand.setCompanyName("111");
        brand.setDescription("11");
        brand.setOrdered(111);
        brand.setStatus(1);
        System.out.println(brandService.save(brand));
    }

    @Test
    void testSelectPages() {
        IPage<Brand> pages = brandService.selectPages(1, 5);
        pages.getPages();
    }

    @Test
    public void testDeleteById() {
        System.out.println(brandService.deleteById(50));
    }

    @Test
    public void testDeleteIds() {
        List<Integer> ids = new ArrayList<>();
        ids.add(51);
        ids.add(52);
        ids.add(53);
        System.out.println(brandService.deleteIds(ids));
    }

    @Test
    public void testUpdate() {
        Brand brand = new Brand();
        brand.setId(54);
        brand.setStatus(1);
        brand.setBrandName("完蛋");
        System.out.println(brandService.updateById(brand));
    }
}
