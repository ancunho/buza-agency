package io.buza.agency.repository;

import io.buza.agency.entity.BtTag;

public interface BtTagMapper {
    int deleteByPrimaryKey(Integer tagSeq);

    int insert(BtTag record);

    int insertSelective(BtTag record);

    BtTag selectByPrimaryKey(Integer tagSeq);

    int updateByPrimaryKeySelective(BtTag record);

    int updateByPrimaryKey(BtTag record);
}