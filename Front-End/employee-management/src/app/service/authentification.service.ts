import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {

  constructor() { }

  authentification(username, password){
    if ( username == "amal" && password == "amal"){
      sessionStorage.setItem('username', username)
      return true;
    }
    else{
      return false;
    }
  }

  isUserLoggedIn(){
    let user = sessionStorage.getItem('username')
    console.log(!(user == null))
    return !(user == null)
  }

  logOut(){
    sessionStorage.removeItem('username')
  }
}