import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgIf, NgFor } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    FormsModule,
    NgIf,
    NgFor,
    CourseCard
  ],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {

  studentName = 'Nikisha';

  isEnrolled = true;

  courses = [
    {
      name: 'Angular 22',
      instructor: 'Cognizant SME',
      duration: '6 Weeks'
    },
    {
      name: 'React',
      instructor: 'John'
      ,
      duration: '5 Weeks'
    },
    {
      name: 'Spring Boot',
      instructor: 'David',
      duration: '8 Weeks'
    }
  ];

  onEnroll(course: string) {
    alert('Successfully enrolled in ' + course);
  }

}