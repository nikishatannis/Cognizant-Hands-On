import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgIf, NgFor } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';
import { CourseService } from '../../services/course';
import { StudentForm } from '../../components/student-form/student-form';


@Component({
  selector: 'app-home',
  standalone: true,
 imports: [
  FormsModule,
  NgIf,
  NgFor,
  CourseCard,
  StudentForm
],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {

  studentName = 'Nikisha';

  isEnrolled = true;

  courses: any[] = [];

  constructor(private courseService: CourseService) {
    this.courses = this.courseService.getCourses();
  }

  onEnroll(course: string) {
    alert('Successfully enrolled in ' + course);
  }

}