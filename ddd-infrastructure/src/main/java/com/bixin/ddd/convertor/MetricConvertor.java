package com.bixin.ddd.convertor;


import com.bixin.ddd.domain.metrics.MetricItem;
import com.bixin.ddd.gatewayimpl.database.dataobject.MetricDO;

/**
 * @author frankzhang
 */
public class MetricConvertor {

    public static MetricDO toDataObject(MetricItem metricItem) {
        MetricDO metricDO = new MetricDO();
        metricDO.setUserId(metricItem.getMetricOwner().getUserId());
        metricDO.setMainMetric(metricItem.getSubMetric().getParent().getCode());
        metricDO.setSubMetric(metricItem.getSubMetric().getCode());
        metricDO.setMetricItem(metricItem.toJsonString());
        return metricDO;
    }

}
