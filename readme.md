## @ImportHttpService test

- all interfaces imported via @ImportHttpService are not detected as beans (both scanned in the base package and added explicitly)
- no code insight for #basePackages (see ClientsGroupsConfig)
  https://youtrack.jetbrains.com/issue/IDEA-379086/Spring-HTTP-Client-support-ImportHttpServices
- incorrect HTTP Requests generation for clients (baseurl is not considered properly) - not specific for @ImportHttpService (see Test2Client for example)
  https://youtrack.jetbrains.com/issue/IDEA-296007/Spring-6-Declarative-HTTP-Client-exchange-endpoints-should-respect-the-set-client-baseURL
- incorrect HTTP Requests generation for absolute URL in client (see Test1Client)
  https://youtrack.jetbrains.com/issue/IDEA-378798/Cannot-generate-HTTP-Client-request-for-declarative-client-if-full-URL-is-specified
- false-positive error for HttpServiceProxyRegistry autowiring (see SpringClientTestApplication)
  https://youtrack.jetbrains.com/issue/IDEA-379092/Spring-error-on-HttpServiceProxyRegistry-bean-autowiring
- proper Structure for HttpExchange interfaces https://youtrack.jetbrains.com/issue/IDEA-379756/Spring-Structure-we-could-show-endpoints-in-the-HttpExchange-interfaces-Structure
- groups support:
   -  no code insight for groups (see ClientsGroupsConfig, SpringClientTestApplication, application.properties)
   -  no support for groups baseUri properties for endpoints detection