package com.udacity.jwdnd.course1.cloudstorage.mapper;
import com.udacity.jwdnd.course1.cloudstorage.model.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USERS")
    List<User> selectAllUser();

    @Select("SELECT * FROM USERS WHERE userid = #{userId}")
    User selectUser(long userId);

    @Update("UPDATE USERS SET username = #{userName}, salt = #{salt}, password = #{password}, firstname = #{firstName}, lastname = #{lastName} WHERE userid = #{userId}")
    int updateUser(String userName, String salt, String password, String firstName, String lastName, long userId);

    @Insert("INSERT INTO USERS (username, salt, password, firstname, lastname) VALUES (#{userName}, #{salt}, #{password}, #{firstName}, #{lastName})")
    int insertUser(User user);

    @Delete("DELETE FROM USERS WHERE userid = #{userId}")
    int deleteUser(long userId);

}