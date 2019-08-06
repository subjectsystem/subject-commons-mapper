package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * ClassName MyMapper
 * Description //TODO
 * Author weila
 * Date 2019-08-06-0006 22:56
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>{
}
