import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  constructor() { }

  getCourses() {
    return [
      {
        name: 'Angular 22',
        instructor: 'Cognizant SME',
        duration: '6 Weeks'
      },
      {
        name: 'React',
        instructor: 'John',
        duration: '5 Weeks'
      },
      {
        name: 'Spring Boot',
        instructor: 'David',
        duration: '8 Weeks'
      }
    ];
  }
}