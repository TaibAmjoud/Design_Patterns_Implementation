package state;

public class Canvas {
    private Tool currentTool;

    void mouseDown(){
        currentTool.mouseDown();
    }
    void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool(){
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
