package com.so.model.common;

import com.so.model.common.enums.UserType;

public class ShallowUser {

    private Integer acceptRate;
    private BadgeCount badgeCount;
    private String displayName;
    private String link;
    private String image;
    private Integer reputation;
    private Integer userId;
    private UserType userType;

    public Integer getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }

    public BadgeCount getBadgeCount() {
        return badgeCount;
    }

    public void setBadgeCount(BadgeCount badgeCount) {
        this.badgeCount = badgeCount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "ShallowUser{" +
                "acceptRate=" + acceptRate +
                ", badgeCount=" + badgeCount +
                ", displayName='" + displayName + '\'' +
                ", link='" + link + '\'' +
                ", image='" + image + '\'' +
                ", reputation=" + reputation +
                ", userId=" + userId +
                ", userType=" + userType +
                '}';
    }
}
