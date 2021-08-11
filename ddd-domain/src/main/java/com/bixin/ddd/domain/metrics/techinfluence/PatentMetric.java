package com.bixin.ddd.domain.metrics.techinfluence;

import com.bixin.ddd.domain.metrics.MainMetric;
import com.bixin.ddd.domain.metrics.SubMetric;
import com.bixin.ddd.domain.metrics.SubMetricType;

/**
 * 技术专利指标
 *
 * @author xueliang.sxl
 */
public class PatentMetric extends SubMetric {

    public PatentMetric() {
        this.subMetricType = SubMetricType.Patent;
    }

    public PatentMetric(MainMetric parent) {
        this.parent = parent;
        parent.addSubMetric(this);
        this.subMetricType = SubMetricType.Patent;
    }

    @Override
    public double getWeight() {
        return parent.getMetricOwner().getWeight().getUnanimousWeight();
    }
}
