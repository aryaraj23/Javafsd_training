import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Patient } from '../patient';
import { PatientService } from '../patient.service';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit {
  title = "View Patient List";
  patients: Observable<Patient[]> | undefined;
  PatientService: any;

  constructor(private patientService: PatientService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.patients = this.patientService.getPatientList();
  }

  deletePatient(pid: string) {
    this.patientService.deletePatient(pid)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  patientDetails(pid: string){
    this.router.navigate(['details', pid]);
  }

  updatePatient(pid: string){
    this.router.navigate(['update', pid]);
  }

}
