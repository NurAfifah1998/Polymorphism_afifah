public class LaciMakeup {
    //atribut
    String nama_laci;
    String nama_makeup;
    String jenis_makeup;
    int jumlah_makeup;
//construktor
    public LaciMakeup() {
    }

    public LaciMakeup(String nama_laci, String nama_makeup, String jenis_makeup, int jumlah_makeup) {
        this.nama_laci = nama_laci;
        this.nama_makeup = nama_makeup;
        this.jenis_makeup = jenis_makeup;
        this.jumlah_makeup = jumlah_makeup;
    }

    void tampilData_makeup(){
        System.out.println("nama laci\t:"+nama_laci);
        System.out.println("nama makeup\t:"+nama_makeup);
        System.out.println("jenis makeup\t:"+jenis_makeup);
        System.out.println("jumlah makeup\t"+jumlah_makeup);
    }

    void tampilData_makeup2(String karakter){
        System.out.println("nama laci\t:"+nama_laci);
        System.out.println("nama makeup\t:"+nama_makeup);
        System.out.println("jenis makeup\t:"+jenis_makeup);
        System.out.println("jumlah makeup\t"+jumlah_makeup);
        System.out.println(karakter);
    }
}
