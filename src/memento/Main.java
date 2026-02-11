package memento;

public class Main {
    void main() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.creatState());

        editor.setContent("b");
        history.push(editor.creatState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
