package io.buza.agency.mapper;

import io.buza.agency.dto.AccountDto;
import io.buza.agency.dto.request.BaseRequest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AccountMapper {

    List<AccountDto> selectAccountAll(BaseRequest baseRequest);
    List<AccountDto> selectAccountAllM(Map<String, Object> paramMap);

}
