package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Note;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface NoteMapper {

    @Select("SELECT * FROM NOTES")
    List<Note> selectAllNote();

    @Select("SELECT * FROM NOTES WHERE noteid = #{noteId} AND userid = #{userId}")
    Note selectNote(long noteId, long userId);

    @Update("UPDATE NOTES SET notetitle = #{noteTitle}, notedescription = #{noteDescription} WHERE noteid = #{noteId} AND userid = #{userId}")
    int updateNote(String noteTitle, String noteDescription, long noteId, long userId);

    @Insert("INSERT INTO NOTES (notetitle, notedescription, userid) VALUES (#{noteTitle}, #{noteDescription}, #{userId})")
    int insertNote(Note note);

    @Delete("DELETE FROM NOTES WHERE noteid = #{noteId} AND userid = #{userId}")
    int deleteNote(long noteId, long userId);

}
