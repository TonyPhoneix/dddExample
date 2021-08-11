package com.bixin.ddd.domain.metrics.devquality;

import com.bixin.ddd.domain.metrics.MainMetric;
import com.bixin.ddd.domain.metrics.MainMetricType;
import com.bixin.ddd.domain.user.UserProfile;
import lombok.Data;

@Data
public class DevQualityMetric extends MainMetric {

    private BugMetric bugMetric;

    public DevQualityMetric(UserProfile metricOwner) {
        this.metricOwner = metricOwner;
        metricOwner.setDevQualityMetric(this);
        this.metricMainType = MainMetricType.DEV_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getDevQualityWeight();
    }
}
