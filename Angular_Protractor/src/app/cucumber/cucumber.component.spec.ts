import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CucumberComponent } from './cucumber.component';

describe('CucumberComponent', () => {
  let component: CucumberComponent;
  let fixture: ComponentFixture<CucumberComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CucumberComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CucumberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
