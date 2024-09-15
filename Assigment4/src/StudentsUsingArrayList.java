import java.util.ArrayList;
/*
this code is made by Roshan Patidar
 */
class Student{
        private String name;
        private int id;
        private String department;

        public  Student(int id, String name, String department){
            this.name = name;
            this.id = id;
            this.department=department;
        }
        public String getNameame(){
            return name;
        }
        public int getId(){
            return id;
        }
        public String getDepartment(){
            return department;
        }
        public String toString(){
            return "ID:"+id+" Name:"+name + " Department:"+department;
        }
    }

    public class StudentsUsingArrayList {

        ArrayList<Student> list= new ArrayList<>();

        public static void main(String[] args) {

            //Add students
            StudentsUsingArrayList studentIs = new StudentsUsingArrayList();
            studentIs.addStudent(1,"Roshan","Computer Science");
            studentIs.addStudent(2,"Rajendra","Information Technology");
            studentIs.addStudent(3,"Aayush","Civil");
            studentIs.addStudent(4,"Sobhit","Machenical");

            // display students
            studentIs.displyStudent();

            // remove student
studentIs.removeStudent(2);

//display Student
            studentIs.displyStudent();
        }
        public void addStudent(int id,String name,String department){
            Student students = new Student(id,name,department);
            list.add(students);
System.out.println("Student is added successfully: "+students );

        }
        public void removeStudent(int id){
            for(Student student: list){
                if(student.getId()== id){
list.remove(student);
System.out.println("Remove student seccessfully : "+ student);
                }
            }
        }
        public void displyStudent(){

if(list.isEmpty()){
System.out.println("Empty student list! ");
}else{
    System.out.println("List of Student: ");
for(Student students: list){
    System.out.println(students);

}
            }
        }

    }
