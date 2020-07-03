package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.SourceDto;
import am.ara.mynotebook.entity.accountancy.SourceEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface SourceMapper extends Mapper<SourceEntity, SourceDto> {
}
