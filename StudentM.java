import java.util.Scanner;

    import java.sql.Timestamp;
/**
* This will 
* */
class Student{


 private String name;
public String getName(){
return name;
}
/*
*It will set the Name if it is valid
*/
 public boolean setname(String Name)
    
  {
    boolean flag=false;
    for(int i=0;i<name.length();i++)
    {
      if((!(name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)>='a' && name.charAt(i)<='z')&&(name.charAt(i)==' ')))
      {
        return flag;
      }
      else
      {
        flag = true;
      }
    }
    return flag;
  }
 private String regno;
public String getRegno(){
return regno;
}
/**
*It will set the Registration Number if it is valid
*/
    public boolean setregno(String Regno)
  {
    boolean flag = false;
    int size = regno.length();

    if(!(regno.length()==11))
    {
      return flag;
    }
     if(regno.length()==11)
    {
      for(int i=0;i<4;i++)
      {
        if( !(regno.charAt(i)>='0'&& regno.charAt(i)<='9') )
        {return flag;}
      }
      if( !(regno.charAt(4)=='-') )
      {return flag;}
      for(int i=5;i<7;i++)
      {
        if( !(regno.charAt(i)>='A'&& regno.charAt(i)<='Z') )
        {return flag;}
      }
      if( !(regno.charAt(7)=='-') )
      {return flag;}
      for(int i=8;i<11;i++)
      {
        if(!(regno.charAt(i)>='0'&& regno.charAt(i)<='9'))
        {return flag;}
      }
      flag = true;
    }
      return flag;
  }
private String dob;
public String getDOB(){
return dob;
}
/**
*It will set the DOB if it is valid
*/
private double cgpa;
public double getCgpa(){
return cgpa;
}
/**
*It will set the cgpa if it is valid
*/
public boolean setcgpa(double Cgpa)
{
  boolean flag=false;
if(Cgpa>=1.0 && Cgpa<=4.0)
{
flag=true;
this.cgpa= Cgpa;
}
return flag;
}

public String cnic;
public String getCnic(){
return cnic;
}
/**
*It will set the value of Cnic if it is valid
*/
public boolean setcnic(String Cnic)
  {
    boolean flag = true;
    int size = cnic.length();
    if(size == 13)
    {
      for(short i = 0;i< 13;i++)
      {
        if( cnic.charAt(i) >= '0' && cnic.charAt(i) <= '9')
        {
          flag = true;
        }
        else{
         flag=false;
       break;
      }
    }
    }
    else
    {
      flag = false;
    }
    return flag;
  }

/**
*Calculate age of student upto current date
*/
public int getAge(){
Scanner Scanner=new Scanner(System.in);
    
    LocalDate today = LocalDate.now(); //stores current date YYYY/MM/DD
    String dOB="";
    System.out.println("Enter Date of Birth (YYYY/DD/MM): ");
    dOB = input.nextLine();
    String []dob = dOB.split("/");
    int year,day,month;
    year = Integer.parseInt(dob[0]); //parseInt is used to convert
    day = Integer.parseInt(dob[1]);
    month = Integer.parseInt(dob[2]);
    LocalDate birth = LocalDate.of(year,month,day); // birth stores Date entered by user in form of YYYY/MM/DD
    int days = Period.between(birth,today).getDays();
    int years = Period.between(birth,today).getYears();
    int months = Period.between(birth,today).getMonths();  
    System.out.println("Years: "+years+"   "+"Months: " + months +"   "+"Days: " + days );

}
/**
*Returns CGPA of user
*/
public String getStatus(){
Student s1=new Student();
String status="";
double Cgp=s1.getCgpa();{
if(Cgp<1.0)
{
status="Status is Suspended";
}
else if( Cgp>2.0&&Cgp<=2.5)
{
status="Status is Below Average";
}
else if(Cgp>2.5&&Cgp<=3.3)
{
status="Status is Average";
}
else if(Cgp>3.3&&Cgp<=3.5)
{
status="Status is Below Good";
}
else if (Cgp>3.5)
{
status="Status is Excellent";
}
}
}
public int numberOfWordsInName(){

}
/**
*Returns gender of user
*/
public String getGender()
{
String gender="";
setcnic=getCnic();
int num=cnic.charAt(12);
if(num%2==0)
{
gender="FEMALE";
}
else
{
gender="MALE";
}
return gender;
}

}