describe('Testing assign force curricula tab trainer side', function () {
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
    browser.sleep(3000);
  });

  it('curricula tab should open up when clicked', function () {
    browser.element(by.xpath('/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a')).click();
    expect(browser.getCurrentUrl()).toContain('https://dev.assignforce.revaturelabs.com/curriculum');

  });

  it('Core curricula button should collapse properly', function () {
    browser.element(by.xpath('//*[@id="view"]/md-card/md-content/md-card[1]/md-toolbar/div/button')).click();
    expect(browser.element(by.xpath('//*[@id="coreArrow"]')).getText()).toEqual('keyboard_arrow_down');


  });

  it('Core curricula button should expand properly', function () {
    browser.element(by.xpath('//*[@id="view"]/md-card/md-content/md-card[1]/md-toolbar/div/button')).click();
    expect(browser.element(by.xpath('//*[@id="coreArrow"]')).getText());

  });

  it('Focuses button should collapse properly', function () {
    browser.element(by.xpath('//*[@id="view"]/md-card/md-content/md-card[2]/md-toolbar/div/button')).click();
    expect(browser.element(by.xpath('//*[@id="focusArrow"]')).getText()).toEqual('keyboard_arrow_down');

  });

  it('Focuses button should expand properly', function () {
    browser.element(by.xpath('//*[@id="view"]/md-card/md-content/md-card[2]/md-toolbar/div/button')).click();
    expect(browser.element(by.xpath('//*[@id="focusArrow"]')).getText()).toEqual('keyboard_arrow_up');

  });

  it('logout after checking curriculum functions should invalidate session', function() {
    browser.element(by.xpath('/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button')).click();
    expect(browser.getTitle()).toEqual('AssignForce');
  })

})