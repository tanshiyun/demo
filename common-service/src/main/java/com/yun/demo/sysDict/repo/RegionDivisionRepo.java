package com.yun.demo.sysDict.repo;

import com.yun.demo.sysDict.dbo.RegionDivision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionDivisionRepo extends JpaRepository<RegionDivision, String> {
    List<RegionDivision> findByLevel(String level);
}
