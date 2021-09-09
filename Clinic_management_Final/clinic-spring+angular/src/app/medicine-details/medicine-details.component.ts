import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Medicine } from '../medicine';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-medicine-details',
  templateUrl: './medicine-details.component.html',
  styleUrls: ['./medicine-details.component.css']
})
export class MedicineDetailsComponent implements OnInit {
  title = "Medicine Details";
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

  list(){
    this.router.navigate(['medicines']);
  }

}
