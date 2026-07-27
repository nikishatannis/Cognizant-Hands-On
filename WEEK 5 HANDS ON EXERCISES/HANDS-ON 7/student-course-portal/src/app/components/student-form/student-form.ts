import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-student-form',
  standalone: true,
  imports: [FormsModule, NgIf],
  templateUrl: './student-form.html',
  styleUrl: './student-form.css',
})
export class StudentForm {

  student = {
    name: '',
    email: '',
    department: ''
  };

  submitForm() {
    alert(
      'Student Registered!\n\n' +
      'Name: ' + this.student.name +
      '\nEmail: ' + this.student.email +
      '\nDepartment: ' + this.student.department
    );
  }

}