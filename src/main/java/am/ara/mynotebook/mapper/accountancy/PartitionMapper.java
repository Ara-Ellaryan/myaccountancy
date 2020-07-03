package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.PartitionDto;
import am.ara.mynotebook.entity.accountancy.PartitionEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface PartitionMapper extends Mapper<PartitionEntity, PartitionDto> {
}
