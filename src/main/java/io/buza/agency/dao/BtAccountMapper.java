package io.buza.agency.dao;

import io.buza.agency.entity.BtAccount;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BtAccountMapper {
    int deleteByPrimaryKey(Long seq);

    int insert(BtAccount record);

    int insertSelective(BtAccount record);

    BtAccount selectByPrimaryKey(Long seq);

    int updateByPrimaryKeySelective(BtAccount record);

    int updateByPrimaryKey(BtAccount record);

    @Select("SELECT EXISTS(SELECT 1 FROM BT_ACCOUNT WHERE USERNAME = #{username})")
    boolean isExistsByUsername(@Param("username") String username);

    @Select("SELECT EXISTS(SELECT 1 FROM BT_ACCOUNT WHERE EMAIL = #{email})")
    boolean isExistsByEmail(@Param("email") String email);

}