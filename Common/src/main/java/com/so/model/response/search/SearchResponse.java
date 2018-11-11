package com.so.model.response.search;

import com.so.model.common.enums.ItemType;
import com.so.model.common.ShallowUser;

import java.util.Arrays;

public class SearchResponse {

    private Integer answerCount;
    private Integer answerId;
    private String body;
    private Long closedDate;
    private Long communityOwnedDate;
    private Long creationDate;
    private String[] equiTags;
    private String excerpt;
    private Boolean acceptedAnswer;
    private Boolean isAccepted;
    private Boolean isAnswered;
    private ItemType itemType;
    private Long lastActDate;
    private Long locakedDate;
    private ShallowUser shallowUser;
    private Integer questionId;
    private Integer questionScore;
    private Integer score;
    private String[] tags;
    private String title;

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Long closedDate) {
        this.closedDate = closedDate;
    }

    public Long getCommunityOwnedDate() {
        return communityOwnedDate;
    }

    public void setCommunityOwnedDate(Long communityOwnedDate) {
        this.communityOwnedDate = communityOwnedDate;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public String[] getEquiTags() {
        return equiTags;
    }

    public void setEquiTags(String[] equiTags) {
        this.equiTags = equiTags;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Boolean getAcceptedAnswer() {
        return acceptedAnswer;
    }

    public void setAcceptedAnswer(Boolean acceptedAnswer) {
        this.acceptedAnswer = acceptedAnswer;
    }

    public Boolean getAccepted() {
        return isAccepted;
    }

    public void setAccepted(Boolean accepted) {
        isAccepted = accepted;
    }

    public Boolean getAnswered() {
        return isAnswered;
    }

    public void setAnswered(Boolean answered) {
        isAnswered = answered;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Long getLastActDate() {
        return lastActDate;
    }

    public void setLastActDate(Long lastActDate) {
        this.lastActDate = lastActDate;
    }

    public Long getLocakedDate() {
        return locakedDate;
    }

    public void setLocakedDate(Long locakedDate) {
        this.locakedDate = locakedDate;
    }

    public ShallowUser getShallowUser() {
        return shallowUser;
    }

    public void setShallowUser(ShallowUser shallowUser) {
        this.shallowUser = shallowUser;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Integer questionScore) {
        this.questionScore = questionScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SearchResponse{" +
                "answerCount=" + answerCount +
                ", answerId=" + answerId +
                ", body='" + body + '\'' +
                ", closedDate=" + closedDate +
                ", communityOwnedDate=" + communityOwnedDate +
                ", creationDate=" + creationDate +
                ", equiTags=" + Arrays.toString(equiTags) +
                ", excerpt='" + excerpt + '\'' +
                ", acceptedAnswer=" + acceptedAnswer +
                ", isAccepted=" + isAccepted +
                ", isAnswered=" + isAnswered +
                ", itemType=" + itemType +
                ", lastActDate=" + lastActDate +
                ", locakedDate=" + locakedDate +
                ", shallowUser=" + shallowUser +
                ", questionId=" + questionId +
                ", questionScore=" + questionScore +
                ", score=" + score +
                ", tags=" + Arrays.toString(tags) +
                ", title='" + title + '\'' +
                '}';
    }
}
