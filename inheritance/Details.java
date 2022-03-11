package inheritance;

//multiplace inheritance through interfaces.
interface Details {
void method1();    
}

interface StudenetDetails {
    String getName();
    String getStandard();
    int getRank();
}

interface Employee extends Details,StudenetDetails{
  int getEmpid();
  double getSalary();
  String getJOingDate();
}

