class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String regNo, String make, int yearOfManufacture, double value) {
        // complete this assignment statements here
    this.regNo = regNo;
    this.make = make;
    this.yearOfManufacture = yearOfManufacture;
    this.value = value; 
    }
// write getter and setter here
 public String getRegNo(){
 return regNo;
 }
 
 public void setRegNo(){
 this.regNo = regNo;
 }  
   
 public String getMake(){
 return make;
 }
  
 public void setMake(){
 this .make = make;
 }
 
 public int getYearOfManufacture(){
 return yearOfManufacture;
 }
 
 public void setYearOfManufacture(){
 this.yearOfManufacture = yearOfManufacture;
 }
 
 public double getValue(){
 return value;
 }
 
 public void setValue(){
 this.value = value;
 }

 public int calculateAge(int currentYear) {
        // compute age here
  return currentYear - yearOfManufacture;
      }

    @Override
    public String toString() {
        return "Reg No: " + regNo + ", Make: " + make + ", Year of Manufacture: " + yearOfManufacture + ", Value: Php" + value;
    }
}