## 

## a guide to doing stuff today

[original instructions](https://github.com/codefellows/seattle-java-401d5/tree/master/class-26/lab)

## clone and download todays lab
git clone [lab](https://github.com/codefellows/seattle-java-401d5)
```
git clone https://github.com/codefellows/seattle-java-401d5.git
```
## create your two tables here
- [create the table here](https://us-west-2.console.aws.amazon.com/dynamodb/home?region=us-west-2#gettingStarted:)
- ensure that your tables are pointing correctly in your model as show below in "Customer.java":
```$xslt
@DynamoDBTable(tableName = "people")
public class Customer {
```
- should look like this: [here](assets/createTable.png);


## adding creditinals on the command line in a config file

- run this command and copy your secret key and access key into AWS
```$xslt
aws configure
```

- you can access your secret key from this link:
[AWS management console](https://console.aws.amazon.com/iam/home#/security_credentials)

## adding two lines to the config.yml inside .elasticbeanstalk 
### adding this allows a location pointer for the deploy to "launch" the jar

```$xslt
//at the bottom of the file add these
deploy:
  artifact: ./build/libs/People-0.0.1-SNAPSHOT.jar
```

## before you add everything to github, make sure your application.properties are in your git ignore
```$xslt
# app secret keys
application.properties
```


## finally, run these command line commands
```$xslt
eb init
eb create
eb deploy
```
