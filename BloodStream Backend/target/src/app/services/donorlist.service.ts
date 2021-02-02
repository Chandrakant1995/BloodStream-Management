import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { DonarList } from '../classes/DonarList';

@Injectable({
  providedIn: 'root'
})


export class DonorlistService {

  constructor(private http: HttpClient) { }

  getdonarlist() {
    return this.http.get<DonarList[]>(`http://localhost:8080/donor`);
  }

}
