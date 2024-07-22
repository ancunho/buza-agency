package io.buza.agency.repository;

import io.buza.agency.entity.BtWriterPost;

public interface BtWriterPostMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(BtWriterPost record);

    int insertSelective(BtWriterPost record);

    BtWriterPost selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(BtWriterPost record);

    int updateByPrimaryKey(BtWriterPost record);
}