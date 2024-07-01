package io.buza.agency.dao;

import io.buza.agency.entity.BtPost;

public interface BtPostMapper {
    int deleteByPrimaryKey(Long postSeq);

    int insert(BtPost record);

    int insertSelective(BtPost record);

    BtPost selectByPrimaryKey(Long postSeq);

    int updateByPrimaryKeySelective(BtPost record);

    int updateByPrimaryKeyWithBLOBs(BtPost record);

    int updateByPrimaryKey(BtPost record);
}