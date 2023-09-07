package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public List<MusicArtist> getMembers() {return members;}
    public void setMembers(List<MusicArtist> members) {this.members = members;}

    public static void transferMembers(MusicBand bandA, MusicBand bandB){
        List<MusicArtist> membersAB = new ArrayList<>();
        List<MusicArtist> membersEmpty = new ArrayList<>();
        membersAB.addAll(bandB.getMembers());
        membersAB.addAll(bandA.getMembers());
        bandB.setMembers(membersAB);
        bandA.setMembers(membersEmpty);
    }

    public static String print(List<MusicArtist> members) {
        StringBuilder string = new StringBuilder("[ ");
        for (MusicArtist member : members) {
            string.append(member.getName()).append(" ").append(member.getAge()).append(" лет, ");
        }
        string.delete(string.length() - 2, string.length());
        return string + " ]";
    }

    public static void printMembers(MusicBand band){
        System.out.println(MusicBand.print(band.getMembers()));
    }
}
