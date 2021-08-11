package com.bixin.ddd.domain.gateway;

import com.bixin.ddd.domain.metrics.MetricItem;
import com.bixin.ddd.domain.metrics.SubMetric;
import com.bixin.ddd.domain.metrics.appquality.AppMetric;
import com.bixin.ddd.domain.metrics.devquality.BugMetric;

import java.util.List;

/**
 * MetricGateway
 *
 * @author Frank Zhang
 * @date 2020-07-02 12:16 PM
 */
public interface MetricGateway {
    public void save(MetricItem metricItem);

    public List<SubMetric> listByTechContribution(String userId);

    public List<SubMetric> listByTechInfluence(String userId);

    public BugMetric getBugMetric(String userId);

    public AppMetric getAppMetric(String userId);
}
