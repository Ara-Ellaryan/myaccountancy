package am.ara.myaccountancy.mapper.user;

import am.ara.myaccountancy.dto.user.UserDto;
import am.ara.myaccountancy.entity.user.UserEntity;
import am.ara.myaccountancy.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserMapper extends Mapper<UserEntity, UserDto> {
}
