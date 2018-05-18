import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';

import { Routes, RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { SeleniumComponent } from './selenium/selenium.component';
import { TestNgComponent } from './test-ng/test-ng.component';
import { CucumberComponent } from './cucumber/cucumber.component';
import { JasmineComponent } from './jasmine/jasmine.component';
import { ProtractorComponent } from './protractor/protractor.component';
import { KarmaComponent } from './karma/karma.component';
import { HttpClientModule } from '@angular/common/http';

const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'selenium', component: SeleniumComponent},
  { path: 'test-ng', component: TestNgComponent},
  { path: 'protractor', component: ProtractorComponent},
  { path: 'karma', component: KarmaComponent},
  { path: 'jasmine', component: JasmineComponent},
  { path: 'cucumber', component: CucumberComponent}

]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SeleniumComponent,
    TestNgComponent,
    CucumberComponent,
    JasmineComponent,
    ProtractorComponent,
    KarmaComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
