/**
 * This is a class for manipulating, validating and comparing Date objects (dates). 
 * It encapuslates the year, month, and day as integers. 
 * Dates are printed in the format as "yyyy-mm-dd" 
 * -- the month or the date will automatically be padded with zeros to make sure it is always 2 digits
 * -- e.g.  Date date = new Date(2024, 9, 28) will print "2024-09-28"
 */

 import java.util.ArrayList;
 import java.util.Arrays;
 
 public class Date {
     
     private int year;
     private int month;
     private int day;
 
     // months with 31 days 
     public static final ArrayList<Integer> BIG_MONTHS = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
 
     // months with 30 days 
     public static final ArrayList<Integer> SMALL_MONTHS = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
 
     public Date(int year, int month, int day){
         if (isValidateYear(year)){
             this.year = year;   
         }
 
         
         if (isValidateMonth(month)){
             this.month = month; 
         }
 
         if (isValidateDay(day)){
             this.day = day;
         }
 
         
     }
 
     public int getDay(){
         return this.day;
     }
 
     public int getMonth(){
         return this.month;
     }
 
 
     public int getYear(){
         return this.year;
     }
 
     public void setYear(int year){
         if (isValidateYear(year)){
             this.year = year;
         }
     }
 
     public void setMonth(int month){
         if (isValidateMonth(month)){
             this.month = month;
         }
     }
 
     public void setDay(int day){
         if (isValidateDay(day)){
             this.day = day;
         }  
     }  
 
     public boolean isValidateDay(int day){
         
         if (BIG_MONTHS.contains(this.month)){
 
             if (day > 0 && day < 32){
                 return true;
 
             }       
         }
         else if(SMALL_MONTHS.contains(this.month)){
             if ((day > 0) && (day < 31)){
                 return true;
             }
         }
         else if(this.month == 2){
             if (isLeapYear(this.year)){
                 if((day > 0) && (day < 30)){
                     return true;
                 }
             }
             else{
                 if((day > 0) && (day < 29)){
                     return true;
                 }
             }
         }
         else{
             
             throw new IllegalArgumentException("Invalid day: " + day + " for month: " + this.month + " in year: " + this.year); 
            
         }
         return false;
 
     }
 
     private boolean isValidateMonth(int month){
         return (month > 0 && month < 13);
 
     }
 
     private boolean isValidateYear(int year){
         return (year > 2000);
 
     }
 
      // Leap year is the year that can be divisible by 4 or for the year that can be divisible by 100, it should be divisible by 400
      private boolean isLeapYear(int year){
         return (year % 4 == 0 && year % 100 != 0 | year % 400 == 0);
     }
 
 
     public boolean isValidateDate(Date date){
         return  isValidateYear(date.getYear()) && isValidateMonth(date.getMonth()) && (isValidateDay(date.getDay()));
     }
 
 
 
     @Override
     public boolean equals(Object obj){
         // check if obj is null
         if (obj == null) {
             return false;
         }
 
         // check if obj is the Date type
         if (!(obj instanceof Date)){
             return false;
         }
 
         // cast the object to Date so that it can access the fields
         Date otherDate = (Date) obj;
 
         return otherDate.getDay() == this.day && otherDate.getMonth() == this.month && otherDate.getYear() == this.year;
 
     }
 
 
     @Override
     public String toString() {
        return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
    }
 
 
    // Testing 
     public static void main(String[] args) {
 
         try {
            Date date1 = new Date(2024, 3, 12);
            System.out.println("Date 1: " + date1);
 
            System.out.println(date1.isValidateDay(12));
       

            Date date2 = new Date(2024, 9, 28);
            System.out.println("Date 2: " + date2);
            System.out.println("Are dates equal? " + date2.equals(date1));
 
             // Invalid Date
             Date invalidDate = new Date(2023, 2, 29);

         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());
         }
 
         try {
             Date date1 = new Date(2024, 4, 12);
             System.out.println(date1.getYear());
             System.out.println("Date 1: " + date1);
 
             Date date2 = new Date(2024, 9, 28);
             System.out.println("Date 2: " + date2);
             System.out.println("Are dates equal? " + date2.equals(date1));
 
             // Invalid Date
             Date invalidDate = new Date(2023, 2, 29);
         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());
         }
 
         // Testing invalid setters
         try {
             Date date3 = new Date(2024, 1, 15);
             date3.setDay(40); // Invalid day
         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());
         }
 
         try {
             Date date4 = new Date(2024, 1, 15);
             date4.setMonth(13); // Invalid month
         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());
         }
        
     }
 }
 
 
 
 
 
