package com.bixin.ddd.event.handler;


import com.alibaba.cola.dto.Response;
import com.alibaba.cola.event.EventHandler;
import com.alibaba.cola.event.EventHandlerI;
import com.alibaba.cola.logger.Logger;
import com.alibaba.cola.logger.LoggerFactory;
import com.bixin.ddd.api.UserProfileServiceI;
import com.bixin.ddd.dto.RefreshScoreCmd;
import com.bixin.ddd.dto.domainevent.MetricItemCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;

@EventHandler
public class MetricItemCreatedHandler implements EventHandlerI<Response, MetricItemCreatedEvent> {

    private Logger logger = LoggerFactory.getLogger(MetricItemCreatedHandler.class);

    @Autowired
    private UserProfileServiceI userProfileService;

    @Override
    public Response execute(MetricItemCreatedEvent event) {
        logger.debug("Handling Event: " + event);
        RefreshScoreCmd cmd = new RefreshScoreCmd(event.getUserId());
        userProfileService.refreshScore(cmd);
        return Response.buildSuccess();
    }
}
