describe('Testing assign force trainer tab trainer side', function () {
    var username = element(by.xpath("//input[@id='username']"));
    var password = element(by.xpath("//input[@id='password']"));
    var goButton = element(by.xpath("//input[@id='Login']"));
    var latestResult = element(by.binding('latest'));
  
    it('should have a title', function () {

      browser.waitForAngularEnabled(false);
      browser.get('https://dev.assignforce.revaturelabs.com/');
      expect(browser.getTitle()).toEqual('Login | Salesforce');
    });
  
    it('trainer login should work with correct user name and password', function () {
      username.sendKeys('test.trainer@revature.com.int1');
      password.sendKeys('trainer123');
      goButton.click();
      expect(browser.getTitle()).toEqual('AssignForce');
    });
  
    it('trainer tab should open up when clicked', function () {
      browser.element(by.xpath('/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a')).click();
      expect(browser.getCurrentUrl()).toContain('https://dev.assignforce.revaturelabs.com/trainers');
    });
    it('trainer pto calendar should open when clicked', function () {
        browser.element(by.xpath('//*[@id="view"]/md-card/md-toolbar[1]/div/button[2]')).click();
    })
    it('trainer pto calendar new pto request added when filled out and submitted', function () {
        browser.sleep(4000);
        browser.element(by.xpath('//button[@ng-click="tCtrl.showPTODialog()"]')).click();
        browser.sleep(1000);
        browser.element(by.xpath('//button[@ng-click="ctrl.openCalendarPane($event)"]')).click();
        browser.sleep(1000);
        browser.element(by.xpath('//td[@aria-label="June 2018"]')).click();
        browser.sleep(1000);
        browser.element(by.xpath('//td[@aria-label="Wednesday June 20 2018"]')).click();
        browser.sleep(1000);
        browser.element(by.xpath('//form[@name="ptoForm"]/md-dialog-content/div/md-input-container[2]/md-datepicker/div/button')).click();
        browser.sleep(1000);
        browser.element(by.xpath('//td[@aria-label="December 2018"]')).click();
        browser.sleep(1000);
        browser.element(by.xpath('//td[@aria-label="Monday December 31 2018"]')).click();
        browser.element(by.xpath('//form[@name="ptoForm"]/md-dialog-actions/button')).click();
        browser.sleep(1000);
        expect(browser.getTitle()).toEqual('Revature');
    })
    
  })