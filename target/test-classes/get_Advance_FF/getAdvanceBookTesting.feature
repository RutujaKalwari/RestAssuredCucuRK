
Feature: testing for books get adv api
 
Scenario: 1.Response should get multiple books data
  Given Hit books API
  Then Validate API returns multiple books json
  
#Scenario: 2.Validate single book json should have title value as Git Pocket Guide
  #Given Hit books API
  #Then Validate attribute at json path "books[XX].title" and its value "Git Pocket Guide"

  
#Scenario: 4.Validate single book json should have author value as Glenn Block et al.
  #Given Hit books API
  #Then Validate attribute at json path "books[2].author" and its value "Glenn Block et al."
  #
Scenario : 11.Validate data inside json object irrespective of its position in Json arrray
  Given : Hit books API
  Then : Books JSON response should contain a book with title "Learning JavaScript Design Patterns"
  
  
  
  
  
  
  