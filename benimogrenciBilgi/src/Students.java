public class Students {
    //Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
//Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
    String ogradi;
    Course mat, fizik, kimya;
    Course mat1, fizik1, kimya1;
    double ortalama;
    double ortEtkisi;
    boolean isKontrol;


    Students() {
        this.ogradi = ogradi;
        this.kimya = kimya;
        this.fizik = fizik;
        this.mat = mat;
        this.mat1 = mat1;
        this.kimya1 = kimya1;
        this.fizik1 = fizik1;
        this.ortEtkisi = ortEtkisi;
        islem();
        isKontrol = false;


    }

    public void islem() {

        this.ortalama = (this.mat.note + this.fizik.note + this.kimya.note) / 3;

    }


}