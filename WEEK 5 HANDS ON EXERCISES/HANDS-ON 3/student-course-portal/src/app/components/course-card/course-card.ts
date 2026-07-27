import { Component, EventEmitter, Input, Output } from '@angular/core';
import { NgClass, NgStyle } from '@angular/common';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [NgClass, NgStyle],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css',
})
export class CourseCard {

  @Input() courseName = '';
  @Input() instructor = '';
  @Input() duration = '';

  @Output() enroll = new EventEmitter<string>();

  enrollCourse() {
    this.enroll.emit(this.courseName);
  }

  isPopular = true;
}