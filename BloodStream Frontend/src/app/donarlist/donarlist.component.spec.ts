import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DonarlistComponent } from './donarlist.component';

describe('DonarlistComponent', () => {
  let component: DonarlistComponent;
  let fixture: ComponentFixture<DonarlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DonarlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DonarlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
