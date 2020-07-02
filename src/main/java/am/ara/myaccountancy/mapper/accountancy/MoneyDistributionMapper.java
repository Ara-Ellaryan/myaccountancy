package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.MoneyDistributionDto;
import am.ara.myaccountancy.entity.accountancy.MoneyDistributionEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface MoneyDistributionMapper extends Mapper<MoneyDistributionEntity, MoneyDistributionDto> {
}
