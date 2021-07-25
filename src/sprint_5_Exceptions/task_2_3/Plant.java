package sprint_5_Exceptions.task_2_3;

public class Plant{
    private String name;
    private Color color;
    private Type type;

    public Plant(String type, String color, String name) throws Exception{
        try {
            this.type = Type.valueOf(type.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new TypeException("Invalid value " + type + " for field type");
        }

        try{
            this.color = Color.valueOf(color.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new ColorException("Invalid value " + color + " for field color");
        }
        this.name = name;
    }

    public static Plant tryCreatePlant(String type, String color, String name) throws Exception{
        try {
            return new Plant(type, color, name);
        }catch (TypeException e){
            return tryCreatePlant("ORDINARY", color, name);
        }catch (ColorException e){
            return tryCreatePlant(type, "RED", name);
        }
    }

    public String getName(){
        return name;
    }

    public Color getColor(){
        return color;
    }

    public Type getType(){
        return type;
    }

    @Override
    public String toString(){
        return String.format("{type: %s, color: %s, name: %s}", type, color, name);
    }
}
