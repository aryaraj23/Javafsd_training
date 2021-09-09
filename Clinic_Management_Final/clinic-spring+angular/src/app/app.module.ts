import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { UpdatePatientComponent } from './update-patient/update-patient.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { MedicineDetailsComponent } from './medicine-details/medicine-details.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';

@NgModule({
  declarations: [
    AppComponent,
    PatientListComponent,
    CreatePatientComponent,
    UpdatePatientComponent,
    PatientDetailsComponent,
    MedicineListComponent,
    CreateMedicineComponent,
    UpdateMedicineComponent,
    MedicineDetailsComponent,
    LoginComponent,
    AdminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
