describe('Testing profile tab', function() {
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
        expect(browser.getTitle()).toEqual('AssignForce');

    });

    it('profile tab', function(){
        browser.sleep(1000);
        element(by.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]/a")).click();    
        element(by.xpath("//*[@id='view']/md-card[1]/md-content[2]/div/md-chips/md-chips-wrap/md-chip[2]")).click();
        browser.sleep(5000);
        element(by.xpath("//*[@id='view']/md-card[1]/md-content[2]/md-toolbar/div/button")).click();
        var curSkill = element(by.xpath("//*[@id=\"view\"]/md-card[1]/md-content[2]/div/md-list/button[14]/h5"));
        var addskill = 'B';
        expect(curSkill.getText()).toEqual(addskill);

    })

    it('removing current skill', function(){
        browser.sleep(1000);
        element(by.xpath("//*[@id=\"view\"]/md-card[1]/md-content[2]/div/md-list/button[14]/h5")).click();
        element(by.xpath("//*[@id='view']/md-card[1]/md-content[2]/md-toolbar/div/button/i")).click();
        var skillRemoved = element(by.xpath("//*[@id=\"view\"]/md-card[1]/md-content[2]/div/md-chips/md-chips-wrap/md-chip[23]/div"));
        expect(skillRemoved.getText()).toEqual('b');
    })

    it('uploading certificate', function(){
      browser.sleep(1000);
      element(by.xpath("//*[@id=\"view\"]/md-card[1]/md-content[3]/md-toolbar/div/label/md-icon")).click();
      browser.sleep(1000);
      var certificatename = element(by.xpath("//*[@id='input_3']"));
      certificatename.sendKeys('WebDriver');
      browser.sleep(1000);
      element(by.xpath("//*[@id=\"view\"]/md-card[1]/md-content[3]/div/div/div/button/span")).click();
      browser.sleep(5000);
      var fileExist = element(by.xpath("//*[@id='view']/md-card[1]/md-content[3]/div/md-list/md-list-item[2]/h3"));
      browser.sleep(1000);
      expect(fileExist.getText()).toEqual('WebDriver');
    })

    it('removing certificate', function(){
      browser.sleep(1000);
      element(by.xpath("//*[@id='view']/md-card[1]/md-content[3]/div/md-list/md-list-item[2]/button")).click();
      var remove = element(by.xpath("//*[@id='view']/md-card[1]/md-content[3]/div/md-list/md-list-item[2]/button"));
      expect(remove.getText()).toThrowError();
    })

    it('logout', function(){
      element(by.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button/span/span")).click();
      browser.sleep(2000);
      expect(browser.getTitle()).toEqual('Login | Salesforce')
    })
    
  });