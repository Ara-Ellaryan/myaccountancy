package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.ActionDto;
import am.ara.myaccountancy.entity.accountancy.ActionEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ActionMapper extends Mapper<ActionEntity, ActionDto> {
}
