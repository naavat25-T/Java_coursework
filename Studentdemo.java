public class Studentdemo {
 private String name;
 private String regNumber;
 private double gpa;
 public void setName(String name) {
 this.name = name;
 }
 public String getName() {
 return name;
 }
 public void setRegNumber(String regNumber) {
 this.regNumber = regNumber;
 }
 public String getRegNumber() {
 return regNumber;
 }
 public void setGpa(double gpa) {
 if (gpa >= 0.0 && gpa <= 5.0) {
 this.gpa = gpa;
 } else {
 System.out.println("Invalid GPA - must be 0.0 to 5.0");
 }
 }
 public double getGpa() {
 return gpa;
 }
}