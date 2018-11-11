package com.so.model.common;

public class BadgeCount {

    private Integer bronze, silver, gold;

    public Integer getBronze() {
        return bronze;
    }

    public void setBronze(Integer bronze) {
        this.bronze = bronze;
    }

    public Integer getSilver() {
        return silver;
    }

    public void setSilver(Integer silver) {
        this.silver = silver;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "BadgeCount{" +
                "bronze=" + bronze +
                ", silver=" + silver +
                ", gold=" + gold +
                '}';
    }
}
