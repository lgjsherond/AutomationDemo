$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Feature/GoogleSearch.feature");
formatter.feature({
  "name": "Feature to test google functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate google search is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.GoogleSearch.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on google search page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.GoogleSearch.user_is_on_google_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a text in search box",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.GoogleSearch.user_enters_a_text_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits enter",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.GoogleSearch.hits_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to search page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.GoogleSearch.user_navigate_to_search_page()"
});
formatter.result({
  "status": "passed"
});
});