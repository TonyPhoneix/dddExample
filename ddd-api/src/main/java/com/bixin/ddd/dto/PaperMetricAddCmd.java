package com.bixin.ddd.dto;

import com.bixin.ddd.dto.clientobject.PaperMetricCO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * PaperMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-03 11:38 AM
 */
@Data
public class PaperMetricAddCmd extends CommonCommand {
    @NotNull
    private PaperMetricCO paperMetricCO;
}