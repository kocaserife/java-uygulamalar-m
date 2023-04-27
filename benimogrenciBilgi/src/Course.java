import java.security.spec.RSAOtherPrimeInfo;

public class Course{
    //Nitelikler : name,code,prefix,note,Teacher
    //Metotlar : Course() , addTeacher() , printTeacher()
    Teacher teacher;
    String name ,code;
    String unvan;
     int sozlunot;



    int note;



    Course(String name, String code, String unvan){
     this.name= name;
     this.code=code;
     this.unvan= unvan;
     this.sozlunot= 0;
     this.note=0;

    }
    public void addTeacher(Teacher t) {
        if (this.unvan.equals(t.brans)) {
            this.teacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }


   void printTeacher(){
       System.out.println("adı : " + this.teacher.name);
       System.out.println("telefon : " + this.teacher.mpno);
       System.out.println("brans"  + this.teacher.brans);


    }




}