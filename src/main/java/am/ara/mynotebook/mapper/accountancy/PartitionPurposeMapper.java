package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.PartitionPurposeDto;
import am.ara.mynotebook.entity.accountancy.PartitionPurposeEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface PartitionPurposeMapper extends Mapper<PartitionPurposeEntity, PartitionPurposeDto> {
}
