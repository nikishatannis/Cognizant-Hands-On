import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import { CourseService } from '../../services/course';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  courses: any[] = [];
  searchTerm = '';

  constructor(
    private courseService: CourseService,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  ngOnInit() {
    this.courses = this.courseService.getCourses();

    const search = this.route.snapshot.queryParamMap.get('search');
    if (search) {
      this.searchTerm = search;
    }
  }

  viewCourse(course: any) {
    this.router.navigate(['courses', course.id]);
  }

  searchCourse() {
    this.router.navigate(['courses'], {
      queryParams: {
        search: this.searchTerm
      }
    });
  }
}