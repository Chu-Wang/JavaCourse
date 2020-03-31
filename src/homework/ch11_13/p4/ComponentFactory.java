package homework.ch11_13.p4;

/**
 * @author WangMingMing
 * @creat 2020-03-17 9:10
 */
public class ComponentFactory {
    public ComponentFactory(){

    }
    public static Component creat(){
        int id = 0;
        Component computer = new CompositeComponent(id++, "Think pad", 0.0);
        Component keyboard = new AtomicComponent(id++, "Keyboard", 20.0);
        Component mouse = new AtomicComponent(id++, "Mouse", 20.0);
        Component monitor = new AtomicComponent(id++, "Monitor", 1000.0);
        computer.add(keyboard);
        computer.add(mouse);
        computer.add(monitor);

        Component mainFrame = new CompositeComponent(id++, "Main frame", 0.0);
        Component hardDisk = new AtomicComponent(id++, "Hard disk", 1000);
        Component powerSupplier = new AtomicComponent(id++, "Power supplier", 500);
        mainFrame.add(hardDisk);
        mainFrame.add(powerSupplier);

        Component mainBoard = new CompositeComponent(id++, "Main board", 0.0);
        Component cpu = new AtomicComponent(id++, "CPU", 1500.0);
        Component videoCard = new AtomicComponent(id++, "Video card", 900);
        Component networkCard = new AtomicComponent(id++, "Network card", 100);
        mainBoard.add(cpu);
        mainBoard.add(videoCard);
        mainBoard.add(networkCard);

        mainFrame.add(mainBoard);
        computer.add(mainFrame);
        return computer;
    }
}
