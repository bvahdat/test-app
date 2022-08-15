package test.app.policy;

import org.apache.camel.Exchange;
import org.apache.camel.Route;
import org.apache.camel.support.RoutePolicySupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("myPolicy")
public class MyRoutePolicy extends RoutePolicySupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyRoutePolicy.class);

    @Override
    public void onExchangeDone(Route route, Exchange exchange) {
        String eventBody = exchange.getMessage().getBody(String.class);
        LOGGER.info("Processing of the event done: {}", eventBody);
    }

}
