import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { HttpClient } from '@angular/common/http';
import 'rxjs/add/operator/catch';
@Component({
  selector: 'app-test-ng',
  templateUrl: './test-ng.component.html',
  styleUrls: ['./test-ng.component.css']
})
export class TestNgComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
  runTestNg(): void {
    this.http.post('http://localhost:8080/ServletAngular/runTestNg.do', {
    }).subscribe(
      res => {
      console.log(res);
    }
  );
  }

}
