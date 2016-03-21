package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
     * Add Method
     * @param entry  time to be added
     */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * Remove Method
     * @param entry time to be removed
     */
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * Size Method
     */
    public int size() {
        return entries.size();
    }

    /**
     * Get Method
     * @param index into collection
     */
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}

