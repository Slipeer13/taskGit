package cinema;

import java.util.ArrayList;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        ArrayList<Viewer> list = new ArrayList<>();
        Viewer viewer1 = new Viewer();
        Viewer viewer2 = new Viewer();
        Viewer viewer3 = new Viewer();
        Viewer viewer4 = new Viewer();
        Viewer viewer5 = new Viewer();
        viewer1.setAge(1);
        viewer2.setAge(2);
        viewer3.setAge(3);
        viewer4.setAge(4);
        viewer5.setAge(5);
        list.add(viewer1);
        list.add(viewer2);
        list.add(viewer3);
        list.add(viewer4);
        list.add(viewer5);
        int n = new ViewerStatistics().averageAge(list);
        System.out.println(n);
    }
}
