package Atividade11;

public class Noh {
    private Object info;
    private Noh next;

    public Noh(Object info) {
        this.info = info;
        this.next = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Noh getNext() {
        return next;
    }

    public void setNext(Noh next) {
        this.next = next;
    }
}
