public class guru {
    //variabel
    int nip;
    String nama, mapel, status;

    //constructor
    public guru(){
        nip=0;
        nama= "kosong";
        mapel= "kosong";
        status="kosong";
    }

        //constructor Parameter
        public guru(int i, String n, String m, String s) {
            nip = i;
            nama = n;
            mapel = m;
            status = s;
        }

        
        //Getter
        //Setter
        //Method
        public void print () {
            System.out.println("NIP: " + nip);
            System.out.println("NAMA: " + nama);
            System.out.println("MAPEL: " + mapel);
            System.out.println("STATUS: " + status);
        }
    }
    


