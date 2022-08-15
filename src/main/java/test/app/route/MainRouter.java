package test.app.route;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainRouter extends EndpointRouteBuilder {

    @Value("${azure-servicebus.source-name}")
    private String serviceBusSourceName;

    @Override
    public void configure() {
        from(azureServicebus(serviceBusSourceName)).
                routePolicyRef("myPolicy").
                log("Got a new Message: ${body}");
    }

}
