package io.buza.agency.repository;

import io.buza.agency.entity.BtMenu;

public interface BtMenuMapper {
    int deleteByPrimaryKey(Integer menuSeq);

    int insert(BtMenu record);

    int insertSelective(BtMenu record);

    BtMenu selectByPrimaryKey(Integer menuSeq);

    int updateByPrimaryKeySelective(BtMenu record);

    int updateByPrimaryKey(BtMenu record);
}