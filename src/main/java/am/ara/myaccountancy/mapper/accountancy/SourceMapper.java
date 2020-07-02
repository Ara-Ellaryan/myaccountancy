package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.SourceDto;
import am.ara.myaccountancy.entity.accountancy.SourceEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface SourceMapper extends Mapper<SourceEntity, SourceDto> {
}
