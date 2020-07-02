package am.ara.myaccountancy.mapper.accountancy;

import am.ara.myaccountancy.dto.accountancy.ProductDto;
import am.ara.myaccountancy.entity.accountancy.ProductEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ProductMapper extends Mapper<ProductEntity, ProductDto> {
}
