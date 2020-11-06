$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\Features\\login.feature");
formatter.feature({
  "name": "New login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User login validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.userNavigateToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign_in link",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.userClicksOnSignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input email address and password",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_input_email_address_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign_in button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_is_on_account_page()"
});
formatter.result({
  "status": "passed"
});
});