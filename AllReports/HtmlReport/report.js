$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/ForgotPass.feature");
formatter.feature({
  "name": "To validate forgot password page in facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Forgot"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User login facebook application through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_login_facebook_application_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate forgot passwrord",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Forgot"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User clicks forgot password link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_forgot_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches the account linked with mobilenumber",
  "rows": [
    {
      "cells": [
        "username",
        "Siva"
      ]
    },
    {
      "cells": [
        "mailid",
        "siva@gmail.com"
      ]
    },
    {
      "cells": [
        "phno",
        "98745214741"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_searches_the_account_linked_with_mobilenumber(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "To validate login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Forgot"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User login facebook application through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_login_facebook_application_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login funtionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Forgot"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enter valid email and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "selenium",
        "selenium07.98@yahoo.com",
        "87451"
      ]
    },
    {
      "cells": [
        "siva",
        "siva@gmail.com",
        "sivas874210"
      ]
    },
    {
      "cells": [
        "automation",
        "automationsel@gmail.com",
        "1234"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_invalid_credentials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});