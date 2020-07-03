package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.MoneyDistributionDto;
import am.ara.mynotebook.entity.accountancy.MoneyDistributionEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface MoneyDistributionMapper extends Mapper<MoneyDistributionEntity, MoneyDistributionDto> {
}
