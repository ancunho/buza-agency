package io.buza.agency.repository;

import io.buza.agency.dto.AdminAccountDto;
import io.buza.agency.entity.BtAdminAccount;

public interface BtAdminAccountRepository {
    int deleteByPrimaryKey(Long seq);

    int insert(BtAdminAccount record);

    int insertSelective(BtAdminAccount record);

    BtAdminAccount selectByPrimaryKey(Long seq);

    int updateByPrimaryKeySelective(BtAdminAccount record);

    int updateByPrimaryKey(BtAdminAccount record);

    AdminAccountDto findByUsername(String username);

}