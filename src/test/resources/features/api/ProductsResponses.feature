@CRUD_Relations
Feature: API CRUD Responses

  @getAPITest
  Scenario: GET API
    Given get products details
    Then Response status code is 200
    Then Verify product tile is "Essence Mascara Lash Princess"

  @PostAPITest
  Scenario: Post API
    Given add person details
    Then Response status code is 201
    Then Verify person name is "naveen"

  @PutAPITest
  Scenario: Put API
    Given update person details
    Then Response status code is 201
    Then Verify person name is "naveen"

  @patchAPITest
  Scenario Outline: Patch API
    Given update person job "<Job>" details
    Then Response status code is 201
    Then Verify person Job is "<Job>"
    Examples:
      | Job               |
      | Software Engineer |

  @getNameTest
  Scenario: GET Name API
    Given get person name details
    Then Response status code is 200

  @DeleteResourceTest
  Scenario: Delete Resource
    Given Delete resource details
    Then Response status code is 204

  @PostUserDetails
  Scenario Outline: Post API
    Given add name "<name>" and job "<job>"
    Then Response status code is 201
    Then Verify person name is "<name>"

    Examples:
    |name|job|
    |naveen    | automation tester  |
    |naveen bandi    | QA |