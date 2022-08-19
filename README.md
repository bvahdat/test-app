# Build

First specify your own Azure ServiceBus coordinations [here](src/main/resources/application.yml)

And then build the Ueber JAR:

```
mvn package
```

# Run

Provide your ApplicationInsights connection string as well as the required Azure-AD details:

```
export APPLICATIONINSIGHTS_CONNECTION_STRING=...
export AZURE_CLIENT_ID=...
export AZURE_CLIENT_SECRET=...
export AZURE_TENANT_ID=...
```

Now run using the Agent version `3.2.11`:

```
java -javaagent:agent/applicationinsights-agent-3.2.11.jar -jar target/test-app-1.0.0-SNAPSHOT.jar
```

![](agent-3.2.11.png)

And then using the Agent version `3.3.1`:

```
java -javaagent:agent/applicationinsights-agent-3.3.1.jar -jar target/test-app-1.0.0-SNAPSHOT.jar
```

![](agent-3.3.1.png)
