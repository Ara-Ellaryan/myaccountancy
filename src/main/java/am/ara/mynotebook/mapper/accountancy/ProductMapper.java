package am.ara.mynotebook.mapper.accountancy;

import am.ara.mynotebook.dto.accountancy.ProductDto;
import am.ara.mynotebook.entity.accountancy.ProductEntity;
import am.ara.mynotebook.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ProductMapper extends Mapper<ProductEntity, ProductDto> {
}
