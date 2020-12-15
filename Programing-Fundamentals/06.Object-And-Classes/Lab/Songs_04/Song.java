package Songs_04;

public class Song {
    String songType;
    String name;
    String time;

    public String getSongType() {
        return songType;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public Song(String songType, String name, String time) {
        this.songType=songType;
        this.name =name;
        this.time = time;

    }
}
