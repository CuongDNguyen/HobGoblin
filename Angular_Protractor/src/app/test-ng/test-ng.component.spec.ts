import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestNgComponent } from './test-ng.component';

describe('TestNgComponent', () => {
  let component: TestNgComponent;
  let fixture: ComponentFixture<TestNgComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestNgComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestNgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
