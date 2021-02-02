import { TestBed } from '@angular/core/testing';

import { DonorlistService } from './donorlist.service';

describe('DonorlistService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DonorlistService = TestBed.get(DonorlistService);
    expect(service).toBeTruthy();
  });
});
