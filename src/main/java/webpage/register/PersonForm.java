package webpage.register;

import javax.validation.constraints.NotNull;
public class PersonForm {
    @NotNull
    private String name;

    @NotNull
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonForm [id=" + id + ", name=" + name + "]";
    }
    
}