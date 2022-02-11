package cinema;

import java.util.List;

public class ViewerStatistics {

    public int averageAge(List<Viewer> viewers) {
        int count = 0;
        for (Viewer v:
             viewers) {
            count += v.getAge();
        }
        return count / viewers.size();

    }
}
