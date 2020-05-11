package com.mytechuncle.turnipprophets.utils;

import com.mytechuncle.turnipprophets.utils.PredictionConstants.PATTERN_TYPE;

import java.util.Optional;

public class PredictionRequest {

    private boolean firstBuy;
    private Optional<PATTERN_TYPE> previousPattern;
    private Optional<Integer> boughtFor;
    private Optional<Integer> monAM;
    private Optional<Integer> monPM;
    private Optional<Integer> tueAM;
    private Optional<Integer> tuePM;
    private Optional<Integer> wedAM;
    private Optional<Integer> wedPM;
    private Optional<Integer> thuAM;
    private Optional<Integer> thuPM;
    private Optional<Integer> friAM;
    private Optional<Integer> friPM;
    private Optional<Integer> satAM;
    private Optional<Integer> satPM;

    public boolean isFirstBuy() {
        return firstBuy;
    }

    public void setFirstBuy(boolean firstBuy) {
        this.firstBuy = firstBuy;
    }

    public Optional<PATTERN_TYPE> getPreviousPattern() {
        return previousPattern;
    }

    public void setPreviousPattern(Optional<PATTERN_TYPE> previousPattern) {
        this.previousPattern = previousPattern;
    }

    public Optional<Integer> getBoughtFor() {
        return boughtFor;
    }

    public void setBoughtFor(Optional<Integer> boughtFor) {
        this.boughtFor = boughtFor;
    }

    public Optional<Integer> getMonAM() {
        return monAM;
    }

    public void setMonAM(Optional<Integer> monAM) {
        this.monAM = monAM;
    }

    public Optional<Integer> getMonPM() {
        return monPM;
    }

    public void setMonPM(Optional<Integer> monPM) {
        this.monPM = monPM;
    }

    public Optional<Integer> getTueAM() {
        return tueAM;
    }

    public void setTueAM(Optional<Integer> tueAM) {
        this.tueAM = tueAM;
    }

    public Optional<Integer> getTuePM() {
        return tuePM;
    }

    public void setTuePM(Optional<Integer> tuePM) {
        this.tuePM = tuePM;
    }

    public Optional<Integer> getWedAM() {
        return wedAM;
    }

    public void setWedAM(Optional<Integer> wedAM) {
        this.wedAM = wedAM;
    }

    public Optional<Integer> getWedPM() {
        return wedPM;
    }

    public void setWedPM(Optional<Integer> wedPM) {
        this.wedPM = wedPM;
    }

    public Optional<Integer> getThuAM() {
        return thuAM;
    }

    public void setThuAM(Optional<Integer> thuAM) {
        this.thuAM = thuAM;
    }

    public Optional<Integer> getThuPM() {
        return thuPM;
    }

    public void setThuPM(Optional<Integer> thuPM) {
        this.thuPM = thuPM;
    }

    public Optional<Integer> getFriAM() {
        return friAM;
    }

    public void setFriAM(Optional<Integer> friAM) {
        this.friAM = friAM;
    }

    public Optional<Integer> getFriPM() {
        return friPM;
    }

    public void setFriPM(Optional<Integer> friPM) {
        this.friPM = friPM;
    }

    public Optional<Integer> getSatAM() {
        return satAM;
    }

    public void setSatAM(Optional<Integer> satAM) {
        this.satAM = satAM;
    }

    public Optional<Integer> getSatPM() {
        return satPM;
    }

    public void setSatPM(Optional<Integer> satPM) {
        this.satPM = satPM;
    }
}


