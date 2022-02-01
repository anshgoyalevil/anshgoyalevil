import java.util.*;

public class ProgramJava {

    public static void main(String[] args) {

        // System.in and System.out are input and output streams, respectively.

        Scanner sc=new Scanner(System.in);

        int clients = sc.nextInt();

        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>(clients);
        HashSet<String> h = new HashSet<String>();

        for (int i = 0; i<clients*2; i++){

            arr.add(new ArrayList<String>());

        }

        for (int i = 0; i<clients*2; i++){

            int ing = sc.nextInt();

            for (int j = 0; j<ing; j++){

                arr.get(i).add(j, sc.next());

            }

        }

        for (int i = 0; i<clients*2; i++){

            for (int j = 0; j<arr.get(i).size(); j++){

                if (i%2==0){
                    h.add(arr.get(i).get(j));
                }

            }

        }

        for (int i = 0; i<clients*2; i++){

            for (int j = 0; j<arr.get(i).size(); j++){

                if (i%2!=0){
                    h.remove(arr.get(i).get(j));
                }

            }

        }

        Iterator itr = h.iterator();

        System.out.print(h.size()+ " ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
