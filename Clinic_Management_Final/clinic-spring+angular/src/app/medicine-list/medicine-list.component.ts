import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Medicine } from '../medicine';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-medicine-list',
  templateUrl: './medicine-list.component.html',
  styleUrls: ['./medicine-list.component.css']
})
export class MedicineListComponent implements OnInit {

  medicines: Observable<Medicine[]> | undefined;
  MedicineService: any;

  constructor(private medicineService: MedicineService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.medicines = this.medicineService.getMedicineList();
  }

  deleteMedicine(mid: string) {
    this.medicineService.deleteMedicine(mid)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  medicineDetails(mid: string){
    this.router.navigate(['mdetails', mid]);
  }

  updateMedicine(mid: string){
    this.router.navigate(['updatem', mid]);
  }

}
