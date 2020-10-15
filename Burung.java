public class Burung {
    String nama; //atribut nama
    String jenis; //atribut jenis
    String warna; //atribut warna
    String sayap; //atribut sayap

    //method terbang
    public void terbang(){
        this.sayap = "mengepak";
        System.out.println("Burung "+this.nama+" Sedang Terbang");
    }
    //method tidur
    public void tidur(){
        this.sayap = "diam";
        System.out.println("Burung "+this.nama+" Sedang Tidur");
    }
}
