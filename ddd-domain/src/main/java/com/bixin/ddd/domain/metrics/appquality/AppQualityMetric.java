package com.bixin.ddd.domain.metrics.appquality;

import com.bixin.ddd.domain.metrics.MainMetric;
import com.bixin.ddd.domain.metrics.MainMetricType;
import com.bixin.ddd.domain.metrics.devquality.BugMetric;
import com.bixin.ddd.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}
