# Challenge Summary
- Hacker: Jack Daniel Kinne
- Challenge by: CodeFellows
<!-- Short summary or background information -->
Today, you’ll start building a new application called TaskMaster. 
It’s a task-tracking application with the same basic goal as Trello: 
allow users to keep track of tasks to be done and their status. While we’ll 
start today with a basic feature set, we will continue building out the 
capabilities of this application over time.

The reason we’re starting small on this server is because the main focus 
for the rest of the course is not full-stack web development, but is 
instead to gain experience with different features of Cloud Development. 
Everything we build will have the added task of deployment using the cloud. 
Today, you’ll get to use a remote NoSQL database as the data store for your 
application. As we continue to build out our skill with NoSQL, that structure 
of our data will be our main focus for future development on TaskMaster.


## Challenge Description
<!-- Description of the challenge -->
```
A user should be able to make a GET request to /tasks and receive JSON data 
representing all of the tasks.
Each task should have a title, description, and status.
A user should be able to make a POST request to /tasks with body parameters for title 
and description to add a new task.
All tasks should start with a status of Available.
The response to that request should contain the complete saved data for that task.
A user should be able to make a PUT request to /tasks/{id}/state to advance the status of that task.
Tasks should advance from Available -> Assigned -> Accepted -> Finished.
A user should be able to access this application on the Internet.
The application should be deployed to EC2, with the database on DynamoDB.
You should also use DynamoDB for your local application testing; in other words, 
you should connect to your production database, even in your development environment. 
(This is generally a bad practice, and we’ll see how to work differently soon.)
```

## to run:
- clone repo
- download intellij
- run 'build project'
- navigate on a browser to : http://localhost:8080/albums
### if not on a mac
- in src/main/resources/application.properties 
- add your unique postgres login and password. 

## for basic functionality go to:
- navigate on a browser to : http://taskmaster-dev.us-west-2.elasticbeanstalk.com/
- You will see the empty nothingness of root.
- navigate on a browser to : http://localhost:8080/profile
- You will see your profile page -- you will see all posts for user.
- navigate on a browser to : http://localhost:8080/profile/<number>
- You will see a particular profile page and posts.
- navigate on a browser to : http://localhost:8080/profiles
- You will see all profiles. You can click to subscribe to any
- navigate with the nav bar or browswer to : http://localhost:8080/feed
- you will see all posts from each subscribed person. 

## Credits and Contributions
@Bomibear
Nhu Trinh
Marisha Hoza

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
