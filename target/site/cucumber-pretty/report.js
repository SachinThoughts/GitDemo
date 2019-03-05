$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DLRLoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "DLR Certify Login Page",
  "description": "",
  "id": "dlr-certify-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To verify DLR Certify login with set of credentials",
  "description": "",
  "id": "dlr-certify-login-page;to-verify-dlr-certify-login-with-set-of-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionTests"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I initialize the driver with chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to \u003cURL\u003e site",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \u003cUsername\u003e in Username field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \u003cPassword\u003e in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Go button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should verify if its a successful DLR login",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "dlr-certify-login-page;to-verify-dlr-certify-login-with-set-of-credentials;",
  "rows": [
    {
      "cells": [
        "URL",
        "Username",
        "Password"
      ],
      "line": 15,
      "id": "dlr-certify-login-page;to-verify-dlr-certify-login-with-set-of-credentials;;1"
    },
    {
      "cells": [
        "https://demo.dlrcertify.com/ae",
        "isadmin",
        "T@x5t@mp5!!"
      ],
      "line": 16,
      "id": "dlr-certify-login-page;to-verify-dlr-certify-login-with-set-of-credentials;;2"
    },
    {
      "cells": [
        "https://demo.dlrcertify.com/ae",
        "test99@gmail.com",
        "1234"
      ],
      "line": 17,
      "id": "dlr-certify-login-page;to-verify-dlr-certify-login-with-set-of-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4303745869,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "To verify DLR Certify login with set of credentials",
  "description": "",
  "id": "dlr-certify-login-page;to-verify-dlr-certify-login-with-set-of-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionTests"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I initialize the driver with chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to https://demo.dlrcertify.com/ae site",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter isadmin in Username field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter T@x5t@mp5!! in Password field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Go button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should verify if its a successful DLR login",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDef.i_initialize_the_driver_with_chrome_browser()"
});
formatter.result({
  "duration": 127394383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://demo.dlrcertify.com/ae",
      "offset": 14
    }
  ],
  "location": "CommonStepDef.i_navigate_to_site(String)"
});
formatter.result({
  "duration": 2745638873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "isadmin",
      "offset": 8
    }
  ],
  "location": "CommonStepDef.i_enter_in_username_field(String)"
});
formatter.result({
  "duration": 624338949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T@x5t@mp5!!",
      "offset": 8
    }
  ],
  "location": "CommonStepDef.i_enter_in_password_field(String)"
});
formatter.result({
  "duration": 630640072,
  "status": "passed"
});
formatter.match({
  "location": "DLRLoginPage.i_click_on_go_button()"
});
formatter.result({
  "duration": 5648457411,
  "status": "passed"
});
formatter.match({
  "location": "DLRLoginPage.i_should_verify_if_its_a_successful_dlr_login()"
});
formatter.result({
  "duration": 33309024,
  "status": "passed"
});
formatter.after({
  "duration": 54000096,
  "status": "passed"
});
formatter.before({
  "duration": 3365079703,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To verify DLR Certify login with set of credentials",
  "description": "",
  "id": "dlr-certify-login-page;to-verify-dlr-certify-login-with-set-of-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionTests"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I initialize the driver with chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to https://demo.dlrcertify.com/ae site",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter test99@gmail.com in Username field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter 1234 in Password field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Go button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should verify if its a successful DLR login",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDef.i_initialize_the_driver_with_chrome_browser()"
});
formatter.result({
  "duration": 981300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://demo.dlrcertify.com/ae",
      "offset": 14
    }
  ],
  "location": "CommonStepDef.i_navigate_to_site(String)"
});
formatter.result({
  "duration": 4547986102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test99@gmail.com",
      "offset": 8
    }
  ],
  "location": "CommonStepDef.i_enter_in_username_field(String)"
});
formatter.result({
  "duration": 644017302,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 8
    }
  ],
  "location": "CommonStepDef.i_enter_in_password_field(String)"
});
formatter.result({
  "duration": 600671864,
  "status": "passed"
});
formatter.match({
  "location": "DLRLoginPage.i_click_on_go_button()"
});
formatter.result({
  "duration": 2286411674,
  "status": "passed"
});
formatter.match({
  "location": "DLRLoginPage.i_should_verify_if_its_a_successful_dlr_login()"
});
formatter.result({
  "duration": 20036082915,
  "status": "passed"
});
formatter.after({
  "duration": 48407282,
  "status": "passed"
});
});