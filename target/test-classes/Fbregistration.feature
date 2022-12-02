Feature: To validate the account creation of fb application

Scenario: To create a new account 
Given To launch the browser and mazimise the window
When To launch the url of fb application
And To click the new account creation button

#one dimensional mapdata
And To pass the firstname in firstname textbox
#key value
|firstname1|sathish|
|firstname2|johnwick|
|firtsname3|tony|
|firstname4|maverick|
And To pass the lastname in lastname textbox

#twodimensional mapdata
And To pass the mobileno or email in email textbox
|password1|password2|password3|
|ghyj@|34567|hjhfgeg@|
|hjuytg$|567864|gjkufru$|
|fxdhg|6465465|tdrfyyy%|

And To create new password using new password textbox
Then To close the browser


