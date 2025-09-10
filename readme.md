## @ImportHttpService test

- all interfaces imported via @ImportHttpService are not detected as beans (both scanned in the base package and added explicitly)
- no code insight for groups (see ClientsGroupsConfig, SpringClientTestApplication)
- no code insight for #basePackages (see ClientsGroupsConfig)
- incorrect HTTP Requests generation for clients (baseurl is not considered properly) - not specific for @ImportHttpService (see Test2Client for example)
- incorrect HTTP Requests generation for absolute URL in client (see Test1Client)
- false-positive error for HttpServiceProxyRegistry autowiring (see SpringClientTestApplication)