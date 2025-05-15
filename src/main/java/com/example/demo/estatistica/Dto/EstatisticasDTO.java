package com.example.demo.estatistica.Dto;

import java.util.DoubleSummaryStatistics;

public class EstatisticasDTO {
    
    private long count;
    
    private double sum;
    private double min;
    private double max;
    private double average;

    public EstatisticasDTO(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.average = stats.getAverage();
        this.min = stats.getCount() > 0 ? stats.getMin() : 0.0;
        this.max = stats.getCount() > 0 ? stats.getMax() : 0.0;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
