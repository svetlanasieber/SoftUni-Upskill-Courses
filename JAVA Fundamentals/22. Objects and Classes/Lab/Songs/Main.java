import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {

            
            String[] data = scanner.nextLine().split("_");

         
            String typeList = data[0];
            String name = data[1];
            String time = data[2];

          
            Song currentSong = new Song();
        
            currentSong.setTypeList(typeList);
            currentSong.setName(name);
            currentSong.setTime(time);

            songs.add(currentSong);

        }

        String typeListToShow = scanner.nextLine();

        if(typeListToShow.equals("all")){
            for(Song song : songs){
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songs){
                if(song.getTypeList().equals(typeListToShow)){
                    System.out.println(song.getName());
                }
            }
        }


    }
}
