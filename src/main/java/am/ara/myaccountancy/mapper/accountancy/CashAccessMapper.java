package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.CashAccessDto;
import am.ara.myaccountancy.entity.accountancy.CashAccessEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CashAccessMapper extends Mapper<CashAccessEntity, CashAccessDto> {
}
