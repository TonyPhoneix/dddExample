package com.bixin.ddd.dto;

import com.bixin.ddd.dto.clientobject.ATAMetricCO;
import com.bixin.ddd.dto.clientobject.PatentMetricCO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * PatentMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-03 11:37 AM
 */
@Data
public class PatentMetricAddCmd extends CommonCommand{
    @NotNull
    private PatentMetricCO  patentMetricCO;
}
