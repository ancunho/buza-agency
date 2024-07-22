package io.buza.agency.repository;

import io.buza.agency.entity.BtPostTag;

public interface BtPostTagMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(BtPostTag record);

    int insertSelective(BtPostTag record);

    BtPostTag selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(BtPostTag record);

    int updateByPrimaryKey(BtPostTag record);
}