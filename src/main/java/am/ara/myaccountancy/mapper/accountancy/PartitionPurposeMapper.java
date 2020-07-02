package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.PartitionPurposeDto;
import am.ara.myaccountancy.entity.accountancy.PartitionPurposeEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface PartitionPurposeMapper extends Mapper<PartitionPurposeEntity, PartitionPurposeDto> {
}
