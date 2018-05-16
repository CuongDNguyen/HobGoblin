describe('Testing location tab', function() {
  var username = element(by.xpath("//input[@id='username']"));
  var password = element(by.xpath("//input[@id='password']"));
  var goButton = element(by.xpath("//input[@id='Login']"));
  var latestResult = element(by.binding('latest'));
 // browser.manage().timeouts().implicitlyWait(3000);

  it('should have a title', function() {
    browser.waitForAngularEnabled(false);
    browser.get('https://dev.assignforce.revaturelabs.com/');
    expect(browser.getTitle()).toEqual('Login | Salesforce');
  });

  it('login crediential', function(){
      username.sendKeys('test.trainer@revature.com.int1');
      password.sendKeys('trainer123');
      goButton.click();
      browser.waitForAngularEnabled(false);
      browser.get('https://dev.assignforce.revaturelabs.com/');
      //expect(browser.getTitle()).toEqual('AssignForce');
      expect(browser.getCurrentUrl()).toEqual('https://dev.assignforce.revaturelabs.com/home');

  });

  it('Checking Location tab', function(){
      browser.sleep(1000);
      element(by.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a/span/span")).click();
      expect(browser.getCurrentUrl()).toEqual('https://dev.assignforce.revaturelabs.com/locations');

  })

  it('checking location and building', function(){
      browser.sleep(2000);
      element(by.xpath("//*[@id='view']/md-card/md-content/md-list/md-list-item[5]/div[1]/button")).click();
      browser.sleep(2000);
      element(by.xpath("//*[@id='view']/md-card/md-content/md-list/md-list-item[5]/div[1]/button")).click();
      var building = element(by.xpath("//*[@id='loc3']/md-list-item[2]/div/div[1]/p[2]"));
      browser.sleep(2000);
      expect(building.getText()).toEqual('  whatsapp');
  })
  it('logout', function(){
    element(by.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button/span/span")).click();
    browser.sleep(2000);
    expect(browser.getTitle()).toEqual('Login | Salesforce')
  })
});