package com.bixin.ddd.domain.metrics.techcontribution;

import com.bixin.ddd.domain.metrics.MainMetric;
import com.bixin.ddd.domain.metrics.SubMetric;
import com.bixin.ddd.domain.metrics.SubMetricType;

/**
 * CodeReview指标
 *
 * @author xueliang.sxl, alisa.hsh, xiangning.lxn
 */
public class CodeReviewMetric extends SubMetric {

    public CodeReviewMetric() {
        this.subMetricType = SubMetricType.CodeReview;
    }

    public CodeReviewMetric(MainMetric parent) {
        this.parent = parent;
        parent.addSubMetric(this);
        this.subMetricType = SubMetricType.CodeReview;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getUnanimousWeight();
    }
}
