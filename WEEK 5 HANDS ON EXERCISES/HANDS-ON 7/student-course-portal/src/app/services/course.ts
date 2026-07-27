import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  getCourses() {
    return [
      {
        id: 1,
        name: 'Angular 22',
        instructor: 'Cognizant SME',
        duration: '6 Weeks'
      },
      {
        id: 2,
        name: 'React',
        instructor: 'John',
        duration: '5 Weeks'
      },
      {
        id: 3,
        name: 'Spring Boot',
        instructor: 'David',
        duration: '8 Weeks'
      }
    ];
  }

  getCourseById(id: number) {
    return this.getCourses().find(course => course.id === id);
  }
}