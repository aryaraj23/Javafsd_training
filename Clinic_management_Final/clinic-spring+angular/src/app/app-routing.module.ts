import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { LoginComponent } from './login/login.component';
import { MedicineDetailsComponent } from './medicine-details/medicine-details.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';

const routes: Routes = [
 
  { path: 'login', component: LoginComponent },
  { path: 'admin', component: AdminComponent },
  {path: 'patients', component: PatientListComponent},
  {path: 'medicines', component: MedicineListComponent},
  {path: 'add', component: CreatePatientComponent},
  {path: 'addm', component: CreateMedicineComponent},
  {path: 'update/:pid', component: UpdatePatientComponent},
  {path: 'updatem/:mid', component: UpdateMedicineComponent},
  {path: 'details/:pid', component: PatientDetailsComponent},
  {path: 'mdetails/:mid', component: MedicineDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
