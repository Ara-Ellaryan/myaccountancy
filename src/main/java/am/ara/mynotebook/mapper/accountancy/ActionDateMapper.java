package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.ActionDateDto;
import am.ara.mynotebook.entity.accountancy.ActionDateEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ActionDateMapper extends Mapper<ActionDateEntity, ActionDateDto> {
}
