import { Component, OnInit } from '@angular/core';
import { PatientService } from '../../services/patient.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-patient-detail',
  standalone: false,
  templateUrl: './patient-detail.component.html',
  styleUrls: ['./patient-detail.component.scss']
})
export class PatientDetailComponent implements OnInit {
  patient: any = {};

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private patientService: PatientService
  ) { }

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.patientService.getPatient(+id).subscribe(data => {
        this.patient = data;
      });
    }
  }

  save(): void {
    if (this.patient.id) {
      this.patientService.updatePatient(this.patient.id, this.patient).subscribe(() => {
        this.router.navigate(['/patients']);
      });
    } else {
      this.patientService.addPatient(this.patient).subscribe(() => {
        this.router.navigate(['/patients']);
      });
    }
  }

  delete(): void {
    if (this.patient.id) {
      this.patientService.deletePatient(this.patient.id).subscribe(() => {
        this.router.navigate(['/patients']);
      });
    }
  }
}
