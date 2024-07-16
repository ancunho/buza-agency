package io.buza.agency.dao;

import io.buza.agency.entity.BtAdminAccount;

public interface BtAdminAccountMapper {
    int deleteByPrimaryKey(Long seq);

    int insert(BtAdminAccount record);

    int insertSelective(BtAdminAccount record);

    BtAdminAccount selectByPrimaryKey(Long seq);

    int updateByPrimaryKeySelective(BtAdminAccount record);

    int updateByPrimaryKey(BtAdminAccount record);
}