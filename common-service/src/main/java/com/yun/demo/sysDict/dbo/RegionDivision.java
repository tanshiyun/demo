package com.yun.demo.sysDict.dbo;

import com.yun.demo.constants.DbSchemaConst;
import com.yun.demo.constants.DbTableConst;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(
        name = DbTableConst.PUBLIC_DICT_AREAS,
        schema = DbSchemaConst.SCHEMA_PUBLIC,
        indexes = {@Index(name = "index_areas", columnList = "id,parentid")}
)
public class RegionDivision implements Serializable {

    @Id
    @Column
    private String id;

    @Column(name = "parentid")
    private String parentId;

    @Column
    private String name;

    @Column
    private String level;

    @Column
    private String alias;

    @Column
    private char initial;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "parentid")
    private List<RegionDivision> subRegions;
}
