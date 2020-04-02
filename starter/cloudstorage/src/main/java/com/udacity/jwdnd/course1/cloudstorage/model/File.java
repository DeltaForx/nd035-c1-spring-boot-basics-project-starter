package com.udacity.jwdnd.course1.cloudstorage.model;

import java.sql.Blob;

public class File {

    private long fileId;
    private String fileName;
    private String contentType;
    private String fileSize;
    private long userId;
    private Blob fileData;

    public File(long fileId, String fileName, String contentType, String fileSize, long userId, Blob fileData) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.contentType = contentType;
        this.fileSize = fileSize;
        this.userId = userId;
        this.fileData = fileData;
    }

    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Blob getFileData() {
        return fileData;
    }

    public void setFileData(Blob fileData) {
        this.fileData = fileData;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileId=" + fileId +
                ", fileName='" + fileName + '\'' +
                ", contentType='" + contentType + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", userId=" + userId +
                ", fileData=" + fileData +
                '}';
    }
}
