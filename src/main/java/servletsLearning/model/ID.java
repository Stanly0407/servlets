package servletsLearning.model;

public abstract class ID {
 protected int id;

    public ID(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
