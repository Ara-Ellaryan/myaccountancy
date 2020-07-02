package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.PartitionDto;
import am.ara.myaccountancy.entity.accountancy.PartitionEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface PartitionMapper extends Mapper<PartitionEntity, PartitionDto> {
}
