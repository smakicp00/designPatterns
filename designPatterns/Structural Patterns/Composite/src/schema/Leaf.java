package schema;

public class Leaf extends Component{

    private int i;

    public Leaf(int i){
        this.i = i;
    }

    @Override
    public void execute() {
        System.out.println("Executing leaf");
        System.out.println("i = " + i);
    }
}
