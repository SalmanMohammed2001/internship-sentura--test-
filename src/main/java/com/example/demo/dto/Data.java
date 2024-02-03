package com.example.demo.dto;


import java.util.List;

public class Data {
    private Integer id;


    private String uid;


    private String displayName;


    private String email;


    private String givenName;


    private String middleName;


    private String name;


    private String familyName;


    private String nickname;


    private String phoneNumber;


    private String comment;


    private Integer directoryId;


    private Integer pictureId;


    private String avatarUrl;




    private String presence;


    private String createdAt;


    private String modifiedAt;


    private boolean isSuspended;


    private boolean isTrashed;

    public Data() {
    }

    public Data(Integer id, String uid, String displayName, String email, String givenName, String middleName, String name, String familyName, String nickname, String phoneNumber, String comment, Integer directoryId, Integer pictureId, String avatarUrl, String presence, String createdAt, String modifiedAt, boolean isSuspended, boolean isTrashed) {
        this.id = id;
        this.uid = uid;
        this.displayName = displayName;
        this.email = email;
        this.givenName = givenName;
        this.middleName = middleName;
        this.name = name;
        this.familyName = familyName;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
        this.directoryId = directoryId;
        this.pictureId = pictureId;
        this.avatarUrl = avatarUrl;

        this.presence = presence;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.isSuspended = isSuspended;
        this.isTrashed = isTrashed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }





    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public boolean isTrashed() {
        return isTrashed;
    }

    public void setTrashed(boolean trashed) {
        isTrashed = trashed;
    }
}
