# Financial Planning Skill

## Supported application id's

Make sure to add the application id's of the Alexa skills to the `FinancialPlanningSpeechletRequestStreamHandler`:

```java
static {
    /*
     * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
     * Alexa Skill and put the relevant Application Ids in this Set.
     */
    supportedApplicationIds.add(
            "ADD_ID's_HERE"
    );
}
```

## Lambda Handler

The lambda handler for AWS would be:

```
com.ortecfinance.financialplanning.FinancialPlanningSpeechletRequestStreamHandler
```

## Build

Build with maven, be sure to include dependencies:

```
mvn assembly:assembly -DdescriptorId=jar-with-dependencies package
```