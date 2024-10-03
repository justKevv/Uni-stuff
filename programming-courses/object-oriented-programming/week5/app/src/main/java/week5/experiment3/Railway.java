package week5.experiment3;

public class Railway {
    private String name;
    private String railwayClass;
    private Employee machinist;
    private Employee assistant;

    Railway(String name, String railwayClass, Employee machinist) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
    }

    Railway(String name, String railwayClass, Employee machinist, Employee assistant) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = assistant;
    }

    public String info() {
        String info = "";
        info += "Name: " + this.name + "\n";
        info += "Railway Class: " + this.railwayClass + "\n";
        info += "Machinist: " + this.machinist.info() + "\n";
        if (this.assistant != null) {
            info += "Assistant: " + this.assistant.info() + "\n";
        } else {
            info += "Assistant: Not assigned\n";
        }
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRailwayClass() {
        return railwayClass;
    }

    public void setRailwayClass(String railwayClass) {
        this.railwayClass = railwayClass;
    }

    public Employee getMachinist() {
        return machinist;
    }

    public void setMachinist(Employee machinist) {
        this.machinist = machinist;
    }

    public Employee getAssistant() {
        return assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
}
