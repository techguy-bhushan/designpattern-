# Dependency Injection :

Dependency injection pattern allows to removed the hard coded dependencies and make app loosely coupled, testable test and maintainable.

Here we have two packages :
* 1-> problemwithoutdependencyinjection -> Suppose we have a user and we want send some content to user, currently we have a email service to send
content to user. If you will see the SendContent.java class, SendContent class is responsible to initialize the EmailService and then use it, EmailService is hardcoded;
So main problem is here if in future our application provide the support of SMS services to send content to user then we need to refactor
all the code because currently our code is hardcoded also Testing the app will be very difficult since our application is directly creating the email service instance.
There is no way we can mock these objects in our test classes.






