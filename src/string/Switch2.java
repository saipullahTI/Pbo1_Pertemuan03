package string;

public class Switch2 {
    public static void main(String[] args) {
        char nilai = 'D';
        switch(nilai){
            case 'A':
                System.out.println(" Mhs    : \"Terima Kasih pak\"");
                System.out.println(" Dosen  : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println(" Mhs    : \"Kenapa Ulun kada dapat nilai A, Pak?\"");
                System.out.println(" Dosen  : \"hemmmmm");
                break;
            case 'C':
                System.out.println(" Mhs    : \"Ulun turun pull pak ai, tugas pull jua\"");
                System.out.println(" Dosen  : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println(" Mhs    : \"Hihihihi\"");
                break;
            default:
                System.out.println(" Mhs    : \"Ulun turun pull Pak ai, tugas pull jua\"");
                System.out.println(" Dosen  : \"Bujur jua Kah?\"");
                System.out.println(" Dosen  : \"memeriksa berkas\"");
                System.out.println(" Dosesn : \"menceleng\"");
                System.out.println(" Mhs    : \"Kabur..\"");
                break;
        }
    }
}
