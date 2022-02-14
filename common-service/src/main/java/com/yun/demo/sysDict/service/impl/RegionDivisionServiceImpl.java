package com.yun.demo.sysDict.service.impl;

import com.yun.demo.sysDict.dbo.RegionDivision;
import com.yun.demo.sysDict.repo.RegionDivisionRepo;
import com.yun.demo.sysDict.service.RegionDivisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionDivisionServiceImpl implements RegionDivisionService {

    private final RegionDivisionRepo regionDivisionRepo;


    @Override
    @Transactional
    public List<RegionDivision> getRegionDivisionTree() {
        List<RegionDivision> regionTree = regionDivisionRepo.findByLevel("1");
        return regionTree;
    }
}
