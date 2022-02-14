package com.yun.demo.sysDict;

import com.yun.demo.DemoApplicationTests;
import com.yun.demo.sysDict.service.RegionDivisionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RegionDivisionServiceTest extends DemoApplicationTests {

    @Autowired
    private RegionDivisionService regionDivisionService;

    @Test
    public void testGetRegionTree() {
        regionDivisionService.getRegionDivisionTree();
    }
}
