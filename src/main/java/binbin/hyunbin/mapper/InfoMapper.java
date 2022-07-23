package binbin.hyunbin.mapper;

import binbin.hyunbin.model.Info;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoMapper {

    Info getName(int id);

//    @Select("SELECT * FROM info")
//    Info getName();
}
