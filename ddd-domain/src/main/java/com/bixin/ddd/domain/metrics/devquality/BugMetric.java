package com.bixin.ddd.domain.metrics.devquality;

import com.bixin.ddd.domain.metrics.*;
import com.bixin.ddd.domain.user.Role;


/**
 * BUG数指标
 */
public class BugMetric extends SubMetric {

    public BugMetric(){
        this.subMetricType = SubMetricType.Bug;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getUnanimousWeight();
    }

    @Override
    public double calculateScore() {
        if(metricOwner.getRole() == Role.OTHER){
            return 0;
        }
        return super.calculateScore();
    }
}
