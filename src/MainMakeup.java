public class MainMakeup {
    public static void main(String[] args) {
        LaciMakeup laciMakeup = new LaciMakeup();

        laciMakeup.nama_laci="satu";
        laciMakeup.nama_makeup="Lipstik Make Over";
        laciMakeup.jenis_makeup="pelembab bibir";
        laciMakeup.jumlah_makeup=3;
        laciMakeup.tampilData_makeup();

        //condtruktor
        LaciMakeup lacimakeup2 = new LaciMakeup("dua","bedak Make over","bedak",2);
        lacimakeup2.tampilData_makeup2("*******************************************");




    }
}
