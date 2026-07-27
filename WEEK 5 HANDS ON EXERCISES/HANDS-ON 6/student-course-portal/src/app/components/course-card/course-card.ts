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

  @Input() courseName: string = '';
  @Input() instructor: string = '';
  @Input() duration: string = '';

  @Output() enroll = new EventEmitter<string>();

  isPopular = true;

  enrollCourse() {
    this.enroll.emit(this.courseName);
  }

}