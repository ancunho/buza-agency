package io.buza.agency.repository;

import io.buza.agency.entity.BtAdminAccountRole;

public interface BtAdminAccountRoleMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(BtAdminAccountRole record);

    int insertSelective(BtAdminAccountRole record);

    BtAdminAccountRole selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(BtAdminAccountRole record);

    int updateByPrimaryKey(BtAdminAccountRole record);
}