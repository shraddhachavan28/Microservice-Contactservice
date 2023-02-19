package com.contact.contact_service.entity;

public class Contact {
    private Long cId;
    private String emailId;
    private String userName;
    private Long userId;

    public Contact(Long cId, String emailId, String userName, Long userId) {
        this.cId = cId;
        this.emailId = emailId;
        this.userName = userName;
        this.userId = userId;
    }

    /**
     * @return long return the cId
     */
    public Long getCId() {
        return cId;
    }

    /**
     * @param cId the cId to set
     */
    public void setCId(Long cId) {
        this.cId = cId;
    }

    /**
     * @return String return the emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /**
     * @return String return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return long return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}