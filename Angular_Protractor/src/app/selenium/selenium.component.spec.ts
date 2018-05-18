import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SeleniumComponent } from './selenium.component';

describe('SeleniumComponent', () => {
  let component: SeleniumComponent;
  let fixture: ComponentFixture<SeleniumComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SeleniumComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeleniumComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
