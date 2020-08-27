# john-on-tech-webapp-archetype

Steps to run this project:

1. Clone this Git repository
2. Navigate to the folder `john-on-tech-webapp-archetype`
3. Publish the Archetype to your local repository with `mvn clean install`
4. Use the Archetype to bootstrap a new project:
```
 mvn archetype:generate \
   -DgroupId=[your-poject-groupId]  \
   -DartifactId=[your-poject-artifactid] \
   -DarchetypeGroupId=io.jotech \
   -DarchetypeArtifactId=john-on-tech-webapp-archetype  \
   -DinteractiveMode=false
