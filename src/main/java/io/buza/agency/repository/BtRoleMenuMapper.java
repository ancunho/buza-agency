package io.buza.agency.repository;

import io.buza.agency.entity.BtRoleMenu;

public interface BtRoleMenuMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(BtRoleMenu record);

    int insertSelective(BtRoleMenu record);

    BtRoleMenu selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(BtRoleMenu record);

    int updateByPrimaryKey(BtRoleMenu record);
}