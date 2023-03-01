Feature: Filtering UI
@Assignment
Scenario: Filtering UI and extracting data for comparison    
Given  coin market application is launching
When   content is shown by 20
Then   caputre required page content
When   set filter on the page by Algorith PoW
And    apply filter with Mineable,Coins and price range
Then   capture filter content and compare with the previous content 