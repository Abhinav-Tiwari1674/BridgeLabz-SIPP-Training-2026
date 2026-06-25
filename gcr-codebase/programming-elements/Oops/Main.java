class Student{
    int id;
    String name;
    double marks;
    Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj==null||getClass()!=obj.getClass())
            return false;

        Student s=(Student)obj;
        return id==s.id &&
               name.equals(s.name) &&
               marks==s.marks;
    }

    @Override
    public int hashCode(){
        return id + name.hashCode() + (int)marks;
    }

    @Override
    public String toString(){
        return "Student{id="+id+", name='"+name+"', marks="+marks+"}";
    }
}

public class Main{
    public static void main(String[] args){
        Student s1=new Student(101,"Abhi",90.5);
        Student s2=new Student(101,"Abhi",90.5);
        Student s3=s1;

        System.out.println(s1);

        System.out.println("s1 == s2 : "+(s1==s2));
        System.out.println("s1 == s3 : "+(s1==s3));

        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s1.equals(s3) : "+s1.equals(s3));

        System.out.println("s1 hashCode : "+s1.hashCode());
        System.out.println("s2 hashCode : "+s2.hashCode());
        System.out.println("s3 hashCode : "+s3.hashCode());
        System.out.println("s1 hashCode == s2 hashCode : "+(s1.hashCode()==s2.hashCode()));
    }
}
