package io.buza.agency.repository;

import io.buza.agency.entity.BtRole;

public interface BtRoleMapper {
    int deleteByPrimaryKey(Integer roleSeq);

    int insert(BtRole record);

    int insertSelective(BtRole record);

    BtRole selectByPrimaryKey(Integer roleSeq);

    int updateByPrimaryKeySelective(BtRole record);

    int updateByPrimaryKey(BtRole record);
}