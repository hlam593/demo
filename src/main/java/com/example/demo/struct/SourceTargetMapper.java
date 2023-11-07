package com.example.demo.struct;

import com.example.demo.domain.params.SourceParam;
import com.example.demo.domain.vo.TargetVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

/**
 * @description:
 * @author: lam h
 * @date: 2023/11/07
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SourceTargetMapper {

    @Mapping(target = "stringProperty", source = "stringProp")
    @Mapping(target = "longProperty", source = "longProp")
    @Mapping(target = "stringConstant", constant = "1")
    @Mapping(target = "integerConstant", constant = "14")
    @Mapping(target = "longWrapperConstant", constant = "15L")
    @Mapping(target = "dateConstant", constant = "2023-11-07 00:00:00", dateFormat = "yyyy-MM-dd HH:mm:ss")
    TargetVo sourceToTarget(SourceParam param);

}
