import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  employees: Object;

  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
	this.employeeService.getEmployees().subscribe(data => {
		this.employees = data;
		console.log(this.employees);
	})
  }
}
