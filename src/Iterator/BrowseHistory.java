package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    void push(String url){
        urls.add(url);
    };

    String pop(){
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    };

    Iterator createIterator(){
        return new ListIterator(this);
    }

    class ListIterator implements Iterator{
        private BrowseHistory history;
        private  int index;

        ListIterator(BrowseHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }


        @Override
        public void next() {
            index++;
        }
    }
}
