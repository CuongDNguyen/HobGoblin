// spec.js
describe('VP login', function() {
    var username = element(by.xpath("//input[@id='username']"));
    var password = element(by.xpath("//input[@id='password']"));
    var goButton = element(by.xpath("//input[@id='Login']"));
    var latestResult = element(by.binding('latest'));
  
    beforeEach(function() {
      browser.waitForAngularEnabled(false);
      browser.get('https://dev.assignforce.revaturelabs.com/');
    });
  
    it('Vp have a title', function() {
      
      expect(browser.getTitle()).toEqual('Login | Salesforce');
    });

    it('VP login crediential', function(){
        username.sendKeys('test.vpoftech@revature.com.int1');
        password.sendKeys('yuvi1712');

        goButton.click();
        browser.waitForAngularEnabled(false);
        browser.get('https://dev.assignforce.revaturelabs.com/home');
        expect(browser.getTitle()).toEqual('AssignForce');

    });
  
    
  });