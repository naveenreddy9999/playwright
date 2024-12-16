function EmployeeData(name,job){
var payload =JSON.stringify(
{
 "name": name,
  "job": job
  }
);
return payload;
}