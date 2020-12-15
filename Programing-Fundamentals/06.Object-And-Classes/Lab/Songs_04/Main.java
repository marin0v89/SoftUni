package Songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String []inputSong = scan.nextLine().split("_");
            String songType = inputSong[0];
            String name = inputSong[1];
            String time = inputSong[2];

            Song song = new Song (songType,name,time);
            songs.add(song);
        }
        String songType = scan.nextLine();
        for (Song song : songs) {
            if (songType.equals(song.getSongType())){
                System.out.println(song.getName());
            }else if ("all".equals(songType)){
                System.out.println(song.getName());
            }
        }
    }
}
