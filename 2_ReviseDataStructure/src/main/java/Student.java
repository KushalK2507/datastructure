import lombok.Builder;

@Builder(toBuilder = true)
public class Student {

    public String name;
    public int rollNo;

    public boolean isPresent;

    public int getRollNo(){
        return rollNo;
    }

    public String toString(){
        return rollNo+" "+name+" "+isPresent;
    }
}
