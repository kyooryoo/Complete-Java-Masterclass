public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String valid = model.toLowerCase();
        // valid input of car model to only accept toyota and nissan as input
        if(valid.equals("toyota")||valid.equals("nissan")) this.model=model;
        else this.model = "Unknown";
    }

    public String getModel() {
        return this.model;
    }
}
