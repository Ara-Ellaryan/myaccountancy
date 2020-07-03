package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.CashAccessDto;
import am.ara.mynotebook.entity.accountancy.CashAccessEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CashAccessMapper extends Mapper<CashAccessEntity, CashAccessDto> {
}
