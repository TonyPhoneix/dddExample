package com.bixin.ddd.domain;

import com.bixin.ddd.domain.metrics.techinfluence.InfluenceMetric;
import com.bixin.ddd.domain.metrics.techinfluence.SharingMetric;
import com.bixin.ddd.domain.metrics.techinfluence.SharingMetricItem;
import com.bixin.ddd.domain.metrics.techinfluence.SharingScope;
import com.bixin.ddd.domain.user.UserProfile;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * SharingMetricTest
 *
 * @author Frank Zhang
 * @date 2019-02-26 4:14 PM
 */
public class SharingMetricTest {

    @Test
    public void testSharingMetric(){
        SharingMetric sharingMetric = new SharingMetric(new InfluenceMetric(new UserProfile()));
        sharingMetric.addMetricItem(new SharingMetricItem("title", SharingScope.TEAM, new Date(), "sharingLink"));
        sharingMetric.addMetricItem(new SharingMetricItem("title", SharingScope.BU, new Date(), "sharingLink"));
        sharingMetric.addMetricItem(new SharingMetricItem("title", SharingScope.ALIBABA, new Date(), "sharingLink"));
        sharingMetric.addMetricItem(new SharingMetricItem("title", SharingScope.COMMUNITY, new Date(), "sharingLink"));

        Assert.assertEquals(92, sharingMetric.calculateScore(), 0.01);
    }
}