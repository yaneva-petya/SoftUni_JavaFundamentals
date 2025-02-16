package ClassesAndObjects.Exercises.VehicleCatalogue;

public class Car {
    private String type;
    public String model;
    public String color;
    public int horsepower;
    public Car(){
        String type=" ";
        String model=" ";
        String color=" ";
        int horsepower=0;
    }
    public Car(String type, String model, String color, int horsepower){
        setType(type);
        setModel(model);
        setColor(color);
        setHorsepower(horsepower);
    }
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
