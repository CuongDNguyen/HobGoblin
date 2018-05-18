describe('Testing assign force curricula tab VP side', function () {
  var username = element(by.xpath("//input[@id='username']"));
  var password = element(by.xpath("//input[@id='password']"));
  var goButton = element(by.xpath("//input[@id='Login']"));
  var latestResult = element(by.binding('latest'));

  it('should have a title', function () {
    browser.sleep(2000);
    browser.waitForAngularEnabled(false);
    browser.get('https://dev.assignforce.revaturelabs.com/');
    expect(browser.getTitle()).toEqual('Login | Salesforce');

  });

  it('vp login should work with correct user name and password', function () {
    username.sendKeys('test.vpoftech@revature.com.int1');
    password.sendKeys('yuvi1712');
    goButton.click();
    expect(browser.getTitle()).toEqual('AssignForce');
  });

  it('curricula tab should open when clicked', function () {
    browser.element(by.xpath('/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a')).click();
    expect(browser.getCurrentUrl()).toContain('https://dev.assignforce.revaturelabs.com/curriculum')
  });

  it('Skills button should collapse properly', function () {
    browser.element(by.xpath('//*[@id="view"]/md-card/md-content/md-card[3]/md-toolbar/div/button')).click();
    expect(browser.element(by.xpath('//*[@id="skillArrow"]')).getText()).toEqual('keyboard_arrow_down');
  });

  it('Skills button should expand properly', function () {
    browser.element(by.xpath('//*[@id="view"]/md-card/md-content/md-card[3]/md-toolbar/div/button')).click();
    expect(browser.element(by.xpath('//*[@id="skillArrow"]')).getText()).toEqual('keyboard_arrow_up');
  });
  it('fill out form and click create should add new skill', function () {
    browser.element(by.xpath('//*[@id="input_1"]')).sendKeys("newSkill");
    browser.element(by.xpath('//*[@id="skill"]/form/div/div/div')).click();
    expect(browser.element(by.xpath('/html/body/div')).getText()).toContain("newSkill");
    browser.sleep(5000);
  });
  it('logout after checking curriculum functions should invalidate session', function() {
    browser.element(by.xpath('/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button/span/span')).click();
    expect(browser.getTitle()).toEqual('AssignForce');
  })
})