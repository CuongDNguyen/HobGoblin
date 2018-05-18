import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProtractorComponent } from './protractor.component';

describe('ProtractorComponent', () => {
  let component: ProtractorComponent;
  let fixture: ComponentFixture<ProtractorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProtractorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProtractorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
