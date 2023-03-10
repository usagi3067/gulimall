package com.atguigu.gulimall.product;



import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.annotation.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;




    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
//        brandService.updateById(brandEntity);
        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L)).forEach((item) -> {
            System.out.println(item);
        });
    }

}
