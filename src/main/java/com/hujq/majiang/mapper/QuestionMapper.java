package com.hujq.majiang.mapper;

import com.hujq.majiang.dto.QuestionDTO;
import com.hujq.majiang.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {


    @Insert("insert into question (title,description,gmt_create,gmt_modify,creator,tag) values(#{title},#{description},#{gmt_create},#{gmt_modify},#{creator},#{tag})")
    void create(Question question);

    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(@Param("offset") Integer offset, @Param("size") Integer size);

    @Select("select * from question")
    List<Question> list1();

    @Select("select count(1) from question")
    Integer count();
}
