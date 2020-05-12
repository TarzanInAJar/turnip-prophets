package com.mytechuncle.turnipprophets.utils.turnipprophet.model;

import java.util.List;
import java.util.Optional;

public class TurnipProphetPrediction {

    private String description;
    private Integer patternNumber;
    private Integer weekGuaranteedMinimum;
    private Integer weekMax;
    private Optional<Double> probability;
    private Optional<Double> categoryTotalProbability;
    private List<Price> prices;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPatternNumber() {
        return patternNumber;
    }

    public void setPatternNumber(Integer patternNumber) {
        this.patternNumber = patternNumber;
    }

    public Integer getWeekGuaranteedMinimum() {
        return weekGuaranteedMinimum;
    }

    public void setWeekGuaranteedMinimum(Integer weekGuaranteedMinimum) {
        this.weekGuaranteedMinimum = weekGuaranteedMinimum;
    }

    public Integer getWeekMax() {
        return weekMax;
    }

    public void setWeekMax(Integer weekMax) {
        this.weekMax = weekMax;
    }

    public Optional<Double> getProbability() {
        return probability;
    }

    public void setProbability(Optional<Double> probability) {
        this.probability = probability;
    }

    public Optional<Double> getCategoryTotalProbability() {
        return categoryTotalProbability;
    }

    public void setCategoryTotalProbability(Optional<Double> categoryTotalProbability) {
        this.categoryTotalProbability = categoryTotalProbability;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public class Price {
        private Integer min;
        private Integer max;

        public Price(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }
    }
}
