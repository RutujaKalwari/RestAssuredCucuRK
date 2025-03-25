Feature: testing for books get api
 
Scenario: 1.Response should get multiple books data
  Given Hit books API
  Then Validate API returns multiple books json
 
#Scenario: 2.Validate single book json should have title value as Git Pocket Guide
  #Given Hit books API
  #Then Validate attribute at json path "books[0].title" and its value "Git Pocket Guide"
  #
#Scenario: 3.Verify isbn attribute have numbers only (not any character)
  #Given Hit books API
  #Then Verify "books[1].isbn" attribute have numbers only
  
#Scenario: 3.Validate single book json should have title value as Learning JavaScript Design Patterns
  #Given Hit books API
  #Then Validate attribute at json path "books[1].title" and its value "Learning JavaScript Design Patterns"
  #
#Scenario: 4.Validate single book json should have author value as Glenn Block et al.
  #Given Hit books API
  #Then Validate attribute at json path "books[2].author" and its value "Glenn Block et al."
#//----------------------------------  --------------------------------------------------------------------------------------------------------


  
#Scenario: 6.if end point is not correct (typing mistake, like books) it should not return data
  #Given If end point is not correct
  
#Scenario: 7.Verify total 9 attributes are present for each book
  #Given Hit books API
  #Then Verify total 9 attributes are present for each book
  
#Scenario: 8.Page attribute should be a number (not a character)
  #Given Hit books API
  #Then "pages" attribute should be a number 
  
#Scenario: 9.Website attribute value should shart with "http://" and end with "index.html"
  #Given Hit books API
  #Then "website" attributes value should start with "http://" and end with "index.html"
  #
#Scenario: 10.Verify all 9 attributes should not be blank
  #Given Hit books API
  #Then Verify all 9 attributes should not be blank
  
#Scenario: 11.verify date format "YYYY-MM-DDThh:mm:ss.000Z"
  #Given Hit books API
  #Then verify date format "YYYY-MM-DDThh:mm:ss.000Z"
  
Scenario: 12.Validate that "No starch Press" publisher has only 2 books namely “Eloquent JavaScript, Second Edition” and “Understanding ECMAScript 6”
  Given Hit books API
  Then Validate that "No starch Press" publisher has only 2 books namely "Eloquent JavaScript, Second Edition" and "Understanding ECMAScript 6"
  
  
