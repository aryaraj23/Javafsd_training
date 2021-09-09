import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Medicine } from '../medicine';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-update-medicine',
  templateUrl: './update-medicine.component.html',
  styleUrls: ['./update-medicine.component.css']
})
export class UpdateMedicineComponent implements OnInit {

  mid: string;
  medicine: Medicine;

  constructor(private route: ActivatedRoute,private router: Router,
    private medicineService: MedicineService) { }

  ngOnInit() {
    this.medicine = new Medicine();

    this.mid = this.route.snapshot.params['mid'];
    
    this.medicineService.getMedicine(this.mid)
      .subscribe(data => {
        console.log(data)
        this.medicine = data;
      }, error => console.log(error));
  }

  updateMedicine() {
    this.medicineService.updateMedicine(this.mid, this.medicine)
      .subscribe(data => {
        console.log(data);
        this.medicine = new Medicine();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateMedicine();    
  }

  gotoList() {
    this.router.navigate(['/medicines']);
  }

}
