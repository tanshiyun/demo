package com.yun.demo.dict.repo;

import com.yun.demo.dict.dbo.RegionDivision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionDivisionRepo extends JpaRepository<RegionDivision, String> {
}
