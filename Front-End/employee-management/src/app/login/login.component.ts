import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthentificationService } from '../service/authentification.service';
import { flattenStyles } from '@angular/platform-browser/src/dom/dom_renderer';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = 'amal'
  password = ''
  invalidLogin = false

  constructor(private router : Router,
    private loginservice : AuthentificationService) { }

  ngOnInit() {
  }

  checkLogin() {
    if(this.loginservice.authentification(this.username, this.password)) {
      this.router.navigate([''])
      this.invalidLogin = false
    }
    else {
      this.invalidLogin = true
    }
  }
}
