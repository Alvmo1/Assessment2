package assessment2;

public class PC {
    public Case pcCase;
   public Motherboard motherBoard;
    public Monitor monitor;

    public PC(Case pcCase, Motherboard motherboard, Monitor monitor){
        this.pcCase = pcCase;
        this.motherBoard = motherboard;
        this.monitor = monitor;

    }

    private void drawLogo(int x, int y, String color){
        monitor.drawPixel(100, 50, "red");
    }
    public void description(PC pc){
        System.out.println("Welcome to worst buy below is the description of the PC on sale today...");
    }

    public void powerUp(Case pcCase){
       pcCase.pressPowerButton();
       drawLogo(100,50,"Red");
       motherBoard.loadProgram("");

    }
}
