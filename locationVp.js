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
        username.sendKeys('test.vpoftech@revature.com.int1');
        password.sendKeys('yuvi1712');
        goButton.click();
        browser.waitForAngularEnabled(false);
        browser.sleep(2000);
        expect(browser.getCurrentUrl()).toEqual('https://dev.assignforce.revaturelabs.com/home');
  
    });

    it('click location tab', function(){
        browser.sleep(2000);
        element(by.xpath('/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a/span/span')).click();
        expect(browser.getCurrentUrl()).toEqual('https://dev.assignforce.revaturelabs.com/locations');
    })
  
    it('all location', function(){
        browser.sleep(2000);
        element(by.xpath('//*[@id="locAdd"]/md-icon')).click();
        browser.sleep(2000);
        element(by.xpath('//*[@id="input_2"]')).sendKeys('Gobline');
        element(by.xpath('//*[@id="input_3"]')).sendKeys('Chantilly');
        browser.sleep(2000);
        element(by.xpath('/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]/span')).click();
    })
   

    it('check location added or not', function(){
        browser.sleep(2000);
        var dog = element(by.className('ng-scope')).getText();
        browser.sleep(10000);
        expect(dog).toContain('Gobline');
    })

    // it('Delete location', function(){
    //     browser.sleep(2000);
    //     element(by.xpath('//*[@id="view"]/md-card/md-content/md-list/md-list-item[27]/div[1]/div[1]/md-checkbox/div[1]')).click();
    //     element(by.xpath('//*[@id="view"]/md-card/md-toolbar/button[5]/md-icon')).click();
    // })

    it('add building', function(){
        browser.sleep(2000);
        element(by.xpath('//*[@id="view"]/md-card/md-content/md-list/md-list-item[25]/div[1]/div[1]/md-checkbox/div[1]')).click
        browser.sleep(2000);
        element(by.xpath('//*[@id="bldgAdd"]')).click();
        browser.sleep(2000);
        element(by.xpath('//*[@id="input_5"]')).sendKeys('building 1');
        // element(by.xpath('/html/body/div[3]/md-dialog/form/div/md-dialog-actions/button[1]')).click();
        // browser.pause();
    })

    it('logout', function(){
        element(by.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button/span/span")).click();
        browser.sleep(2000);
        expect(browser.getTitle()).toEqual('Login | Salesforce')
    })
  });