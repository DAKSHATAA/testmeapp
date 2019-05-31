$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FEATURES/dsab_3.feature");
formatter.feature({
  "name": "Login for POM framework",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigates to TestMe applicaton",
  "keyword": "Given "
});
formatter.match({
  "location": "Dsab_4.user_navigates_to_TestMe_applicaton()"
});
formatter.result({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat dsab_2.Dsab_4.user_navigates_to_TestMe_applicaton(Dsab_4.java:17)\r\n\tat ✽.user navigates to TestMe applicaton(FEATURES/dsab_3.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter username and passowrd",
  "keyword": "When "
});
formatter.match({
  "location": "Dsab_4.user_enter_username_and_passowrd()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "perform login",
  "keyword": "Then "
});
formatter.match({
  "location": "Dsab_4.perform_login()"
});
formatter.result({
  "status": "skipped"
});
});