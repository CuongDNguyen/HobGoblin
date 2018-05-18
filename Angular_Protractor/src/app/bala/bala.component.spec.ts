import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BalaComponent } from './bala.component';

describe('BalaComponent', () => {
  let component: BalaComponent;
  let fixture: ComponentFixture<BalaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BalaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BalaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
