# Zendesk
This is a template of Java framework for tests for the [Zendesk](http://www.zendesk.com.com/).


## Dependencies
Make sure you have installed on your operating system:<br/>
1. [Java](http://www.java.com/) 
2. [Git](https://git-scm.com/)
3. [Maven](https://maven.apache.org/)


### Run Test Suites
`mvn clean test -Duri={URI} -Duser={User name} -Dtoken={Token}`
<br/><br/>or<br/><br/>
`mvn clean site -Duri=https://blabla.zendesk.com/ -Duser=bla@gmail.com -Dtoken=rt1gdfggFDGDdMI1pyafAoaohhDMaFYMmXzs5Mp`


### Parameters
The following are valid test parameters:

*	`-Duri` - Zendesk Sub domen URI<br/>
*	`-Duser` - Zendesk user name<br/>
*	`-Dtoken` - Zendesk token.<br/>


# Reports
In project exist 3 kind of reports:

- [TestNg](http://testng.org/doc/documentation-main.html) produce ‘index.html‘ report and it resides in the same test-output folder. This reports gives the link to all the different component of the TestNG reports like Groups & Reporter Output.

- [SureFire](http://maven.apache.org/surefire/maven-surefire-plugin/) report. The Surefire Plugin is used during the test phase of the build life-cycle to execute the unit tests of an application.

- [Allure](http://allure.qatools.ru/) report. An open-source framework designed to create test execution reports clear to everyone in the team.


# Agenda:
`Using the REST APIs, your task, should you choose to complete it, is to authenticate against your instance of Zendesk`
`and write the following tests: (Don't forget to verify you are authenticated)`
` 
`Use the tickets api: https://developer.zendesk.com/rest_api/docs/core/tickets`
` 
`1. Verify you are able to create a ticket`
`2. Verify you are able to add a comment to the ticket`
`3. Verify you are able to list all tickets for your Zendesk`
`4. Verify you are able to delete a ticket`

`Once you are finished, you will provide us with a zip file containing your work with a short`
`readme file containing instructions for running your code.`
`You are not limited to any tools. Meaning, you can do this in any OO language and using any test framework you desire.`
`Even if you don't complete the full exercise, send in what you have and if we like what we see, we will still get in touch :)`

