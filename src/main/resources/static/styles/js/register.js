


var error__name=document.getElementById('name_error');
var error__email=document.getElementById('email_error');
var error__password=document.getElementById('password_error');
var error__retype=document.getElementById('retype-password_error');

function validationName() {
   var chec =document.getElementById('nameId').value;

   if(chec.length==0){
       error__name.innerHTML='Name is required';
       return false;
   }else if (!chec.match(/^[A-Za-z]*$/)){
       error__name.innerHTML='Write correct name ';
       return false;
   }return true

}