package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.ActionDto;
import am.ara.mynotebook.entity.accountancy.ActionEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ActionMapper extends Mapper<ActionEntity, ActionDto> {
}
