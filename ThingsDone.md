# Things Done
>Just a little list of things we done during the course

1. Generate a yaml file in the [https://editor.swagger.io/] (swagger editor) and download it. If needed check [https://swagger.io/docs/specification/data-models/data-types/#numbers] (OpenAPI Documentation Guide)
2. Make sure you got docker open and running. To run a container, paste this command into your powershell(or terminal)
```sh
docker run -d -p 80:80 docker/getting-started
```
3. Use this command for swagger server generation
```sh
docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli:latest-release generate -i [local path from user folder to yaml] -g spring -o [local path from user folder to export folder]
```
_For Example in my case
```sh
docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli:latest-release generate -i local/GIT/swad-timesheet/timesheetv4.yaml -g spring -o local/openapi_timesheet
```


## Resources
* [https://editor.swagger.io/] (swagger editor)
* [https://swagger.io/docs/specification/data-models/data-types/#numbers] (OpenAPI Documentation Guide)
* [https://reflectoring.io/spring-boot-openapi/] (API-First Developement with Spring Boot and Swagger). 
* [https://www.docker.com/products/docker-desktop/] (docker)

## Meta
* Diana-Grace Bernal [mailto:fhb190776@fh-vie.ac.at]
* Natalie Bruckmüller [mailto:fhb201236@fh-vie.ac.at]
* Florian Bürbaumer [mailto:fhb190777@fh-vie.ac.at]
