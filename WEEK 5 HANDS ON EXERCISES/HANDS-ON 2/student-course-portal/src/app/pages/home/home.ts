import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule, CourseCard],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {

  studentName = 'Nikisha';

  course = {
    name: 'Angular 22',
    instructor: 'Cognizant SME',
    duration: '6 Weeks'
  };
  onEnroll(course: string) {
  alert('Successfully enrolled in ' + course);
}

}