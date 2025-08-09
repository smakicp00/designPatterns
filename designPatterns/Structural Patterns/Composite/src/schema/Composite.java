package schema;

public class Composite extends Component{

    private Component[] components;

    public Composite(Component[] components){
        this.components = components;
    }

    public Component[] getComponents(){
        return components;
    }

    public void setComponents(Component[] components){
        this.components = components;
    }

    public void addComponent(Component component){
        Component[] newComponents = new Component[components.length + 1];
        for(int i = 0; i < components.length; i++){
            newComponents[i] = components[i];
        }
        newComponents[components.length] = component;
        components = newComponents;
    }

    public void removeComponent(Component component){
        Component[] newComponents = new Component[components.length - 1];
        int i = 0;
        for(; i < components.length; i++){
            if(components[i] != component){
                newComponents[i] = components[i];
            }
        }
    }

    @Override
    public void execute(){
        System.out.println("Executing composite");
        for(Component component : components){
            component.execute();
        }
    }
}
