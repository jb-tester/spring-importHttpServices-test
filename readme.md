## @ImportHttpService test

- all interfaces imported via @ImportHttpService are not detected as beans (both scanned in the base package and added explicitly)
- no code insights for groups (see ClientsGroupsConfig)
- no code insights for #basePackages (see ClientsGroupsConfig)
- incorrect HTTP Requests generation for clients (baseurl is not considered properly) - not specific for @ImportHttpService (see Test2Client for example)
- incorrect HTTP Requests generation for absolute URL in client (see Test1Client)