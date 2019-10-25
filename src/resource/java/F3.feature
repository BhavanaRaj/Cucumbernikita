Feature: Shopping
Scenario: online shopping
Given user logs into amazon
When user searches for the below products
|bag|
|lipstick|
|purse|
Then user purchase the selected product
