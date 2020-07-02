package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.TradeDto;
import am.ara.myaccountancy.entity.accountancy.TradeEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface TradeMapper extends Mapper<TradeEntity, TradeDto> {
}
