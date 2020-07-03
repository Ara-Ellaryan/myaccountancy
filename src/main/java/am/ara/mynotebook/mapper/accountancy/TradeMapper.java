package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.TradeDto;
import am.ara.mynotebook.entity.accountancy.TradeEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface TradeMapper extends Mapper<TradeEntity, TradeDto> {
}
