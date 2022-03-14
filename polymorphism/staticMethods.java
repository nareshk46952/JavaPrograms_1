public class staticMethods {
    static String collegeName = "Sri Chaitnya junior college";
    static String clgCity = "Hyd";
    public static void setCollegeName(String collegeName) {
        staticMethods.collegeName = collegeName;
    }
    //overloading static methods
    static void setCollegeName(String clgName, String city){
        staticMethods.collegeName = clgName;
        staticMethods.clgCity = city;
    }
    static String getCollegeName(){
        return collegeName;
    }
    static String getCollegeNameAndCity(){
        return collegeName +" "+ clgCity;
    } 
    public static void main(String[] args) {
        String cName = getCollegeName();
        System.out.println(cName);
        setCollegeName("BITS College");
        String modifiedClgName = staticMethods.getCollegeName();
        System.out.println(modifiedClgName);
        String clgCity = staticMethods.clgCity;
        System.out.println(clgCity);
        //invoking overloaded methods with 2 arguments and changing clg name and city
        setCollegeName("ST.Johns","Anatpur");
        System.out.println(getCollegeNameAndCity());
    }
}
