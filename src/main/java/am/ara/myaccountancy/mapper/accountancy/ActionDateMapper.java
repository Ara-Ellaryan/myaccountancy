package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.ActionDateDto;
import am.ara.myaccountancy.entity.accountancy.ActionDateEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ActionDateMapper extends Mapper<ActionDateEntity, ActionDateDto> {
}
