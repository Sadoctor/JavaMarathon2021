package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public List<String> getMembers() {return members;}
    public void setMembers(List<String> members) {this.members = members;}

    public static void transferMembers(MusicBand bandA, MusicBand bandB){

//        for(String member : bandA.getMembers())
//            bandB.getMembers().add(member);
//        bandA.getMembers().clear();

//        List<String> membersAB = new ArrayList<>();
//        List<String> membersEmpty = new ArrayList<>();
//        membersAB.addAll(bandB.getMembers());
//        membersAB.addAll(bandA.getMembers());
//        bandB.setMembers(membersAB);
//        bandA.setMembers(membersEmpty);

        bandB.getMembers().addAll(bandA.getMembers());
        bandA.getMembers().clear();
    }

    public static void printMembers(MusicBand band){
        System.out.println(band.getMembers());
    }


}
