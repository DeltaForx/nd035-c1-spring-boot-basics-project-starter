package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.File;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface FileMapper {

    @Select("SELECT * FROM FILES")
    List<File> selectAllFile();

    @Select("SELECT * FROM FILES WHERE fileId = #{fileId} AND userid = #{userId}")
    File selectFile(long fileId, long userId);

    @Update("UPDATE FILES SET filename = #{fileName}, contenttype = #{contentType}, filesize = #{fileSize}, filedata = #{fileData} WHERE fileId = #{fileId} AND userid = #{userId}")
    int updateFile(String fileName, String contentType, String fileSize, String fileData, long fileId, long userId);

    @Insert("INSERT INTO FILES (filename, contenttype, filesize, filedata, userid) VALUES (#{fileName}, #{contentType}, #{fileSize}, #{fileData}, #{userId})")
    int insertFile(File file);

    @Delete("DELETE FROM FILES WHERE fileId = #{fileId} AND userid = #{userId}")
    int deleteFile(long fileId, long userId);

}
