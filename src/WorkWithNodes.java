import java.io.*;
public class WorkWithNodes {
    public static void main(String [] args){
        try(
                InputStreamReader input = new InputStreamReader(System.in);
                BufferedReader buf = new BufferedReader(input);){

            while (true){
                System.out.println("enter the command: ");
                String isr = buf.readLine();
                String [] a = isr.split("\\s+");
                switch (a[0]){
                    case "exit" :
                        System.out.println("the program is closed");
                        return;
                    case "cf" :
                        File file = new File(a[1]);
                        file.createNewFile();
                        System.out.println("was add a file");
                        break;
                    case "cd" :
                        File directory = new File(a[1]);
                        directory.mkdir();
                        System.out.println("was add a directory");
                        break;
                    case "list" :
                        File lis = new File(a[1]);
                        String [] liss = lis.list();
                        for (String i : liss){
                            System.out.println(i);
                            break;
                        }
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
