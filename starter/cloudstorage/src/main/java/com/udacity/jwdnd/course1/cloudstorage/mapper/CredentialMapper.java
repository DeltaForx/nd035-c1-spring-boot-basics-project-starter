package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Credential;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CredentialMapper {

    @Select("SELECT * FROM CREDENTIALS")
    List<Credential> selectAllCredential();

    @Select("SELECT * FROM CREDENTIALS WHERE credentialid = #{credentialId} AND userid = #{userId}")
    Credential selectCredential(long credentialId, long userId);

    @Update("UPDATE CREDENTIALS SET url = #{url}, username = #{userName}, key = #{key}, password = #{password} WHERE credentialid = #{credentialId} AND userid = #{userId}")
    int updateCredential(String url, String userName, String key, String password, long credentialId, long userId);

    @Insert("INSERT INTO CREDENTIALS (url, username, key, password, userid) VALUES (#{url}, #{userName}, #{key}, #{password}, #{userId})")
    int insertCredential(Credential credential);

    @Delete("DELETE FROM CREDENTIALS WHERE credentialid = #{credentialId} AND userid = #{userId}")
    int deleteCredential(long credentialId, long userId);

}
