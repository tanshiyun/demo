package com.yun.demo.sysDict.controller;

import com.yun.demo.sysDict.dbo.RegionDivision;
import com.yun.demo.sysDict.service.RegionDivisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class RegionDivisionController {

    private final RegionDivisionService regionDivisionService;

    @RequestMapping("/region")
    public Map<String, Object> getRegionTree() {
        List<RegionDivision> regionDivisionTree = regionDivisionService.getRegionDivisionTree();
        Map<String, Object> res = new HashMap<>();
        res.put("content", regionDivisionTree);
        return res;
    }
}
