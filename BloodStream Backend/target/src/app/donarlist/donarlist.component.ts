import { Component, OnInit } from '@angular/core';
import { DonorlistService } from 'src/app/services/donorlist.service';
import { DonarList } from '../classes/DonarList';

@Component({
  selector: 'app-donarlist',
  templateUrl: './donarlist.component.html',
  styleUrls: ['./donarlist.component.css']
})
export class DonarlistComponent implements OnInit {

  dlist: DonarList[];

  constructor(private donorListService: DonorlistService) { }

  ngOnInit(): void {


    this.donorListService.getdonarlist().subscribe(
      response => {
        this.dlist = response;
        console.log(this.dlist);
      }
    )

  }
}
